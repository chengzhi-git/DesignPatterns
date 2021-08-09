package 责任链模式;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 20:22
 * @Description 我们使用数字来代表女性的不同状态，1 是未结婚，2 是已经结婚的，而且丈夫建在，3 是丈夫去世了
 * 的。我们再来看有处理权的人员接口：
 * 父亲、丈夫、儿子都是这个 IHandler 接口的实现者：
 */
public interface IHandler {

    ////一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
