package arrays;


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



//count the valid word - prefix
public class Stringapiarrays {
    public static void main(String[] args) {
        String[] words = {"attention", "attempt", "attire", "kuch", "kyaa", "kyuu"};
        String pref= "at";
        int c = 0;
        for (String word : words) {
            if (word.startsWith(pref))
                c++;
        }
        System.out.println(c);
    }
}