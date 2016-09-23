/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class Client {
    Socket socket;
    BufferedReader in;
    BufferedReader stdIn;
    PrintWriter out;
    Scanner scan;
    
    public Client()throws Exception{
        socket = new Socket(InetAddress.getByName("localhost"), 75);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        stdIn = new BufferedReader(new InputStreamReader(System.in));
        scan = new Scanner(System.in);
        (new InputReader(out, scan)).start();
        interact();
        
        
        
        
    }
    
    public void interact() throws IOException{
        String outLine;
        String input;
        while(true){
            
            if(!((input = in.readLine()) == null)){
                System.out.println(input);
            }
            
            
        }
    }
}
