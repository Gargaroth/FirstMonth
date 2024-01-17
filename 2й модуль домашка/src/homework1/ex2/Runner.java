package homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,2,4);
        List<Integer> list2 = List.of(7, 10);
        List<Integer> finalList = new ArrayList<>();

        finalList.addAll(list);
        finalList.addAll(list2);
        finalList.remove(3);
        System.out.println(finalList.indexOf(10));

    }
}
