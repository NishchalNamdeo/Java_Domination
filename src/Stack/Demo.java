package Stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args){

//      Stack<Integer> st = new Stack<>();
       StackUSingLL st = new StackUSingLL(3);
        st.push(52);
        st.push(85);
        st.push(86);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
    }
}
