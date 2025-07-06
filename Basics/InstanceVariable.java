package Basics;
public class InstanceVariable {

    public int age;

    InstanceVariable(int age){
        this.age=age;
    }

    public static void main (String[] args){
        InstanceVariable x = new InstanceVariable(10);

        System.out.println("Age of variable = "+ x.age);
    }
    
}



// https://www.geeksforgeeks.org/java/java-keywords/