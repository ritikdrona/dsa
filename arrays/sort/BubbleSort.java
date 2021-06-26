package arrays.sort;

public class BubbleSort implements IntegerSort {
    @Override
    public Integer[] sort(Integer[] array) {
        Integer temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].intValue() > array[j+1].intValue()) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
