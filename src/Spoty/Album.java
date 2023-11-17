package Spoty;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String singerName;

    private String albumName;

    private List<Songs> songsList;

    public Album(String singerName, String albumName, List<Songs> songsList) {
        this.singerName = singerName;
        this.albumName = albumName;
        this.songsList = songsList;
    }

    //if user want to create
    public boolean findSong(String songName) {
        for (Songs s : songsList) {
            if (s.getSongName().equals(songName)) {
                return true;
            }
        }
        return false;
    }

    public String addSong(String songName, Double songDuration) {
        if (findSong(songName)) {
            return songName + " is already present";
        } else {
            songsList.add(new Songs(songName, songDuration));
            return songName + " has been added Sucessfully";
        }
    }

    public Album(String singerName, String albumName) {
        this.singerName = singerName;
        this.albumName = albumName;
        this.songsList = new ArrayList<>();
    }

    public String getSingerName() {

        return singerName;
    }

    public String getAlbumName() {

        return albumName;
    }

    public List<Songs> getSongsList() {

        return songsList;
    }


    public String addSongToPlayList(int songNo,List<Songs> playList){

        int index = songNo -1;

        if(index>=0 && index<songsList.size()){

            Songs songObj = songsList.get(index);
            playList.add(songObj);
            return "Song has been added to the playList";
        }

        return "Song no entered is Invalid";
    }

    public String addSongToPlayList(String songName,List<Songs> playList) {

        for(Songs song : songsList){
            if(song.getSongName().equals(songName)){
                playList.add(song);
                return "Song added to PlayList";
            }
        }

        return "No song with this songName existed in the album SongList";

    }
    @Override
    public String toString() {
        return "Album{" + "singerName='" + singerName + '\'' + ", albumName='" + albumName + '\'' + ", songsList=" + songsList + '}';
    }
}