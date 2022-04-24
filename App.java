//                                                   Trignometry Formula For Triple Angle Identities
package com.mycompany.program;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) 
    {
        float a;
        System.out.println("Trignometry Formula For Triple Angle Identities");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angle:");
        a =sc.nextFloat();
        System.out.println("Sin3A = 3sin(A)-4sin^3(A):"+(3*Math.sin(a)-4*Math.sin(a)*Math.sin(a)*Math.sin(a)));
        System.out.println("Cos3A = 4cos^3(A)-3Cos^2(A):"+(4*Math.cos(a)*Math.cos(a)*Math.cos(a)-3*Math.cos(a)+Math.cos(a)));
        System.out.println("3TAN(A)-TAN^3/1-3TAN^2A:"+ (3*Math.tan(a)-Math.tan(a)*Math.tan(a)*Math.tan(a)/1-3*Math.tan(a)*Math.tan(a)*Math.tan(a)));
    }
}
