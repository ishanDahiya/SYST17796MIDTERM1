/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcavg;

import java.util.Scanner;

/**
 *
 * @author ishan
 */
public class CalcAvg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] Grades;
        Grades = new int [10];
        
     for(int i=0; i < Grades.length; i++){
         Scanner input = new Scanner(System.in);
            System.out.print("Enter the student grades: ");
            Grades[i]=input.nextInt();
            
     }
     
     for(int i = 0; i < Grades.length; i++){
         System.out.println("The Avg is" + Grades );
         System.out.println("new edit");
     }
        
    }
    
}
