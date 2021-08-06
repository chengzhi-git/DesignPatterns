package Mediator;

/**
 * author: chengzhi
 * date: 2021/8/6 14:04
 * description:
 */
public class ConcreteColleague2 extends Colleague {
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    public void send() {
        System.out.println("具体同事类2发送请求");
        mediator.relay(this);
    }
}
