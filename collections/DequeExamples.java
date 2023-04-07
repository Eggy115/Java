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
package org.redisson.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.redisson.Redisson;
import org.redisson.api.RDeque;
import org.redisson.api.RQueue;
import org.redisson.api.RedissonClient;

public class DequeExamples {

    public static void main(String[] args) {
        // connects to 127.0.0.1:6379 by default
        RedissonClient redisson = Redisson.create();

        RDeque<String> deque = redisson.getDeque("myQueue");
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        
        deque.contains("1");
        deque.peek();
        deque.poll();
        deque.element();
        
        for (String string : deque) {
            // iteration through bulk loaded values
        }
        
        boolean removedValue = deque.remove("1");
        deque.removeAll(Arrays.asList("1", "2", "3"));
        deque.containsAll(Arrays.asList("4", "1", "0"));
        
        List<String> secondList = new ArrayList<>();
        secondList.add("4");
        secondList.add("5");
        deque.addAll(secondList);

        RQueue<String> secondQueue = redisson.getQueue("mySecondQueue");
        
        deque.pollLastAndOfferFirstTo(secondQueue.getName());
        
        deque.addLast("8");
        deque.addFirst("9");
        
        deque.addLast("30");
        deque.addFirst("80");
        
        String firstValue = deque.pollFirst();
        String lastValue = deque.pollLast();
        
        String peekFirstValue = deque.peekFirst();
        String peekLastValue = deque.peekLast();
        
        String firstRemoved = deque.removeFirst();
        String lastRemoved = deque.removeLast();
        
        redisson.shutdown();
    }
    
}
