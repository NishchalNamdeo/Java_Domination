package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Ques 1 -> Valid Parentheses - 20
/* public class StackLevel01 {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }else if( st.isEmpty()){
              return false;
            }else{
              char top = st.peek();
              if(top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']'){
                  st.pop();
              }
              else
                  return false;
            }
        }
        return st.size() == 0;
    }
}
*/


//Ques 2 -> Implement Queue using Stacks -232
/* public class StackLevel01 {
    Stack<Integer> st1, st2;
    public StackLevel01() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    public void push(int x) {
        st1.push(x);
    }

    public int pop(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int ans = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return ans;
    }
    public int peek(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int ans = st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return ans;
    }
    public boolean empty() {
        return st1.isEmpty();
    }
}
*/


//Ques 3 ->  Implement Stack using Queues - 225
/* class StackLevel01 {
    Queue<Integer> q1, q2;
    public StackLevel01(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        q1.offer(x);
    }

    public int pop(){
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int ans = q1.poll();
        var t = q1;
        q1= q2;
        q2 = t;
    }

    public  int top(){
     while(q1.size() != 1){
         q2.offer( q1.poll());
     }
     int ans = q1.poll();
     q2.offer(ans);
     var t = q1;
     q1 = q2;
     q2 = t;
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}
 */

