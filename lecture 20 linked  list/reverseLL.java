public class reverseLL{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail; 
    public static int size;


    public void addFirst(int data){
        //step1 =create new node
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head =tail =newNode;
            return;

        }

        //step2 - newNode next = head
        newNode.next  = head; //link

        //step 3 head = newnode
        head = newNode;
    }

    public void addlast(int data){

        Node newNode= new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail= newNode;
        
    }
    public void print(){
        if(head ==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;

         }
        System.out.println("null");
    }
        // add middle on LL
    public void add(int idx, int data ){;
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i< idx-1){
            temp = temp.next;
            i++;
        }

        //i=idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
            //REMOVE FIRST
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val= head.data;
            head =tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head = head.next;
        size--;
        return val;
    }
    

    // REMOVE LAST
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val= head.data;
            head =tail=null;
            size=0;
            return val;
        }
        //prev: i=size -2
        Node prev = head;
        for(int i=0;i<size -2; i++){
           prev =prev.next;


        }

        int val = prev.next.data;//tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }



                // REVERSE LL 
    public  void  reverse(){
        Node prev=null;
        Node curr= tail = head;
        Node next;
         while(curr != null){
            next =curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
         }
         head = prev;

    }            

    public static void main(String args[]){
                //  create linked linkedlist
                reverseLL ll= new reverseLL();
                
                ll.addFirst(2);
                ll.addFirst(1);
                ll.addlast(4);
                ll.addlast(5);
                ll.add(2,3);//add data on middle of
                ll.print();
               ll.reverse();
               ll.print();
              
              
                 
                
                

               
               
               
                
               
    }
}