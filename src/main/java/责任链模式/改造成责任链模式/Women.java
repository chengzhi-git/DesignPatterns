package 责任链模式.改造成责任链模式;

import 责任链模式.IWomen;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 21:57
 * @Description Women 类的接口没有任何变化，实现类少有变化，
 */
public class Women implements IWomen {

    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---夫死
     */
    private int type=0;

    //妇女的请示
    private String request = "";

    public Women(int type, String request) {
        this.type = type;

        //为了显示好看点，我在这里做了点处理
        switch(this.type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
