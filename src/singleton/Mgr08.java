package singleton;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 18:51
 * @Description 解决线程同步，防止反序列化（一个类加载到内存，可以new一个实例叫反序列化，枚举类没有构造方法，无法反序列化）
 * effectivejava
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            new Thread(()->{
                System.out.println(Mgr08.INSTANCE);
            }).start();
        }
    }
}
