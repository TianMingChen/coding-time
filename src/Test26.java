/**
 * @ClassName : Test26  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/15  19:10
 */

public class Test26 {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return n;
        }
        int t=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[t]=nums[i];
                t++;
            }
        }
        return t;

    }
}
