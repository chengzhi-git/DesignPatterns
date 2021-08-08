package 装饰模式.普通方法;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 20:29
 * @Description 老爸看成绩单了
 * 继承的方式连续继承来新增功能提高了维护的成本
 * Decoratoe继承自一个需要被装饰的基础类
 * 使用装饰模式，如果想新增功能，直接添加子类，统一继承自同一父类Decorator
 */
public class Father {
    public static void main(String[] args) {
        //装饰美化之前
        FourthGradeSchoolReport schoolReport = new FourthGradeSchoolReport();
        schoolReport.report();
        //签名？休想！

        //装饰美化
        SchoolReport schoolReport1 = new SugarFourGradeSchoolReport();
        schoolReport1.report();
        //然后老爸，一看，很开心，就签名了
        schoolReport1.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
