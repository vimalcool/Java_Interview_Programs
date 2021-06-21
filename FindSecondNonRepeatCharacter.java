import java.util.Scanner;

public class FindSecondNonRepeatCharacter
{


    private static Character findNonRepaetChar(String input) {
       int count =0;
        for(int i=0;i<input.length();i++)
        {
            Character c=input.charAt(i);
            if(input.indexOf(c)==input.lastIndexOf(c)) {
                count++;
            }

            if(count==2)
            {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input String ");
        String input=scanner.next();
        System.out.println(findNonRepaetChar(input));


    }


}
