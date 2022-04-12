/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter_8_oop;

/**
 *
 * @author Ahad Raza
 */
public class Q_3 
{
    private int p1;
    private float p2;
    private float p3;
    public void puzzle(int a , float b,float c)
    {
        p1= a;
        p2=b;
        p3=c;
    }
    public void setdisplay()
    {
        System.out.println("p1"+p1);
        System.out.println("p2:"+p2);
        System.out.println("p3:"+p3);
    }
    public static void main(String[] args)
    {
        Q_3 c1 = new Q_3();
        c1.puzzle(2, 2, 4);
        c1.setdisplay();
    }
}
