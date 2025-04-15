package arrays;
import java.util.Arrays;


//seprate array
//public class Stringapiarrays {
//    public static void main(String[] args)  {
//        String s = "shery";
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//    }
//
//}

//reverse string
//public class Stringapiarrays {
//    public static void main(String[] args)  {
//       String s = "shery";
//        String rev = "";
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            rev = rev + s.charAt(i);
//        }
//        System.out.print(rev);
//    }
//}


//palidrom  - (madam --> first and last word same)
//public class Stringapiarrays {
//    public static void main(String[] args)  {
//       String s = "madam";
//        String rev = "";
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            rev = rev + s.charAt(i);
//        }
//        System.out.print(rev.equals(s));
//    }
//}



//constant , vowel, sp Question
//public class Stringapiarrays {
//    public static void main(String[] args) {
//        String s = "mai nahi janti tumko";
//        s = s.toLowerCase();
//        int c = 0, v = 0, sp = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            switch (ch) {
//                case ' ' -> sp++;
//                case 'a', 'e', 'i', 'o', 'u' -> v++;
//                default -> c++;
//            }
//        }
//        System.out.println("con " + c + "\nvowel " + v + "\nspace " + sp);
//    }
//}


//toggle question
//public class Stringapiarrays {
//    public static void main(String[] args) {
//        String s = "ahbcshbDNCNSB";
//        String ans = "";
//        for (int ch : s.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                ans = ans + (char) (ch + 32);
//            } else {
//                ans = ans + (char) (ch - 32);
//            }
//        }
//        System.out.println(ans);
//    }
//}

//Toggle by Method
//class Solution {
//    public String toggleAlphabet(String s){
//        String ans = "";
//
//        for (char ch : s.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') {
//                ans += (char) (ch - 32);
//            }
//            else if (ch >= 'A' && ch <= 'Z') {
//                ans += (char) (ch + 32);
//            }
//            else {
//                ans += ch;
//            }
//        }
//        return ans;
//    }
//}



//count the valid word - prefix
//public class Stringapiarrays {
//    public static void main(String[] args) {
//        String[] words = {"attention", "attempt", "attire", "kuch", "kyaa", "kyuu"};
//        String pref= "at";
//        int c = 0;
//        for (String word : words) {
//            if (word.startsWith(pref))
//                c++;
//        }
//        System.out.println(c);
//    }
//}



//spilt method
//public class Stringapiarrays {
//    public static void main(String[] args) {
//       String s = "hello Bhai kaise ho";
//       String words[] = s.split(" ");
//        for (String word: words) {
//            System.out.println(word);
//        }
//    }
//}

//spilt method other wayt ->
//class Solution {
//    public void prefixCount(String words) {
//        String arr[] = words.split(" ");
//        for(int i = 0; i < arr.length; i++) {
//            String ans = "";
//            String word = arr[i];
//            if (word.length() == 1) {
//                ans += Character.toUpperCase(word.charAt(0));
//            } else {
//                ans += Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length());
//            }
//            System.out.println(ans);
//        }
//    }
//}



//count freqncey
//public class Stringapiarrays {
//    public static void main(String[] args) {
//        String s = "bdbsmsjnsssnsnnss";
//        int freq[] = new int[26];
//        for (char ch : s.toCharArray())
//            freq[ch - 97]++;
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > 0)
//                System.out.println((char) (i + 97) + " -> " + freq[i]);
//        }
//    }
//}


//check anagrams
//public class Stringapiarrays {
//    public static boolean validAnagram(String s, String s2) {
//        int freq[] = new int[26];
//        for (char ch : s.toCharArray())
//            freq[ch - 97]++;
//        int freq2[] = new int[26];
//        for (char ch : s2.toCharArray())
//            freq2[ch - 97]++;
//
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] != freq2[i]) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//
//    public static void main(String[] args) {
//        String s = "hellokaiseho", s2 = "kaisehohello";
//        System.out.println(validAnagram(s, s2));
//    }
//}



//sort array
//public class Stringapiarrays {
//    public static void main(String[] args) {
//    String s = "ek machli pani me gayi chapaka";
//    String words[] = s.split(" ");
//        Arrays.sort(words);
//        s ="";
//        for(String word: words){
//            s += word + " ";
//        }
//        s = s.trim();
//        System.out.println(s);
//
//    }
//}



//Capitalize First and Last Character of Each Word
//class Solution {
//    public String prefixCount(String words) {
//        String arr[] = words.split(" ");
//        String ans = "";
//
//        for (String word : arr) {
//            String temp = "";
//
//            if (word.length() == 1) {
//                temp += Character.toUpperCase(word.charAt(0));
//            }
//            else {
//                temp += Character.toUpperCase(word.charAt(0)) +
//                        word.substring(1, word.length() - 1) +
//                        Character.toUpperCase(word.charAt(word.length() - 1));
//            }
//
//            ans += temp + " ";
//        }
//        return ans.trim();
//    }
//}


//maximum number of word found
//class Solution {
//    public int mostWordsFound(String[] sentences) {
//        int maxWords = 0;
//        for (String sentence : sentences) {
//            String[] words = sentence.split(" ");
//            maxWords = Math.max(maxWords, words.length);
//        }
//        return maxWords;
//    }
//}

