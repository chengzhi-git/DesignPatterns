package 装饰模式.普通方法;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 20:31
 * @Description
 * 对这个成绩单进行美化
 * Sugar这个词太好了，名词是糖的意思，动词就是美化
 * 给你颗糖你还不美去
 */
public class SugarFourGradeSchoolReport extends FourthGradeSchoolReport{
    //首先定义你要美化的方法，先给老爸说学校最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75分，数学是78分，自然是80分");
    }

    //在老爸看完成绩单后，我再汇报学校的排名情况
    private void  reportSort() {
        System.out.println("我的排名第38名");
    }

    //汇报的内容已经发生变更，所以要重写父类

    @Override
    public void report() {
        this.reportHighScore();//先说最高成绩
        super.report();//然后老爸看成绩单
        this.reportSort();//然后告诉老爸学习学校排名
    }
}
