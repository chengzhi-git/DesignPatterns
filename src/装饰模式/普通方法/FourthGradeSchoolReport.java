package 装饰模式.普通方法;

/**
 * @Author:chengzhi
 * @Date:2021/8/8 20:22
 * @Description 四年级的成绩单，这个是我们学校第一次实施，以前没有干过这种“缺德”事。
 */
public class FourthGradeSchoolReport extends SchoolReport{
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
