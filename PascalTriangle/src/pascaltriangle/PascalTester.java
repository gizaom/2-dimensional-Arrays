
package pascaltriangle;
import java.util.*; 
/**
 Author: Kevin De Jesus
 File: PascalTester.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

public class PascalTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        /**
        *used to set a condition for the loop that will keep the program running
        *for as long as the user wants.
        */
        boolean another = true;
       
        int min = 1;//minimum number of rows allowed for input
        int max = 13;//maximum number of rows allowed for input
        
        Scanner sc = new Scanner(System.in);
        String rows;//variable that stores the user input for # of rows.
        
        /**
         * used to keep the loop going until the user gives the correct input;
         */
        boolean incorrectInput = true;
        
        /**
         * this do while loop controls how many triangles the user will create.
         */
        do{
            
            /**
             * this do while loop validates the user input to be a number 
             * between 1 and 13 inclusive.
             */
            do{
                System.out.println("Enter the number of rows in the triangle "
                        + "as a number between 1 and 13: ");
                
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.out.println("That is not a valid number. Please "
                            + "enter a number between 1 and 13: ");
                }
                rows = sc.next();
                if(Integer.parseInt(rows) == (int)Integer.parseInt(rows)){
                    int numberOfRows = Integer.parseInt(rows);
                    
                    if(numberOfRows >= min && numberOfRows <= max){
                        
                        /**
                         * initializes a PascalTriangle object with the amount 
                         * rows specified by the user.
                         */
                        PascalTriangle pascal = new PascalTriangle(numberOfRows);
                        
                        /**
                         * converts the 2d integer array to a multi-line String
                         * representation of the triangle.
                         */
                        String pascalString = pascal.toString();
                        System.out.println(pascalString);
                        incorrectInput = false;//Input is valid.
                    }
                    
                    else{
                        System.out.println("Input has to be a number between "
                            + "1 and 13");
                        incorrectInput = true;//Input is not valid.
                    }
                }
                else{
                    System.out.println("Input has to be a number between "
                            + "1 and 13");
                    incorrectInput = true;//Input is not valid.
                }
            }while(incorrectInput);
            System.out.println("Would you like to print another triangle? "
                    + "Enter y to continue running the program, otherwise click"
                    + " any other key to terminate.");
            
            String end = sc.next();
            
            /**
             * checks to see if the user wants to keep making triangles.
             */
            another = end.equals("y");
        }while(another);
    }  
}
