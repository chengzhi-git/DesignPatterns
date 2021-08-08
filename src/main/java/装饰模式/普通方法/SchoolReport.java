package 装饰模式.普通方法;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 20:18
 * @Description 成绩单的抽象类
 */
public abstract class SchoolReport {
    //成绩单的主要展示的是成绩情况
    public abstract void report();

    //成绩单要家长签字
    public abstract void sign(String name);
}
