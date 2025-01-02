import java.util.*;

public class pushatbottom {

    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        System.out.println("intial"+top);
        pushAtBottom(s, data);
        System.out.println("final"+top);
        s.push(top);
        System.out.println("finally                 "+top);

    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
