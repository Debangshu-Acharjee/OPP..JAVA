
import java.util.*;

public class Second {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter operator =");
        char operator =sc.next().charAt(0);

        
        System.out.println("Entet num1 =");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 =");
        int num2 =sc.nextInt();

        
        switch(operator)
        {
            case'+': System.out.println("num1+num2="+(num1+num2));
            break;
            case'-': System.out.println("num1-num2="+(num1-num2));
            break;
            case'*': System.out.println("num1*num2="+(num1*num2));
            break;
            case'/': if(num2==0)
                        {
                            System.out.println("Error");
                        }
                    else{
                        System.out.println("num1/num2="+(num1/num2));
                        }
            break;
            default:System.out.println("Check Our Operator");
            

        }


    }
}
