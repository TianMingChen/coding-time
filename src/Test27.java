import java.util.HashSet;

/**
 * @ClassName : test27  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/15  9:28
 */

public class Test27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                n--;
                nums[i] = nums[n];
                i--;

            }
        }
        return n;
    }


}
