/**
 * @ClassName : Test21  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/16  10:46
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Test21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode(-1);
        ListNode prev=listNode;
        while (l1!=null&&l2!=null){

                if(l1.val<=l2.val){
                    prev.next=l1;
                    l1=l1.next;
                }else {
                    prev.next=l2;
                    l2=l2.next;
                }
                prev=prev.next;
        }
        if(l1==null)
            prev.next=l2;
        else
            prev.next=l1;

        return listNode.next;

    }
}
