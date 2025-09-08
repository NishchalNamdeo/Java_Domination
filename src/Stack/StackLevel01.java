package Stack;

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


//Ques 2 -> Implement Queue using Stacks
public class StackLevel01 {

}