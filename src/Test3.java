/**
 * @ClassName : test1  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/10/13  9:27
 */
import java.util.HashSet;
public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character>  hashSet=new HashSet<Character>();
        int left=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            while(hashSet.contains(s.charAt(i))){
                maxLength=Math.max(maxLength,i-left);
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(i));
        }
        maxLength=Math.max(maxLength,s.length()-left);
        if(maxLength==0) return 1;
        return maxLength;
    }
    public static void main(String[] args) {
        String s="au";
        Test3 test=new Test3();
        int t=test.lengthOfLongestSubstring(s);
        System.out.println(t);
        System.out.println("Hello World");
    }

}
