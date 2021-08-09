package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:52
 * @Description 丈夫类
 */
public class Husband implements IHandler {
    //妻子向装夫请示
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
