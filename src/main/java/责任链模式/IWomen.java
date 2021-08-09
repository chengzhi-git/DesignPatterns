package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:16
 * @Description 古代悲哀女性的总称
 */
public interface IWomen {
    //获得个人状况
    int getType();

    //获得个人请示，你要干什么?
    String getRequest();
}
