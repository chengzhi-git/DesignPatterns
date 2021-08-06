package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chengzhi
 * date: 2021/8/6 13:55
 * description:
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<Colleague>();

    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if(!ob.equals(cl)) {
                ((Colleague)ob).receive();
            }
        }
    }
}
