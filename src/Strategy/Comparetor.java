package Strategy;

/**
 * @Author:chengzhi
 * @Date:2021/7/18 16:48
 * @Description
 */

@FunctionalInterface
public interface Comparetor<T> {
    int compare(T o1, T o2);

    default void m(){
        System.out.println("m");
    }
}
