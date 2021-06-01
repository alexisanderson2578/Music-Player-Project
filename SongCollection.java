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

public class SongCollection 
{
    /**************************************************************
     * ATTRIBUTES                                                  *
     **************************************************************/
    private String name;
    private ArrayList<Song> songs;
    private ArrayList<Song> likedsongs;

    /**************************************************************
     * CONSTRUCTORS                                                *
     **************************************************************/
    // all necessary parameters for attributes
    public SongCollection(String name_)
    {
        this.name = name_;
        this.songs = new ArrayList<Song>();
        this.likedsongs = new ArrayList<Song>();
    }

    // no initial parameters
    public SongCollection()
    {
        this("My Song collection");
    }

    /**************************************************************
     * GET and SET METHODS                                         *
     **************************************************************/

    // return a comic given the index
    public Song getSong(int index)  
    {
        return this.songs.get(index);
    }

    // return the number of comics in the array
    public int getSize()
    {
        return this.songs.size();
    }

    public String getName(){
        return this.name;
    }
    /**************************************************************
     * OUTPUT METHODS                                              *
     **************************************************************/

    /***********************************************************************
     * Method:   printCollection                                              *
     * Purpose: print the entire collection, with title and summary information                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    // print the entire collection, with title and summary information

    public void printCollectionList()
    {
        System.out.println("\nCollection: "+this.name+"\n");
        System.out.println("--------------------------------------------");
        int counter = 0;
        for (int i = 0; i < this.songs.size(); i++)
        {
            System.out.println((i+1)+": "+ this.getSong(i).toString());
        }
        System.out.println(this.songs.size()+" in collection.");
        System.out.println("--------------------------------------------");
    }

    public void printCollectionTable(){
        System.out.format("%8s %8s %8s %8s %8s %8s %8s %8s %n","# in sequence" ,"Title","Artist","Genre","Album","Downloaded","Song Time","# of plays");

        System.out.println("---------------------------------------------------------------------------------------------------");
        for (int i = 0; i < this.songs.size(); i++)
        {
            System.out.println((i+1)+": "+ this.getSong(i).songTable());
        }
    }

    /***********************************************************************
     * Method:   printSummary                                              *
     * Purpose:  print a summary of the collection                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    // print a summary of the collection
    public void printSummary()
    {
        for (int i = 0; i < this.songs.size(); i++)
        {
            System.out.println(this.getSong(i).description());
        }
    }

    /**************************************************************
     * OTHER METHODS                                               *
     **************************************************************/
    /***********************************************************************
     * Method:   addSong                                              *
     * Purpose:  adds a new song to the collection                             *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void addSong(Song newSong)
    {
        this.songs.add(newSong);
    }

    /***********************************************************************
     * Method:   search by title                                             *
     * Purpose:  searches by title                                           *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void SearchByTitle(String titlesearch)
    {
        boolean titlefound = false;
        for(Song i: songs){
            if (i.getTitle().equals(titlesearch)){
                System.out.println("Title found: " + i.getTitle());
                titlefound = true;
            }

        }
        if (titlefound == false) {
            System.out.println("Title not found");
        }
    }

    /***********************************************************************
     * Method:   searchByArtist                                              *
     * Purpose:  searches by artist                                          *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void SearchByArtist(String artistsearch)
    {
        boolean artistfound = false;
        for(Song i: songs){
            if (i.getArtist().equals(artistsearch)){
                System.out.println("Artist found: " +i.getArtist());
                artistfound = true;
            }
        }
        if (artistfound == false) {
            System.out.println("Artist not found");
        }

    }

    /***********************************************************************
     * Method:   shufflePlaylist                                             *
     * Purpose:  shuffles playlist                                           *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void shufflePlaylist()
    {
        Collections.shuffle(songs);
    }

    /***********************************************************************
     * Method:  deleteSong(int index)                                        *
     * Purpose:  deletes song                                                *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void deleteSong(int index){
        songs.remove(index);
    }

    /***********************************************************************
     * Method:  likedSongs()                                                 *
     * Purpose: makes like song playlist                                     *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void likedSongs(){
        for(Song i: songs){

            if(i.getlikeSong() != false){
                this.likedsongs.add(i);
            }
        }
    }

    /***********************************************************************
     * Method:  get Liked Song                                               *
     * Purpose:  gets liked  songs                                           *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/

    public ArrayList<Song> getLikedSongs(){
        return likedsongs;
    }

    /***********************************************************************
     * Method:  playSounds()                                                 *
     * Purpose: plays each song                                              *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void playSounds(){
        for(Song i: songs){
            try {
                AudioClass sound = new AudioClass("/Users/alexisanderson/Desktop/StarWars3.wav");
                Scanner in = new Scanner(System.in);
                sound.play();

        
            }
            catch (Exception ex)

            {
                System.out.println("Error with playing sound."); 
                ex.printStackTrace(); 
            }
        }

    }
}
