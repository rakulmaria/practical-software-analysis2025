package exercises;

public final class BinarySearch {

    public static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = midpoint(low, high);       
            int midVal = a[mid];
            if (midVal < key)      low = mid + 1;
            else if (midVal > key) high = mid - 1;
            else return mid;
        }
        return -(low + 1);
    }

    
    static int midpoint(int low, int high) {
        return (low + high) / 2;                
    }
}
