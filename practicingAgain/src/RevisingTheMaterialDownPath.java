import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;

public class RevisingTheMaterialDownPath {

    public static void main(String[] args) {

        int[] summer = {10,20,30,40,1,2};
        int i,a,s,d;
        int imm,hard,sock,roll;
        for (i=0; i<=summer.length-1; i++) {
            imm = summer[i];
            for (a=i+1; a<=summer.length-1; a++) {
                hard = summer[a];
                for (s=a+1; s<= summer.length-1; s++) {
                    sock = summer[s];
                    for (d=s+1; d<= summer.length-1; d++) {
                        roll = summer[d];
                        if (imm+hard+sock+roll==53) {
                            System.out.println(imm + " + " + hard + " + " + sock + " + " + roll + " = " + (imm+hard+sock+roll));
                        }
                    }
                }
            }
        }

        }
    }
