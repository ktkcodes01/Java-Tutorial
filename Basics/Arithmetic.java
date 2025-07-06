package Basics;
public class Arithmetic {

    public static void main(String[] args) {
        String a = "5";
        String b = "8";

        int num1 = Integer.parseInt(a);
        int num2 =  Integer.parseInt(b);
        System.out.println(" Additions : "+ (num1+num2));
        System.out.println(" Subtraction : "+ (num1-num2));
        System.out.println(" Multiplication : "+ (num1*num2));
        System.out.println(" Division : "+ (num2/num1));
        System.out.println(" Modulo : "+ (num2%num1));

    }
    
}
