// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
        }
        System.out.println("Сформирован следующий список чисел: " + list1);
        System.out.println("Максимальное значение в списке: " + Collections.max(list1));
        System.out.println("Минимальное значение в списке: " + Collections.min(list1));
        System.out.println("Среднее врифметическое списка: " + average(list1));
    }
    static double average (ArrayList<Integer> list1) {
        
        double sum = 0;
        
        for(int i = 0;i < list1.size(); i++) {
            sum += list1.get(i);
        }
        return sum / list1.size();
    }
}
