package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        for (Map.Entry entry:findTheLargestWord(s).entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());

    }
}



            public static Map<Integer, String> findTheLargestWord(String wordGiven){
                Map<Integer, String> map = new HashMap<Integer, String>();
                String st = "";
                //implement
                String[] word = wordGiven.split(" ");
                for(int i = 0;i < word.length; i++){
                    if( word[i].length() >=st.length()){
                        st=word[i];
                    }
                }
                map.put(st.length(), st);
                return map;
    }
}
