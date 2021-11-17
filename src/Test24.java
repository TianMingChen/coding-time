/**
 * @ClassName : Test24  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/16  16:00
 */

public class Test24 {
    public ListNode swapPairs(ListNode head) {
        ListNode listNode=new ListNode(-1);
        listNode.next=head;
        ListNode listNode1=listNode;
        while (listNode1.next!=null&&listNode1.next.next!=null){
            ListNode listNode2=listNode1.next;
            ListNode listNode3=listNode1.next.next;
            listNode2.next=listNode3.next;
            listNode1.next=listNode3;
            listNode3.next=listNode2;
            listNode1=listNode2;
        }

        return listNode.next;




    }

}
