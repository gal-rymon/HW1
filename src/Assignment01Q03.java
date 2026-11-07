public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int numOdd = 2;
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int prev2 = 1;
        int prev1 = 1;
        System.out.print(prev2);
        System.out.print(" ");
        System.out.print(prev1);
        System.out.print(" ");
        for (int i=2; i<x; i++){
            int fib_i = prev2 + prev1;
            if (fib_i%2==1){numOdd++;}
            System.out.print(fib_i);
            if (i<x-1){
                System.out.print(" ");
                prev2 = prev1;
                prev1 = fib_i;
            } else{
                System.out.println();
            } 
        }
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
