class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []a=new int[2];
       for(int i=0;i<nums.length;i++){
          int ans=target-nums[i];
          for(int j=1;j<nums.length;j++){
             if(ans==nums[j] && i!=j){
               a[0]=i;
               a[1]=j;
               Arrays.sort(a);
            }

          }
         
       } 
       return a;
    }
}
