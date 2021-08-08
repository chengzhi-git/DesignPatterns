package 策略模式;

/**
 * @Author:chengzhi
 * @Date:2021/7/17 21:28
 * @Description
 */
public class Cat{
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
