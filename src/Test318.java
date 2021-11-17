/**
 * @ClassName : Test318  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/17  14:56
 */

public class Test318 {
    public int maxProduct(String[] words) {
        int length=words.length;
        int []masks =new int[length];
        for(int i=0;i<length;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                masks[i] |= 1 << (word.charAt(j)-'a');
            }
        }
        int maxPro=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if((masks[i]&masks[j])==0)
                maxPro=Math.max(maxPro,words[i].length()*words[j].length());

            }
        }
        return maxPro;




    }

}
