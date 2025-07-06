package Basics;

public class AssignmentOperator {

    public static void main(String[] args)
    {
        // Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3)); // Adds 3 to f and assigns the result to f
        System.out.println("f -= 2: " + (f -= 2)); // Subtracts 2 from f and assigns the result to f
        System.out.println("f *= 4: " + (f *= 4)); // Multiplies f by 4 and assigns the result to f
        System.out.println("f /= 3: " + (f /= 3)); // Divides f by 3 and assigns the result to f
        System.out.println("f %= 2: " + (f %= 2)); // Assigns the remainder of f divided by 2 to f
        System.out.println("f &= 0b1010: " + (f &= 0b1010)); // Performs bitwise AND with 0b1010 and assigns the result to f
        System.out.println("f |= 0b1100: " + (f |= 0b1100)); // Performs bitwise OR with 0b1100 and assigns the result to f
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010)); // Performs bitwise XOR with 0b1010 and assigns the result to f
        System.out.println("f <<= 2: " + (f <<= 2)); // Left shifts f by 2 bits and assigns the result to f
        System.out.println("f >>= 1: " + (f >>= 1)); // Right shifts f by 1 bit and assigns the result to f
        System.out.println("f >>>= 1: " + (f >>>= 1)); // Unsigned right shifts f by 1 bit and assigns the result to f
    }
}
