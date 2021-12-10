import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName : Test39  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/23  14:38
 */

public class Test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> path=new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(candidates, target, res, path, 0,0);
        return res;

    }
    void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> path, int sum,int begin) {

        if(target==sum){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=begin;i<candidates.length;i++){
            int rs = candidates[i] + sum;
            if(rs<=target){
                path.add(candidates[i]);
                dfs(candidates,target,res,path,rs,i);
                path.remove(path.size()-1);
            }
            else {
                break;
            }

        }
    }

}
