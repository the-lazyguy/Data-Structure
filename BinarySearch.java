package binary.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 33;
        
        int left = 0;
        int right = arr.length - 1;
        int middle;
        boolean found = false;

        while (left <= right) {
            middle = left + (right - left) / 2;

            if (arr[middle] == target) {
                System.out.println("Element " + target + " found at index " + middle);
                found = true;
                break;
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found.");
        }
    }
}
