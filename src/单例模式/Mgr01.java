package 单例模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 15:31
 * @Description
 * @Description 饿汉式，JVM保证线程安全，JVM加载到内存一个实例
 * Class.forName("")之加载到内存，不实例化
 * 缺点 不管用到与否，类装在时就完成实例化
 * 比较实用的写法
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){}

    public static Mgr01 getInstance(){return INSTANCE;}

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
