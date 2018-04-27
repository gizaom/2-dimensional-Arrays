package pascaltriangle;
/**
 Author: Kevin De Jesus
 File: PascalTriangle.java
 I affirm that this program is entirely my own work and none of it is the work 
 of any other person.
	__________Kevin De Jesus_________
	(your signature)
 */

/**
  A PascalTriangle that can be displayed as a string and is constructed with a
  number of rows specified by the user.
 */
public class PascalTriangle {
    private int[][] pascal;
    private String pascalString = "";
    
    /**
     Constructs a PascalTriangle array with a specific amount of rows..
     @param rows the amount of rows the Pascal Triangle has.
    */
    public PascalTriangle(int rows){
        pascal = fillTriangle(rows);
    }
    
    /**
     Private method that fills the PascalTriangle object with integers when the
     the constructor constructs it.
     @param size the amount of rows that the Pascal Triangle has.
     @return  the Pascal Triangle as a 2d integer array filled with integers.
    */
    
    private int[][] fillTriangle(int size){
        int[][] pascal = new int[size][];
        for(int row = 0; row < size; row++){
            pascal[row] = new int[row + 1];
            pascal[row][0] = pascal[row][row] = 1;
            for(int column = 1; column < pascal[row].length - 1; column++){
                pascal[row][column] = pascal[row - 1][column - 1] + 
                        pascal[row - 1][column];
            }
        }
        return pascal;
    }
    
    /**
     Converts a PascalTriangle object to a multi-line String that represents a
     centered Pascal Triangle.
     @return A representation of the PascalTriangle as a String.
    */
    public String toString(){
        String pascalString = "";
        for(int row = 0; row < this.pascal.length; row++){
            for(int space = 0; space < this.pascal.length - row; space++){
                pascalString += " ";
            }
            for(int column = 0; column < row; column++){
                pascalString += this.pascal[row][column] + " ";
            }
            pascalString += "1" + "\n";
        }
        return pascalString;
    }
}
