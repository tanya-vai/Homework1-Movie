package hw1;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie =  new Movie("The Thing", "Horror", 1982, true);
        Movie secondMovie =  new Movie("Your name", "Anime", 2016, true);
        Movie thirdMovie =  new Movie("Butchers", "Thriller", 2020, false);
        firstMovie.recommendFilm();
        firstMovie.sayGenre();
        firstMovie.haveAwards();

        secondMovie.recommendFilm();
        secondMovie.sayGenre();
        secondMovie.haveAwards();

        thirdMovie.recommendFilm();
        thirdMovie.sayGenre();
        thirdMovie.haveAwards();

    }


}
