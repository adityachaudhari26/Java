public class Assignment_Operator {
    
    public static void main(String[] args) {
        System.out.println("=========Assignment_Operator=========");

        // Assigment (=)
        int x = 5;
        System.out.println("Assignment is: " +x);

        //Addition Assignment (+=)
         x += 4; // Equivalent to x = x -4
        System.out.println(" Addition Assignment is: " +x);

        //Subtraction Assignment (-=)
         x -= 3;// Equivalent to x = x - 3
        System.out.println(" Subtraction Assignment is: " +x);

        //Multiplication Assignment (*=)
         x *= 8; //Equivalent to x = x * 8
        System.out.println("Multiplication Assignment is: " +x);

        //Division Assignment (/=)
         x /= 6; //Equivalent to x = x / 6
        System.out.println(" Division Assignment is: " +x);

        //Modulo Assignment (%=)
         x %= 7; // Equivalent to x = X % 7
        System.out.println(" Modulo Assignment is: " +x);
    }
}
