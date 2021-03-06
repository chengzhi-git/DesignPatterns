package Mediator;

/**
 * author: chengzhi
 * date: 2021/8/6 13:35
 * description:
 */
public class MediatorParttern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1,c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();

        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("--------------");
        c2.send();
    }
}
