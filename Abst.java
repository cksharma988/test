import java.util.Scanner;

public class Abst {
    public static void main(String[] args) {
        double a,b,result;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextDouble();
        System.out.println("choose an operator");
        c=sc.next().charAt(0);
        System.out.println("enter second number");
        b=sc.nextDouble();
        switch(c){
            case '+' :
            result=a+b;
            System.out.println(a+ "+" +b+ " = " +result);
            break;
            case '-' :
            result=a-b;
            System.out.println(a+ "-" +b+ " = " +result);
            break;
            case '*' :
            result=a*b;
            System.out.println(a+ "*" +b+ " = " +result);
            break;
            case '/' :
            result=a/b;
            System.out.println(a+ "/" +b+ " = " +result);
            break;
            default:
            System.out.println("invalid input");
         }
         sc.close();
        }


    
}
