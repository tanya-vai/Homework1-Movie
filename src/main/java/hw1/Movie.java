package hw1;

public class Movie {
    String name;
    String genre;
    int year;
    boolean isAwarded;

    public Movie(String name, String genre, int year, boolean isAwarded) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.isAwarded = isAwarded;
    }

    void recommendFilm(){
        if ((genre.equalsIgnoreCase("horror") || genre.equalsIgnoreCase ("thriller"))
                && year<=2000){
            System.out.println("Let's watch " + name + " tonight!");
        }
        else if (genre.equalsIgnoreCase("anime")){
            System.out.println("Totally would like to watch " + name + "! You've got a taste");
        }
        else {
            System.out.println("Not really in a mood to watch " + name);
        }
    }
    void sayGenre(){
        System.out.println("The genre is " + genre);
    }
    void haveAwards(){
        if (isAwarded){
            System.out.println(name + " has some awards");
        }else{
            System.out.println(name + " hasn't got any awards");
        }
    }



}
