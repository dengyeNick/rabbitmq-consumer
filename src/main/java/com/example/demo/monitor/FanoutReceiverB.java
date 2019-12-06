package com.example.demo.monitor;

        import org.springframework.amqp.rabbit.annotation.RabbitHandler;
        import org.springframework.amqp.rabbit.annotation.RabbitListener;
        import org.springframework.stereotype.Component;

        import java.util.Map;

/**
 * Company: 十亿网络科技
 * Author: dengy
 * Email: 3291134235@qq.com
 * CreateTime: 2019年12月05日 11时40分
 * Description: <p></p>
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverB消费者收到消息  : " + testMessage.toString());
    }

}
