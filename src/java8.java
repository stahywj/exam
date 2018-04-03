import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class java8 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                nums.add(null);
            }
            nums.add(i);
        }
        nums.add(null);
        System.out.println(nums);
        System.out.println("sum is:"+nums.stream().filter(num -> num != null).
                distinct().mapToInt(num -> num * 2).
                peek(System.out::println).skip(2).limit(4).sum());
        System.out.println("test");
    }
}
