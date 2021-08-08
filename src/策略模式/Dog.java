package 策略模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/17 22:03
 * @Description
 */
public class Dog {

    int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
