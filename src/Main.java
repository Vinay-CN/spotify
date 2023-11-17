import Spoty.Album;
import Spoty.Songs;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Album a1 = new Album("MyAlbum","Vinay");
        a1.addSong("kannadaa",4.3);
        a1.addSong("ಹೊಸ ಹೊಸ ಪಾಟಗಳು", 4.3);
        a1.addSong("ಮೂಡು ಗಂಟೆಗಳ ಪಾಟ", 3.8);
        a1.addSong("ಕಾಡು ಪಾಟಗಳು", 5.2);
        a1.addSong("ಹೊಸ ಸಂಗೀತ", 4.0);
        a1.addSong("ಗೀತೆಗಳ ಕೆಲವು", 3.5);
        a1.addSong("ಹಾಡುಗಳ ಹರಿತ ಹೊಡೆ", 4.7);
        a1.addSong("ಅಂಗರಾಗ ಹಾಡುಗಳು", 3.2);
        a1.addSong("ಸುಂದರ ಸಂಗೀತ", 5.5);
        a1.addSong("ಹೆಚ್ಚಿನ ಹಾಡುಗಳು", 4.9);
        a1.addSong("ಹಾಡು 10", 3.0);



        List<Songs> songs = new ArrayList<>();
        songs.add(new Songs("ಹೊಸ ಹೊಸ ಪಾಟಗಳು", 4.3));
        songs.add(new Songs("ಮೂಡು ಗಂಟೆಗಳ ಪಾಟ", 3.8));
        songs.add(new Songs("ಕಾಡು ಪಾಟಗಳು", 5.2));
        songs.add(new Songs("ಹೊಸ ಸಂಗೀತ", 4.0));
        songs.add(new Songs("ಗೀತೆಗಳ ಕೆಲವು", 3.5));
        songs.add(new Songs("ಹಾಡುಗಳ ಹರಿತ ಹೊಡೆ", 4.7));
        songs.add(new Songs("ಅಂಗರಾಗ ಹಾಡುಗಳು", 3.2));
        songs.add(new Songs("ಸುಂದರ ಸಂಗೀತ", 5.5));
        songs.add(new Songs("ಹೆಚ್ಚಿನ ಹಾಡುಗಳು", 4.9));
        songs.add(new Songs("ಹಾಡು 10", 3.0));


        Album a2 = new Album("fav","manu",songs);


        List<Songs> playList = new ArrayList<>();
        a1.addSongToPlayList(1,playList);
        a1.addSongToPlayList(3,playList);
        a1.addSongToPlayList(5,playList);
        a2.addSongToPlayList(1,playList);
        a2.addSongToPlayList(3,playList);
        a2.addSongToPlayList(5,playList);


        int currIndex = 0 ;
             System.out.println("Now Playing Song is "+playList.get(currIndex).toString());
            printMenu();

            Scanner sc = new Scanner(System.in);

          boolean keepPlaying = true;
          while(keepPlaying){

              System.out.println("Enter your choice");
              int choice = sc.nextInt();

              switch(choice) {
                  case 1 : if(currIndex!=playList.size()-1)
                                currIndex++;
                             else
                                 currIndex = 0;
                            System.out.println("Now Playing"+playList.get(currIndex).toString());
                            break;
                  case 2 :
                            if(currIndex!=0)
                                currIndex--;
                            System.out.println("Now Playing"+playList.get(currIndex).toString());
                            break;
                  case 3:
                      System.out.println("Now Playing"+playList.get(currIndex).toString());
                      break ;

                  case 4:
                        printPlayList(playList);
                            break;

                  case 5 : Collections.shuffle(playList);
                            break;
                  case 6: printMenu();
                            break ;
                  case 7: playList.remove(currIndex);
                            break ;
                  case 8: keepPlaying = false ;
                            break;

              }


          }





    }

    public static void printPlayList(List<Songs> playList){
        int i = 1;
        for(Songs s : playList){
            System.out.println(i++ +" . "+ s.getSongName()+" "+s.getSongDuration());
        }
    }
    public static void printMenu(){

        System.out.println("Enter your choice");
        System.out.println("1. Play the next song");
        System.out.println("2. Play the previous song");
        System.out.println("3. Repeat the current song");
        System.out.println("4. Show PlayList");
        System.out.println("5. Shuffle the playlist");
        System.out.println("6. Print Menu");
        System.out.println("7. Delete the Song");
        System.out.println("8. Exit the playList");

    }
}