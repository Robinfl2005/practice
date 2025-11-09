/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        // Map<Integer,ListNode> map=new HashMap<>();
        // ListNode node =head;
        // int cs=0,ps=0;
        // while(node!=null){
        //     cs+=node.val;
        //     map.put(cs,node);
        //     node=node.next;
        // }
        // ListNode dum=new ListNode();
        // ListNode nod=dum.next;
        // for(int i:map.keySet()){
        //     nod.next=map.get(i);
        //     nod=nod.next;
        // }
        // return dum.next;
        
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;                // starting contigous zero-sub array sum;
            temp=temp.next;
            if(sum==0){
                head=temp;
                //break;
            }
        }
        
        
        
        
        boolean f=true;
        while(f){
            Map<Integer,ListNode> map=new HashMap<>();
            temp=head; int x=0;
            f=false;
           // map.put(0,null);
            while(temp!=null){
                x+=temp.val;
                if(map.containsKey(x)){
                    f=true;
                    map.get(x).next=temp.next;
                }
                else map.put(x,temp);
                temp=temp.next;
                
            }
        }
        
        
        // List<Integer> list = new ArrayList<>();
        // ListNode curr = head;
        // while(curr!=null) {
        //     list.add(curr.val);
        //     curr = curr.next;
        // }
        
        
        //System.out.print(list);
        return head;
    }
}


//    1 3 6 3 1