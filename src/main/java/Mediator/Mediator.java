package Mediator;

/**
 * author: chengzhi
 * date: 2021/8/6 13:54
 * description:
 * 抽象中介者
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl);//转发
}
