/**
 * @ClassName : Test61  //类名
 * @Description :   //描述
 * @Param :   //参数
 * @return:
 * @Author : lenovo //作者
 * @Date: 2021/11/17  19:39
 */

public class Test61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) {return head;}

        ListNode listNode=new ListNode(-1);
        listNode.next=head;
        ListNode listNode1=listNode.next;
        ListNode listNode2=listNode.next;
        ListNode listNode3=listNode;
        ListNode listNode4=listNode;
        int t=0;
        while (listNode1!=null){
            listNode1=listNode1.next;
            t++;
        }
        int y=k%t;
        if(y==0) return head;
        for(int i=1;i<t;i++){

            if(i==t-y){
                listNode3=listNode2.next;
                listNode4=listNode2;
            }
            listNode2=listNode2.next;
            if(i==t-1){
                listNode2.next=listNode.next;
                listNode.next=listNode3;
                listNode4.next=null;
            }

        }

        return listNode.next;

    }
}
