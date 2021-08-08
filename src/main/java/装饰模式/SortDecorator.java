package 装饰模式;

import 装饰模式.Decorator;
import 装饰模式.普通方法.SchoolReport;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 21:02
 * @Description 学校排名的情况汇报
 */
public class SortDecorator extends Decorator {

    //构造函数
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    //老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
