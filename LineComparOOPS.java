
package com.mycompany.dec_13_linecompar_oops;

public class LineComparOOPS {
    /*
    Use Case 1: Calculate length of a line
    */
    public double lineLength(int x1,int y1,int x2,int y2){
        double line_len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return line_len;
    }
    
    /*
    Use case 2: check if two lines are equal
    */
    public boolean checkLinesEquality(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        boolean lines_eq = false;
        // Call method which calculates length of lines
        double len_line1 = lineLength(x1,y1,x2,y2);
        double len_line2 = lineLength(x3,y3,x4,y4);

        if (len_line1==len_line2){
            lines_eq = true;
        }
        return lines_eq;
    }
    /*
    Main method
    */
    public static void main(String []args){
        LineComparOOPS lco = new LineComparOOPS();
        // check equality of two lines
        boolean lines_equal = lco.checkLinesEquality(0,0,1,1,0,2,3,3);
        if (lines_equal){
            System.out.println("The lines are equal");
        } else{ System.out.println("The lines are not equal");}
    }
}
