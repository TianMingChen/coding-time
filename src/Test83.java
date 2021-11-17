/**
 * @ClassName : Test83  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/17  9:33
 */

public class Test83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode listNode=new ListNode(-1);
        listNode.next=head;
        ListNode listNode2=listNode.next.next;
        ListNode listNode3=listNode.next;
        while (listNode2!=null){
            if(listNode2.val==listNode3.val){
                listNode3.next=listNode2.next;
                listNode2=listNode2.next;
            }else {
                listNode3=listNode3.next;
                listNode2=listNode2.next;
            }
        }
        return listNode.next;


    }
}
