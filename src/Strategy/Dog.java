package Strategy;

/**
 * @Author:chengzhi
 * @Date:2021/7/17 22:03
 * @Description
 */
public class Dog implements Compareble<Dog> {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food < d.food) return -1;
        else if(this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
