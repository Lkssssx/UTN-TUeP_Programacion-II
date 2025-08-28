/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_introduccion_a_poo;

import java.util.Scanner;

/**
 *
 * @author lu
 */
public class Utils {
    
    public void print(String msg) {
        System.out.println(msg);
    }
        
    public class input {
        
        Scanner input = new Scanner(System.in);

        public String str(String msg) {
            print(msg);
            String user_input = input.nextLine();
        
            return user_input;
        }
        
        public int integer(String msg) {
            print(msg);
            int user_input = Integer.parseInt(input.nextLine());
        
            return user_input;
        }
        
        public double doubl(String msg) {
            print(msg);
            double user_input = Double.parseDouble(input.nextLine());
        
            return user_input;
        }
        
    }
    
}
