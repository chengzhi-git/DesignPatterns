package Mediator;

/**
 * author: chengzhi
 * date: 2021/8/6 14:04
 * description:
 */
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    public void send() {
        System.out.println("具体同事类1发送请求");
        mediator.relay(this);
    }
}
