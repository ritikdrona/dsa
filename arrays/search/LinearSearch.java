package arrays.search;

public class LinearSearch implements IntegerSearch {

    @Override
    public int search(Integer[] array, Integer toSearch) {
        int i;
        for(i = 0; i < array.length; i++) {
            if (array[i].intValue() == toSearch.intValue()) {
                break;
            }
        }
        if (i == array.length) {
            i = -1;
        }
        return i;
    }
    
}
