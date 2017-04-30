package ppcoursework;
/**
 * @author name Dinuka Raneesh Anton Gomez
 * IIT ID 2016087
 * UoW ID 16266986
 * Level 04
 * This code is for the first coursework for the Programming Principles 01 module
 * of the first year (Level 04) of the BSc (Hons) Computer Science degree. It is 
 * the source code for a Digital Clock
 * filename: PPCoursework.java
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.Date;
import java.awt.*;
import java.text.*;


public class PPCoursework {
    
    public static void main(String[] args) {
        JFrame myframe = new JFrame("Digital Clock");//Decleration and Initialization of JFrame
        myframe.setSize(1920,1080);//Sets resolution of display window
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Both the window and the program gets destroyed
        myframe.getContentPane().setBackground(new Color(0,0,0));//Background gets a black tone
        myframe.setLayout(new GridLayout(4,1));//Divides the window into 4 rows where the date, time, day and greeting can be displayed
        myframe.setVisible(true);
        
        JLabel mydate = new JLabel();//Decleration of date label
        JLabel mytime = new JLabel();//Decleration of time label
        JLabel myday = new JLabel();//Decleration of day label
        JLabel mygreeting = new JLabel();//Decleration of greeting label
        
        myframe.add(mydate);//Adds mydate label to frame
        myframe.add(mytime);//Adds mytime label to frame
        myframe.add(myday);//Adds myday label to frame
        myframe.add(mygreeting);//Adds mygreeting label to frame
        
        mydate.setFont(new Font("Agency FB", Font.BOLD, 75));//Font formatting for mydate label
        mydate.setForeground(new Color(46,60,30));//Sets font color for text col:green
        mydate.setHorizontalAlignment(SwingConstants.CENTER);//Sets text alignment
        
        mytime.setFont(new Font("Agency FB", Font.BOLD, 90));//Font formatting for mytime label
        mytime.setForeground(new Color(0,100,0));//Sets font color for text
        mytime.setHorizontalAlignment(SwingConstants.CENTER);//Sets text alignment
        
        myday.setFont(new Font("Agency FB", Font.BOLD, 75));//Font formatting for myday label
        myday.setForeground(new Color(46,60,30));//Sets font color for text
        myday.setHorizontalAlignment(SwingConstants.CENTER);//Sets text alignment
        
        mygreeting.setFont(new Font("Century Gothic", Font.PLAIN, 20));//Font formatting for mygreeting label
        mygreeting.setForeground(new Color(46,60,30));//Sets font color for text
        mygreeting.setHorizontalAlignment(SwingConstants.CENTER);//Sets text alignment
                
        while(true) {
            try {
                Thread.sleep(1000);//Execution stops for 1000 milliseconds while current time is displayed
            }
            catch (InterruptedException excp){//Catches the exception(error) that occurs when the program stops due to Thread.sleep(1000);
            }
            
            Date date = new Date();//Declaring a new Date class
            SimpleDateFormat dateOnly = new SimpleDateFormat("d MMMMM, yyyy G");//Sets the date format
            mydate.setText(dateOnly.format(date));//Outputs the system date as text
            
            Date time = new Date();//Declaring a new Date class
            SimpleDateFormat timeOnly = new SimpleDateFormat("hh:mm:ss a z");//Sets the date format
            mytime.setText(timeOnly.format(time));//Outputs the system date as text
            
            Date day = new Date();//Declaring a new Date class
            SimpleDateFormat dayOnly = new SimpleDateFormat("'It''s' EEEE");//Sets the date format
            myday.setText(dayOnly.format(day));//Outputs the system date as text
            
            Date greeting = new Date();//Declaring a new Date class
            SimpleDateFormat greetingOnly = new SimpleDateFormat("'Java "
                    + "Swing Digital Clock brought to you by Dinuka "
                    + "Raneesh Anton Gomez: HAVE A GREAT DAY! '");
            //Sets the greeting
            mygreeting.setText(greetingOnly.format(greeting));//Outputs the greeting
        
        }
    }
    
}
