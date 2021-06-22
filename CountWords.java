import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String input="Welcome to Java Problems and Solutions Welcome to Java Problems and Solutions" ;

        countWord(input);
    }

    private static void countWord(String input) {

        //logic
       Map<String,Integer> count=new HashMap<>();

        String strWords[]=input.split(" ");

        for(String w:strWords)
        {
            if(count.containsKey(w))
            {
                count.put(w,count.get(w)+1);
            }
            else
            {
                count.put(w,1);
            }
        }


        System.out.println(count);
    }
}
