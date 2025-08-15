public class Day1 {
    public static int[] sort0s1s2s(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};
        int[] sorted = sort0s1s2s(arr);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
