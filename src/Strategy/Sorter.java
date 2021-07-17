package Strategy;

/**
 * @Author:chengzhi
 * @Date:2021/7/15 19:38
 * @Description
 */
public class Sorter {
    public static void sort(Compareble[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }
    static void swap(Compareble[] arr, int i, int j){
        Compareble comparable = arr[i];
        arr[i] = arr[j];
        arr[j] = comparable;
    }
}
