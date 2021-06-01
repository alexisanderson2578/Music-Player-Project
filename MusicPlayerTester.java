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
public class MusicPlayerTester
{       
    public static void main(String[] args) 
    {
        SongCollection collection1 = new SongCollection();
        Song tempsong;
         tempsong = new Song("Pretty Girl", 
                                        "Pretty Girl", 
                                        "Clairo", 
                                        "Bedroom Pop", 2.56, 100000, true, true);
        collection1.addSong(tempsong);
        
        tempsong = new Song("Electric Feel", 
                                        "Oracular Spectacular", 
                                        "MGMT", 
                                        "Alt", 3.34, 900000, false, false);
        collection1.addSong(tempsong);
        
        collection1.playSounds();
        // Make changes through get and set methods
        collection1.getSong(0).setTitle("Come Down");
        collection1.getSong(1).setArtist("Caribbean Skies");
       
        collection1.SearchByArtist("Clairo");
        collection1.SearchByTitle("Come Down");
        collection1.likedSongs();
        System.out.println(collection1.getLikedSongs());
        
        
        SongCollection collection2 = new SongCollection();
        Song tempsong2;
         tempsong2 = new Song("Pretty Girl", 
                                        "Pretty Girl", 
                                        "Clairo", 
                                        "Bedroom Pop", 2.56, 100000, true, true);
        collection2.addSong(tempsong2);
        
        tempsong2 = new Song("Electric Feel", 
                                        "Oracular Spectacular", 
                                        "MGMT", 
                                        "Alt", 3.34, 900000, false, false);
        collection2.addSong(tempsong2);
        collection2.addSong(tempsong2);
        
        
      MusicPlayer MusicPlayer1 = new MusicPlayer();
        SongCollection playlist1;
         playlist1 = new SongCollection();
         
       MusicPlayer1.addPlaylist(collection1);
       MusicPlayer1.addPlaylist(collection2);
       
        MusicPlayer1.shufflePlaylist();
        MusicPlayer1.printPlaylistList();
        System.out.println(MusicPlayer1.getSize());
        
}
}