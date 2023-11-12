package Spoty;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private  String singerName ;

    private String albumName ;

    private List<Songs> songsList ;

    public Album(String singerName, String albumName,List<Songs> songsList){
        this.singerName = singerName ;
        this.albumName = albumName ;
        this.songsList = songsList ;
    }
    //if user want to create
    public boolean findSong(String songName){
        for(Songs s : songsList){
            if(s.getSongName().equals(songName)){
                return true;
            }
        }
        return false;
    }

    public String addSong(String songName , Double songDuration){
        if(!findSong(songName)){
            return songName+" is already present" ;
        }
        else {
            songsList.add(new Songs(songName,songDuration));
            return songName+" has been added Sucessfully";
        }0
    }
    public Album(String singerName , String albumName){
        this.singerName = singerName;
        this.albumName = albumName ;
        this.songsList = new ArrayList<>();
    }

    public String getSingerName(){
        return singerName;
    }

    public String getAlbumName(){
        return albumName;
    }

    public List<Songs> getSongsList(){
        return songsList;
    }
}
