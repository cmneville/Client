/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class InputReader extends Thread{
    Scanner scan;
    PrintWriter out;
    
    public InputReader(PrintWriter o, Scanner s){
        out = o;
        scan = s;
    }
    
    public void run(){
        while(true){
            out.println(scan.nextLine());
        }
    }
}
