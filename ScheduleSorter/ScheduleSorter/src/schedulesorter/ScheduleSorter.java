/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulesorter;
import java.io.File;
import sortpackage.Sort;
import timepackage.ClassTime;
import timepackage.SessionTime;
import tutorpackage.Tutor;
import java.util.Scanner;

/**
 *
 * @author VcSza
 */
public class ScheduleSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        getInputFile("testingInputs.txt");
        
    }
    
    private static void runProgram()
    {
        System.out.println("Hello!");
        String input = "";
        
        while(!input.equals("Q"))
        {
            System.out.println("Please enter Q to quit, D to prep for the schedule, and S to generate a schedule draft.");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
        
            if(input.equals("D"))
            {
                //do database stuff
                //this will loop again to prompt the user to generate the schedule draft
            }
            else if(input.equals("S"))
            {
                //do schedule stuff
                //built in exportation and maybe also quit??
            }
            else
            {
                System.out.println("That's not a valid input, please try again.");
            }
            
        }
        
    }
    
    private static void getInputFile(String file)
    {
       ReadFile rf = new ReadFile(file);
       
    }
    
    private static void doDatabase()
    {
        
    }
    
    private static void doScheduler()
    {
        
    }
    
}
