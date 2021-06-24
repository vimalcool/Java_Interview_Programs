import java.util.HashMap;
import java.util.Map;

public class StringImmutable {



    public static void main(String[] args) {


        //String literal
        String s1="Java";
        String s2="Java";

        if(s1==s2)
        {
            System.out.println("equals");
        }
        // String new keyword

        String s3=new String("Java");
        String s4=new String("Java");
        if(s3==s4)
        {
            System.out.println("equals");
        }
        else
        {
            System.out.println("not equals");
        }
        //
        String s5=new String("Java").intern();
        if(s2==s5)
        {
            System.out.println("equals");
        }


    }



}
