package arrays.search;

public class BinarySearch implements IntegerSearch {

    @Override
    public int search(Integer[] array, Integer toSearch) {
        int start = 0, end = array.length - 1, mid = 0;
        boolean found = false;
        while(start < end) {
            mid = (start + end) / 2;
            // System.out.println("-------------------------------");
            // System.out.println("Start - " + start);
            // System.out.println("End - " + end);
            // System.out.println("Mid - " + mid);
            if (array[mid].intValue() == toSearch.intValue()) {
                found = true;
                break;
            } else if (array[mid].intValue() < toSearch.intValue()) {
                start = mid + 1;
            } else if (array[mid].intValue() > toSearch.intValue()) {
                end = mid - 1;
            }
        }
        if (!found) {
            mid = -1;
        }
        return mid;
    }
    
}
