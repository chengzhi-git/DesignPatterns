package 单例模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 18:31
 * @Description 双重检查单例
 */
public class Mgr06 {
    //指令重排问题
    private static volatile Mgr06 INSTANCE;

    private Mgr06() {}

    public static Mgr06 getInstance() {
        if(INSTANCE == null){
            synchronized (Mgr06.class){
                if(INSTANCE == null){
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();

        }
    }
}
