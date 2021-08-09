package 责任链模式.改造成责任链模式;

import 责任链模式.IWomen;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 21:53
 * @Description
 */
public class Father extends Handler {
    //父亲只处理女儿的请求
    public Father() {
        super(1);
    }
    //父亲的答复
    @Override
    public void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
