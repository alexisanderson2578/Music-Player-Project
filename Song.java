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
import java.util.*;
public class Song 
{
    /**************************************************************
     * ATTRIBUTES                                                  *
     **************************************************************/
    private String title;
    private int playNum;
    private boolean download;
    private String album;
    private String artist;
    private String genre;
    private double songTime;
    private boolean likeSong;

    /**************************************************************
     * CONSTRUCTORS                                                *
     **************************************************************/

    //all necessary parameters for attributes
    public Song(String title, 
    String album, 
    String artist,
    String genre,
    double songTime,
    int playNum, 
    boolean download, boolean likeSong) 
    {
        this.title = title;
        this.playNum = playNum;
        this.artist = artist;
        this.genre = genre;
        this.songTime = songTime;
        this.download = download;
        this.album = album;
        this.likeSong = likeSong;
    }

    //condition and value omitted
    public Song(String title, 
    String album, 
    String artist,
    String genre
    ) 
    {
        this(title, 
            album, 
            artist, 
            genre,
            0.00,
            0,
            false, 
            false);     // songtime, download, playnum omitted
    }

    //only series name and issue number
    public Song( int playNum, 
    boolean download,
    double songTime, boolean likeSong) 
    {
        this(null, 
            null,
            null,
            null,
            songTime,
            playNum,
            download, 
            likeSong
        );     // value omitted
    }

    public Song( String title, 
    String artist ,
    int playNum) 
    {
        this(title, 
            null,
            artist,
            null,
            0.00,
            playNum,
            false, false
        );
    }

    /**************************************************************
     * GET and SET METHODS                                         *
     **************************************************************/
    /***********************************************************************
     * Method:   setTitle                                                     *
     * Purpose:  sets the title                                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/

    public void setTitle(String title)
    {
        this.title = title;
    }

    /***********************************************************************
     * Method:   getTitle                                                     *
     * Purpose:  gets the title                                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public String getTitle()
    {
        return this.title;
    }

    /***********************************************************************
     * Method:   setPlayNum                                                     *
     * Purpose:  sets the playNum                                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void setPlayNum(int playNum)
    {
        this.playNum = playNum;
    }

    /***********************************************************************
     * Method:   getplaynum                                                  *
     * Purpose:  gets playnum                                               *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public int getPlayNum()
    {
        return this.playNum;
    }

    public void setAlbum(String album)
    {
        this.album = album;
    }

    public String getAlbum()
    {
        return this.album;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public void setSongTime(double songTime)
    {
        this.songTime = songTime;
    }

    public double getSongTime()
    {
        return this.songTime;
    }

    public void setDownload(boolean download)
    {
        this.download = download;
    }

    public boolean getDownload()
    {
        return this.download;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getGenre()
    {
        return this.genre;
    }

    public boolean getlikeSong()
    {
        return this.likeSong;
    }
    /**************************************************************
     * OUTPUT METHODS                                              *
     **************************************************************/
    /***********************************************************************
     * Method:   description                                                 *
     * Purpose:  creates a description of song                               *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    //Return a string with only the title and issue number
    public String description() 
    {
        return this.title + " Artist: " + this.artist;
    }

    /***********************************************************************
     * Method:   toString                                                    *
     * Purpose:  Return the entire object as a single String                 *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    //Return the entire object as a single String
    public String toString()
    {
        String result = "Title: " +this.title+" Artist: " + this.artist;
        if (this.genre!=null)
        {
            result += "\n  Genre: "+this.genre;
        }
        if (this.album!=null)
        {
            result += "\n  Album: "+this.album;
        }
        if (this.download!= false)
        {
            result += "\n  downloaded";
        }
        if (this.songTime !=0.00)
        {
            result += "\n  Song Time: "+this.songTime;
        }
        if (this.playNum !=0)
        {
            result += "\n  Number of plays: "+this.playNum;
        }
        if (this.likeSong != false)
        {
            result += "\n  Liked Song";
        }
        result += "\n";
        return result;
    }

    public String songTable(){
        return String.format("%12s %12s %12s %12s %12b %12f %12d %12s %n", this.title, this.artist,this.genre,this.album,this.download,this.songTime,this.playNum, this.likeSong);
    }
    /**************************************************************
     * OTHER METHODS                                               *
     *
     **************************************************************/
    /***********************************************************************
     * Method:   replaySong                                                    *
     * Purpose:  Replays the song                                           *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/

    public Song replaySong()
    {
        return new Song(this.title,this.artist, this.playNum+1);
    }

}