package Basics;
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = interpolationSearch(arr, 8);
        System.out.println("Result: " + result);
    }

    public static int interpolationSearch(int[] arr, int search) {
        int index = -1;
        int high = arr.length - 1;
        int low = 0;

        while (low <= high && search >= arr[low] && search <= arr[high]) {
            int probe = low + ((search - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            System.out.println("probe: " + probe);

            if (arr[probe] == search) {
                return probe;
            } else if (arr[probe] < search) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return index;
    }
}
