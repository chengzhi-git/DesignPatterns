package 策略模式;

import java.util.Arrays;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 19:37
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Dog> dogSorter = new Sorter<>();
        dogSorter.sort(a,(o1,o2) -> {
            if(o1.food < o2.food) return -1;
            else if (o1.food > o2.food) return 1;
            else
                return 0;
        });
        System.out.println(Arrays.toString(a));

        Comparetor<Integer> com = (x,y) -> {
            //System.out.println("");
            return Integer.compare(x, y);
        };
    }
}
