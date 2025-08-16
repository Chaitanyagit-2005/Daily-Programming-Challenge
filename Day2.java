class Day2 {
    public static int missingNum(int[] arr) {
        long n = arr.length + 1;

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long expectedSum = n * (n + 1) / 2;

        return (int)(expectedSum - sum);
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Missing number: " + missingNum(arr1)); // 3
    }
}
