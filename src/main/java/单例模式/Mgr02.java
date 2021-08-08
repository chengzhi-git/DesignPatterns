package 单例模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 15:34
 * @Description 等同于Mgr01
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {}

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();

        System.out.println(m1 == m2);
    }

}
