package 责任链模式.改造成责任链模式;

import 责任链模式.IWomen;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 21:55
 * @Description
 */
public class Son extends Handler {
    //儿子只处理母亲的请求
    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
            System.out.println("--------母亲向儿子请示-------");
            System.out.println(women.getRequest());
            System.out.println("儿子的答复是：同意\n");
    }
}
