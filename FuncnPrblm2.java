//codechef problem:Functions continued

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FuncnPrblm2
{
 
	public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            performCalculationsAndPrint(A,B);
        }

        scanner.close();
    }

    public static void performCalculationsAndPrint(int A, int B) {
       //write your code here
       int C = A*A + 2*A*B + B*B;
       int D = A + B;
       System.out.println(C);
       System.out.println(D);
       
       

    }
}
