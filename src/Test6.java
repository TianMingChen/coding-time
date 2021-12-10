/**
 * @ClassName : Test6  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/29  20:14
 */

public class Test6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = s.length();
        String str = "";
        int t = 0;
        int r = 0;
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                t = i;
                while (t < n) {
                    str = str + s.charAt(t);
                    t += 2 * numRows - 2;
                }
            } else {
                t = i;
                r = 2 * numRows - 2 - i;
                while (t < n || r < n) {
                    if (t < n) {
                        str = str + s.charAt(t);
                        t += 2 * numRows - 2;
                    }
                    if (r < n) {
                        str = str + s.charAt(r);
                        r += 2 * numRows - 2;
                    }
                }
            }
        }
        return str;

    }
}
