
public interface sort_merge {
    public static int[] sortArray(int[] array1) {
        if (array1 == null) {
            return null;
        }
        int length_arr = array1.length / 2;

        if (array1.length < 2) {
            return array1;
        }
        if (array1.length % 2 != 0){
            length_arr += 1;
        }
        int[] array2 = new int[length_arr];
        int[] array3 = new int[array1.length / 2];
        for (int i = 0; i < array1.length / 2; i++) {
            array3[i] = array1[i];
        }
            for (int i = array1.length / 2; i < array1.length; i++) {
                array2[i - array1.length / 2] = array1[i];
            }
        array3 = sortArray(array3);
        array2 = sortArray(array2);

        return mergeArray(array3, array2);
    }
    

    public static int[] mergeArray(int[] array3, int[] array2) {

        int[] array4 = new int[array3.length + array2.length];
        int pos3 = 0, pos2 = 0;

        for (int i = 0; i < array4.length; i++) {
            if (pos3 < array3.length && pos2 < array2.length) {
                if (array3[pos3] < array2[pos2]) {
                    array4[i] = array3[pos3];
                    pos3++;
                } else {
                    array4[i] = array2[pos2];
                    pos2++;
                }
            } else if (pos3 == array3.length && pos2 < array2.length) {
                array4[i] = array2[pos2];
                pos2++;
            }
            else if (pos3 < array3.length && pos2 == array2.length) {
                array4[i] = array3[pos3];
                pos3++;
            }else{
                array4[i] = 0;
            }
        }
        return array4;
    }
}