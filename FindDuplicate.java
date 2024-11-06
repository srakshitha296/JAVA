import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] array = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!res.contains(array[i])) {
                        res.add(array[i]);
                    }
                    break; 
                }
            }
        }

        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
