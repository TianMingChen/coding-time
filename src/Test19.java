import java.util.List;

/**
 * @ClassName : Test19  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/16  13:58
 */
public class Test19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode listNode=new ListNode(-1);
        listNode.next=head;
        ListNode listNode1=listNode;
        ListNode listNode3=listNode;
        ListNode listNode2=head;
        while (n!=0){
            listNode2=listNode2.next;
            n--;
        }

        while(listNode2!=null){
            listNode2=listNode2.next;
            listNode3=listNode3.next;
        }
        listNode3.next=listNode3.next.next;

        return listNode1.next;



    }
}
