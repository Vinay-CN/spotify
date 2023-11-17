package Spoty;

import org.w3c.dom.ls.LSOutput;

public class Songs {
    private String songName ;
    private Double songDuration ;

    private String password ;

    public Songs(String songName , Double songDuration){
        this.songName = songName;
        this.songDuration = songDuration ;
    }

    //setters //allow only admin to change the songName
    public void setSongName(String songName, String password){
        if(this.password.equals(password)){
            this.songName = songName;
        }
        return ;
    }

    public void setSongDuration(Double songDuration , String password){

        if(this.password.equals(password)){
            this.songDuration = songDuration;
        }
    }

    //getters
    public String getSongName(){

        return songName ;
    }

    public Double getSongDuration(){

        return songDuration;
    }

    @Override
    public String toString() {
        return
                "songName='" + songName + '\'' +
                ", songDuration=" + songDuration
                ;
    }
}
