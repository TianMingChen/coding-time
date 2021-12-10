/**
 * @ClassName : Atest1  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/18  10:48
 */
import java.util.Arrays;
import java.util.Scanner;
public class Atest1 {
    public static void main(String[] args) {
        int   INT_MAX= 0x7fffffff;
        Scanner input=new Scanner(System.in);
        //创建一个数组
        int[] array=new int[3];
        //遍历数组，并给其赋值
        for(int i=0;i<3;i++){
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        int minLength=INT_MAX;
        for(int i=0;i<3;i++){
            int le=0;
            for (int j=0;j<3;j++){
                if(i<j)
                le+=array[j]-array[i];
                if(i>j)
                    le+=array[i]-array[j];
            }
            minLength=Math.min(minLength,le);
        }
        System.out.println(minLength);

    }
}
