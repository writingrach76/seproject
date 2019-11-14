/*
 ==========================================================================
 * @Author:        Rachel Thornton
 * Class:
 * Assignment: 
 * Summary: ==================================================================

 */
package schedulesorter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Rachel
 */
public class ReadFile 
{
    private File _input;
    private ArrayList<String []> _lines;
    
    public ReadFile(String s)
    {
        _input = new File(s);
        findInput();
    }
    
    /**
     * reads through the input file and splits each line at every comma, putting
     * the line into a String[]. This is then added to an ArrayList that holds
     * each line of input as a String[].
     */
    private void findInput()
    {
        try
        {
        Scanner in = new Scanner(_input);
        while(in.hasNextLine())
            {
                String[] line =in.nextLine().split(",");
                _lines.add(line);
            }
        in.close();
        }
        catch(IOException exception)
        {
            System.out.println("File not found");
        }
    }
    
    
     /**
     * @return the ArrayList that holds each line from the input file as a String[]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
     */
    public ArrayList<String []> getInput()
    {
        return _lines;
    }
    
    /**
     * This method assigns the input file to a new file.
     * @param s 
     */
     public void changeFile(String s)
    {
        _input = new File(s);
        findInput();
    }
}
