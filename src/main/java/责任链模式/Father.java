package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:49
 * @Description
 */
public class Father implements IHandler {

    public void HandleMessage(IWomen woemn) {
        System.out.println("女儿的请示是："+woemn.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
