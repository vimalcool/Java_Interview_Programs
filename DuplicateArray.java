import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=input.nextInt();// this for get size of array or how many element to want to store
        String[] strArray=new String[size];

        System.out.println("Enter Values");
        int count=0;
        boolean flag=false;
        for(int i=0;i<size;i++) {

            String value=input.next();

                if(i==0)
                {
                    strArray[i]=value;
                    count++;
                }
                else
                {
                    for(int j=0;j<count;j++)
                    {
                        if(strArray[j].equals(value))
                        {
                            flag=true;
                            break;
                        }
                    }

                    if(!flag) {
                        strArray[i] = value;
                        count++;
                    }
                    flag=false;
                }
//this block get input from run time store in array & our remove duplicate logic







        }
        for(String s:strArray)
        {
            if(s!=null) {
                System.out.println(s);

            }
        }//print the element without duplicate.

    }
}
