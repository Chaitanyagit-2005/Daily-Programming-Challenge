class Day3{
    public int findDuplicate(int[] arr) {
        
        int slow = arr[0];
        int fast = arr[0];
        
        do {
            slow = arr[slow];       
            fast = arr[arr[fast]];  
        } while (slow != fast);
        
       
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        
        return slow; 
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + sol.findDuplicate(arr));
    }
}
