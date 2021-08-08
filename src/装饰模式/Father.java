package 装饰模式;

import 装饰模式.普通方法.FourthGradeSchoolReport;
import 装饰模式.普通方法.SchoolReport;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 21:04
 * @Description
 */
public class Father {
    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr;
        sr = new FourthGradeSchoolReport(); //原装的成绩单

        //加 了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);

        //又加了成绩排名的说明
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();

        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
