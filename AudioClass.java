

import java.util.Scanner;
/**********************************************************************
 *              Final Project - The Music Player App                   *
 *                                                                     *
 * PROGRAMMER:        Alexis Anderson                                  *
 * CLASS:             CS200 – Object Oriented Programming              *
 * INSTRUCTOR:        Dean Zeller                                      *
 * TERM:              Spring 2020                                      *
 * SUBMISSION DATE:   5/1/2021                                         *
 *                                                                     *
 * DESCRIPTION:                                                        *
 * The following is an OOP definition for a song object.               *
 *                                                                     *
 * COPYRIGHT:                                                          *
 * This program is copyright (c)2020 Alexis Anderson and Dean Zeller.  *
 * Based on a template written by Tom Jensen and Dean Zeller.          *
 * It is original work without use of outside sources.                 *
 *                                                                     *
 **********************************************************************/
import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
  
public class AudioClass
{
   
    // to store current position 
    Long currentFrame; 
    Clip clip; 
 
    AudioInputStream audioInputStream; 
    static String filePath; 
  
    // constructor to initialize streams and clip 
    
    /***********************************************************************
     * Method:  AudioClass(String filePath)                                  *
     * Purpose:  gets audio                                                  *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public AudioClass(String filePath) 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
        // create AudioInputStream object 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
           
    } 
  
     /***********************************************************************
     * Method:  play                                                         *
     * Purpose:  plays sound                                                 *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void play()  
    { 
        //start the clip 
        clip.stop(); 
        clip.setFramePosition(0);
        clip.start();  
        clip.loop(1);
       
       
        
     
}
    
} 

