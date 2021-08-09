package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:53
 * @Description 儿子类
 */
public class Son implements IHandler{
    //母亲向儿子请示
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
