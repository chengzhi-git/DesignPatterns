package Mediator;

/**
 * author: chengzhi
 * date: 2021/8/6 13:58
 * description:
 * 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();

    public abstract void send();
}
