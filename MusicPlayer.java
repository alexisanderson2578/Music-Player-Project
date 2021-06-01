import java.util.*;
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
public class MusicPlayer
{
    SongCollection c1 = new SongCollection();
    private ArrayList<SongCollection> playlists; 
    private String name; 
    public MusicPlayer(String name_)
    {
        this.name = name_;
        this.playlists = new ArrayList<SongCollection>();
    }

    // no initial parameters
    public MusicPlayer()
    {
        this("My Music Player");
    }

    /***********************************************************************
     * Method:   getSize()                                                   *
     * Purpose:  gets size of  collection                                    *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public int getSize()
    {
        return this.playlists.size();
    }

    /***********************************************************************
     * Method:   addPlaylist                                                 *
     * Purpose:  adds a new playlist to the collection                       *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void addPlaylist(SongCollection newPlaylist)
    {   
        this.playlists.add(newPlaylist);
    }


/***********************************************************************
 * Method:   shufflePlaylist                                             *
 * Purpose:  shuffles playlist                                           *       
 * Parameters:  n/a                                                      *   
 * Return value: n/a                                                     *
 ***********************************************************************/
public void shufflePlaylist()
{
Collections.shuffle(playlists);
}

/***********************************************************************
 * Method:   printPlaylistList()                                        *
 * Purpose:  prints list                                                *       
 * Parameters:  n/a                                                      *   
 * Return value: n/a                                                     *
 ***********************************************************************/
public void printPlaylistList(){
for ( SongCollection i: playlists){
i.printCollectionList();
}
} 

/***********************************************************************
 * Method:   printPlaylistTable()                                        *
 * Purpose:  prints table                                                *       
 * Parameters:  n/a                                                      *   
 * Return value: n/a                                                     *
 ***********************************************************************/
public void printPlaylistTable(){
for ( SongCollection i: playlists){
i.printCollectionTable();
}
} 

}