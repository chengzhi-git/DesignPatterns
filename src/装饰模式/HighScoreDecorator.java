package 装饰模式;

import 装饰模式.Decorator;
import 装饰模式.普通方法.SchoolReport;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 20:50
 * @Description
 * Decorator 抽象类的目的很简单，就是要让子类来对封装 SchoolReport 的子类，怎么封装？重写
 * report 方法！先看 HighScoreDecorator 实现类：
 *
 * 我要把我学校的最高成绩告诉老爸
 */
public class HighScoreDecorator extends Decorator {

    //构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //最高成绩我要做老爸看成绩单前告诉他，否则等他一看，就抡起笤帚有揍我，我那还有机会说呀
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
