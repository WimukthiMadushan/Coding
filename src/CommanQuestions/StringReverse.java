package CommanQuestions;

import java.util.Arrays;

public class StringReverse {
    public String stringReverse(String str){
        char[] characters = str.toCharArray();
        for(int i = 0; i <= str.length()/2; i++){
            char temp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = temp;
        }

        return new String(characters);
    }

    public void sentenceReverse(String str){
        String[] words = str.split(" ");
        StringBuffer reversed = new StringBuffer();
        for(int i = 0; i < words.length; i++){
            reversed.append(stringReverse(words[i]));
            reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }
}
