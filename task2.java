// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Iterator;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
        }
        System.out.println("Сформирован следующий список чисел: " + list1);
        for (Iterator<Integer> itr = list1.iterator(); itr.hasNext(); ) {
            if (itr.next() % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println("Четные элементы удалены: " + list1);
    }
}
