import java.util.HashMap;
import java.util.Map;

public class DiffEqualOperator {




    public static void main(String[] args) {

        String obj1=new String("Java");

        String obj2=new String("Java");




        if(obj1==obj2)// Equal Operator
        {
            System.out.println(" obj1 and obj2  are equal");
        }
        else {
            System.out.println(" obj1 and obj2  are not equal");
        }

        if(obj1.equals(obj2))// Equal Method
        {
            System.out.println(" obj1 and obj2  are equal");
        }
        else {
            System.out.println(" obj1 and obj2  are not equal");
        }

    }


}
