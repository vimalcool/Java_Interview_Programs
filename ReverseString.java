public class ReverseString {

    public static void main(String[] args) {
        String input="Welcome to Java Problems and Solutions";

        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {

        //logic
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        String strWords[]=input.split(" ");

        for(String w:strWords)
        {
            sb1=new StringBuilder();

            for(int i=w.length()-1;i>=0;i--)
            {
                sb1.append(w.charAt(i));
            }

            sb2.append(sb1).append(" ");
        }


        return sb2.toString();
    }
}
