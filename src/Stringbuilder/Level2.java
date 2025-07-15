package Stringbuilder;

//String & StringBuilder

//Ques 1. ->Valid Anagram
//public class Level2 {
//    public boolean isAnagram(String s, String t) {
//    if(s.length() != t.length()) return false;
//    int [] freq = new int [26];
//
//        for (int i = 0; i <s.length() ; i++) {
//            freq[s.charAt(i) - 'a']++;
//            freq[t.charAt(i) - 'a']--;
//        }
//        for (int f:freq){
//            if(f != 0) return false;
//        }
//        return true;
//    }
//}


//Ques 2. -> Add Binary
//public class Level2{
//    public String addBinary(String a, String b) {
//       int i = a.length() - 1;
//       int j = b.length() - 1;
//
//       StringBuilder sb = new StringBuilder();
//       int carry = 0;
//       while( i>=0 || j>=0){
//           int sum = carry;
//           if(i>=0) sum += Character.getNumericValue(a.charAt(i));
//           if(j>=0) sum += Character.getNumericValue(b.charAt(j));
//           sb.append(sum % 2);
//           carry = sum /2;
//           i--;
//           j--;
//       }
//       if(carry ==1) sb.append(1);
//       return sb.reverse().toString();
//    }
//}


//Ques 3. -> Longest Common Prefix
//public class Level2{
//    public String longestCommonPrefix(String[] strs){
//        if(strs == null || strs.length == 0) return "";
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <strs.length; i++) {
//            char ch = strs[0].charAt(i);
//
//            for (int j = 1; j <strs.length; j++) {
//                if(i>=strs[j].length() || strs[j].charAt(i) != ch)
//                    return sb.toString();
//            }
//            sb.append(ch);
//        }
//        return sb.toString();
//    }
//}


//Ques 4. ->  Rotate String
//public class Level2{
//    public boolean rotateString(String s, String goal){
//        if(s.length() != goal.length()) return  false;
//        StringBuilder sb = new StringBuilder(s);
//        int n = s.length();
//        while(n-- > 0){
//            if(sb.toString().equals(goal)) return true;
//            char ch = sb.charAt(0);
//            sb.append(ch);
//            sb.deleteCharAt(0);
//        }
//        return false;
//    }
//}