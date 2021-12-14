
package com.mycompany.dec_13_linecompar_oops;

public class LineComparOOPS {
    /*
    Use Case 1: 
    */
    public double lineLength(int x1,int y1,int x2,int y2){
        double line_len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return line_len;
    }

    public static void main(String []args){
        LineComparOOPS lco = new LineComparOOPS();
        double len1 = lco.lineLength(0, 0, 1, 1);
        System.out.println("Length of line = "+ len1);
    }
}
