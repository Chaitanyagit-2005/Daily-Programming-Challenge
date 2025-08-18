import java.util.Arrays;

public class Day4 {
    
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int total = m + n;
        int gap = (total + 1) / 2; 

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < total) {
                
                if (i < m && j < m) {
                    if (arr1[i] > arr1[j]) {
                        swap(arr1, i, arr1, j);
                    }
                }
                
                else if (i < m && j >= m) {
                    if (arr1[i] > arr2[j - m]) {
                        swap(arr1, i, arr2, j - m);
                    }
                }
               
                else {
                    if (arr2[i - m] > arr2[j - m]) {
                        swap(arr2, i - m, arr2, j - m);
                    }
                }
                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;  
        }
    }

    private static void swap(int[] arrA, int i, int[] arrB, int j) {
        int temp = arrA[i];
        arrA[i] = arrB[j];
        arrB[j] = temp;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

    }
}
