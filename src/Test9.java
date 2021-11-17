/**
 * @ClassName : Test9  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/16  16:17
 */

public class Test9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str=String.valueOf(x);
        String str2= new StringBuilder(str).reverse().toString();
        if (str.equals(str2)){
            return true;
        }
        else return false;


    }
}
