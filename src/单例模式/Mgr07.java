package 单例模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 18:36
 * @Description //懒加载，保证只有一个实例
 * 静态内部类的写法
 */
public class Mgr07 {
    private Mgr07() {}

    //加载外部类，不会加载内部类，只有调用时候会加载
    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    //此时才会加载内部类
        public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
        }

        public void m() {
            System.out.println("m");
        }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();

        }
    }
}
