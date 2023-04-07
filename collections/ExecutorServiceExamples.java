/**
 * Copyright (c) 2016-2019 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.example.services;

import java.io.Serializable;
import java.util.Collections;
import java.util.concurrent.Callable;

import org.redisson.Redisson;
import org.redisson.RedissonNode;
import org.redisson.api.RExecutorService;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.api.annotation.RInject;
import org.redisson.config.Config;
import org.redisson.config.RedissonNodeConfig;

public class ExecutorServiceExamples {

    public static class RunnableTask implements Runnable, Serializable {

        @RInject
        RedissonClient redisson;

        @Override
        public void run() {
            RMap<String, String> map = redisson.getMap("myMap");
            map.put("5", "11");
        }
        
    }
    
    public static class CallableTask implements Callable<String>, Serializable {

        @RInject
        RedissonClient redisson;
        
        @Override
        public String call() throws Exception {
            RMap<String, String> map = redisson.getMap("myMap");
            map.put("1", "2");
            return map.get("3");
        }

    }
    
    public static void main(String[] args) {
        Config config = new Config();
        config.useClusterServers()
            .addNodeAddress("127.0.0.1:7001", "127.0.0.1:7002", "127.0.0.1:7003");
        
        RedissonClient redisson = Redisson.create(config);
        redisson.getKeys().flushall();

        RedissonNodeConfig nodeConfig = new RedissonNodeConfig(config);
        nodeConfig.setExecutorServiceWorkers(Collections.singletonMap("myExecutor", 1));
        RedissonNode node = RedissonNode.create(nodeConfig);
        node.start();

        RExecutorService e = redisson.getExecutorService("myExecutor");
        e.execute(new RunnableTask());
        e.submit(new CallableTask());
        
        e.shutdown();
        node.shutdown();
        redisson.shutdown();
    }
    
}
