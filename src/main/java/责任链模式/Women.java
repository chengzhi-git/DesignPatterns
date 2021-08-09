package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:17
 * @Description 女性就两个参数，一个是当前的个人状况，是结婚了呢还是没结婚，丈夫有没有去世，另外一个是要
 * 请示的内容，要出去逛街呀还是吃饭，我们看实现类：
 */
public class Women implements IWomen {

    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---夫死
     */
    private int type = 0;

    //妇女的请示
    private String request = "";

    //构造函数传递过来请求

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    //获得自己的状况
    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
