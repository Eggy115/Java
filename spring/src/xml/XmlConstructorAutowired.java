package xml;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Constructor DI injection Hello World using XML config
 *
 * Created by vvedenin on 11/14/2015.
 */
public class XmlConstructorAutowired {
    public static class Notifier {
        private final NotificationService service;

        @Autowired
        public Notifier(NotificationService service) {
            this.service = service;
        }

        public void send(String message) {
            service.send("email: " + message);
        }
    }

    public static class EMailService implements NotificationService {
        public void send(String message) {
            System.out.println("I send " + message);
        }
    }

    public interface NotificationService {
        void send(String message);
    }

    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "constructorAutowired.xml");
        Notifier notifier =  context.getBean(Notifier.class);
        notifier.send("Hello world!"); // Print "I send email: Hello world!"
    }
}
