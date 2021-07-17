package Strategy;

import java.util.Arrays;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 19:37
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Compareble[] a = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
