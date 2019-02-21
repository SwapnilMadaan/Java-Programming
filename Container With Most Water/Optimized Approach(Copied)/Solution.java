class Solution {
   public int maxArea(int[] height) {
        int max = 0;
        int s = 0;
        int l = height.length - 1;
        while(s<l){
            int waterSize = (l - s)*Math.min(height[l], height[s]);
            if(waterSize > max){
                max = waterSize;
            }
            int start = height[s];
            int end = height[l];
            if(start > end)
                l--;
            else
                s++;
        }
        return max;
    }

}
