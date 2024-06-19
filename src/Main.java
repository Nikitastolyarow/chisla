import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();
        for (int num : intList) {
            if (num > 0 && num % 2 == 0 ) {
                filteredList.add(num);
            }
        }
        Collections.sort(filteredList);
        System.out.println("Отфильтрованные значения: " );
        for (int num : filteredList) {
            System.out.println(num);
        }
    }
}
