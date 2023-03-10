// // Реализовать алгоритм сортировки слиянием

public class task1{
    
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 12, 3, 5, 23, 632};
        int[] arr = array1;
        if (array1.length > 2) {
            array1 = sort_merge.sortArray(array1);
        }
        System.out.println("Было");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Стало");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
}
}