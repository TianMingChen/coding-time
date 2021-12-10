/**
 * @ClassName : test11  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/28  15:19
 */

public class test11 {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=Math.min(height[n-1],height[0])*(n-1);
        int left=0;
        int right=n-1;
        n--;
        while (left<right){
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            n--;
            maxArea=Math.max(Math.min(height[right],height[left])*(n),maxArea);

        }
        return maxArea;
    }
}
