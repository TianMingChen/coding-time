import java.util.Scanner;
public class Atest2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str=input.next();
        int n=str.length();
        int flag=0;
        for(int i=0;i<str.length();i++){
            String str2=str.substring(0,i)+str.substring(i+1,n);
            String str3= new StringBuilder(str2).reverse().toString();
            if(str2.equals(str3)){
                flag=1;
                String str4=str.substring(0,n-i)+str.substring(i,i+1)+str.substring(n-i,n);
                System.out.print(str4);
                break;
            }
        }
        if(flag==0)
        System.out.print("NA");
        String envUrl="https://datam.ctcdn.cn";
        String run="123wqe21321313";
        String str2=String.format("%s/%s/post", envUrl, run);
        String str1="https://datam.ctcdn.cn/"+"123wqe21321313"+"/post";
        System.out.println(str1);
        System.out.println(str2);


    }
}
