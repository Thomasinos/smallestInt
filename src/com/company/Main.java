// Thomas Comerford

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program finds the smallest of the integers you enter.");
        String firstinp, newinp;
        int firstinpint, newinpint;
        Boolean noans = true;
        String negcheckfirst, negchecknew;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            noans = false;
            System.out.print("Enter an integer (Q or q to quit): ");
            newinp = keyboard.next();
            if (!newinp.equals("Q") && !newinp.equals("q")) {
                System.out.println(Integer.parseInt(newinp));
            } else {
                break;
            }
            /* negcheckfirst = firstinp.charAt(0);
            negchecknew = newinp.charAt(0);
            if (negcheckfirst.equals("-")){
                firstinpint = -1*firstinpint;
            }
            if (newinp.equals("Q") || newinp.equals("q")) {
                firstinp = "Q";
            }else{
                newinpint = Integer.parseInt(newinp);
                if (negchecknew.equals("-")){
                    newinpint = -1*newinpint;
                }
                if (firstinpint <= newinpint){
                    ans = firstinpint;
                }else{
                    ans = newinpint;
                }*/

        }
        if (noans == false){
                System.out.println("The smallest number you entered is ");
            }
    }
}

/*
        System.out.print("Enter an integer (Q or q to quit): ");
        firstinp = keyboard.next();
        firstinpint = Integer.parseInt(firstinp);
        int ans = firstinpint;
 */