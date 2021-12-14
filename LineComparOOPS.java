
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
    Use case 3: Compare two lines
    */
    public String compareLines(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        // Call method which calculates length of lines
        double len_line1 = lineLength(x1,y1,x2,y2);
        double len_line2 = lineLength(x3,y3,x4,y4);
        String lin_comp = "";
        if (len_line1>len_line2){
            lin_comp = "Line 1 is greater in length";
        } else if (len_line1<len_line2){
            lin_comp = "Line 2 is greater in length";
        }else if (len_line1==len_line2){
            lin_comp = "Both lines are equal in length";
        }
        return lin_comp;
    }
    /*
    Main method
    */
    public static void main(String []args){
        LineComparOOPS lco = new LineComparOOPS();
        // compare two lines
        String lines_comp = lco.compareLines(0,0,1,1,0,2,3,3);
        System.out.println(lines_comp);
    }
}
