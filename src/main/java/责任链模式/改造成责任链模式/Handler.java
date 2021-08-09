package 责任链模式.改造成责任链模式;

import 责任链模式.IWomen;

/**
 * @Author:chengzhi
 * @Date:2021/8/9 21:42
 * @Description 系社会，那就是男性有至高权利，handler控制权
 */
public abstract class Handler {
    //能处理的级别
    private int level = 0;

    //责任传递，下一个人责任人是谁
    private Handler nextHandler;

    //每个类都要说明一下自己能处理哪些请求

    public Handler(int level) {
        this.level = level;
    }

    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if(women.getType() == this.level){
            this.response(women);
        }else {
            if(this.nextHandler != null){
                //有后续责任人，才能向后传递请求
                this.nextHandler.HandleMessage(women);
            }else {
                //已经没有后续处理人了
                System.out.println("-----------没地方请示了，不做处理！---------\n");
            }
        }
    }

    /*
     * 如果不属于你处理的返回，你应该让她找下一个环节的人，比如
     * 女儿出嫁了，还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    //有请示那当然要回应
    public abstract void response(IWomen women);


    //有没有看到，其实在这里也用到模版方法模式，在模版方法中判断请求的级别和当前能够处理的级别，
    //如果相同则调用基本方法，做出反馈；如果不相等，则传递到下一个环节，由下一环节做出回应。
}
