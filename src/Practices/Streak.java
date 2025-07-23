package Practices;

//Ques 1.  -> 3136. Valid Word
/* public class Streak {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowel = "aeiouAEIOU";

        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if(vowel.indexOf(c) != -1) hasVowel = true;
                else hasConsonant = true;
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }
}
*/


