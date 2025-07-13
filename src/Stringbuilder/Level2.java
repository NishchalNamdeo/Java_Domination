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