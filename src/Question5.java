
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
    {
        int i,a,b=0,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of i:");
        i=sc.nextInt();
        a=i/2;
        if(i==0||i==1)
        {
            System.out.println(i+" is not prime number");
        }
        else {
            for(a=2;a<=b;a++)
            {
              if(i%a==0)
              {
                  system.out.println(i+"is not prime number");
                  c=1;
                  break;

              }
            }
            if (c==0)
            {
                System.out.println(i+" is prime number");
            }
        }
    }
}
