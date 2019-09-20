
package pyramidmaker;

import java.util.Scanner;


public class PyramidMaker {



    public static void main (String arg[]){

        Scanner kappa = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        int x = kappa.nextInt();  // Read user input
            
        int k=x;
        boolean test=true;
        
        for(int i=0; i<=x; i++) {
            for(int j=0; j<i; j++){

                while(x+k>x){
                System.out.print("-");
                k--;
                }
                    if(test){
                        System.out.print("#");
                        test=!test;
                    }
                    if(test==false){
                        System.out.print("-");
                        test=!test;
                    }
   
            }
            k=x-i-1;
            System.out.print("\n");
        }    
}
}
