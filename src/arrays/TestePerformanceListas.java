package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformanceListas {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i * 100);
        }
        long fimArray = System.currentTimeMillis();

        long inicioLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(1 * 100);
        }
        long fimLinked = System.currentTimeMillis();

        System.out.println("ArrayList - Tempo de acesso: " + (fimArray - inicioArray) + "ms");
        System.out.println("LinkedList - tempo de acesso: " + (fimLinked - inicioLinked) + "ms");
    }
}
