class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int idx =n-1;
        int[] result = new int[n];
        while(left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare<rightSquare){
                result[idx] = rightSquare;
                idx--;
                right--;
            }
            else{
                result[idx] = leftSquare;
                idx--;
                left++;
            }
        }
        return result;
    }
}
