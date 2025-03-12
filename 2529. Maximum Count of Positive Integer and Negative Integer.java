class Solution {
    public int maximumCount(int[] nums) {
        int posNum=0;
        int negNum=0;
        int max=0;
        for (int a : nums){
            if(a>0){
                posNum++;
            }else if(a<0){
                negNum++;
            }
        }
        max=Math.max(posNum,negNum);
        return max;
    }
}
