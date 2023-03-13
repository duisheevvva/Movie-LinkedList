import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Director director1 = new Director("Gerri ", "Skott");
        Director director2 = new Director("James", "Kemeron");
        Director director3 = new Director("Catherine", "Hardwicke");


        List<Cast> casts1 = new LinkedList<>();
        List<Cast> casts2 = new LinkedList<>();
        List<Cast> casts3 = new LinkedList<>();
        Cast cast1 = new Cast("Vin Dizel", "main role1");
        Cast cast2 = new Cast("Sem Ourtington", "main role2");
        Cast cast3 = new Cast("Kristen Stewart", "main role3");

        casts1.add(cast1);
        casts2.add(cast2);
        casts3.add(cast3);

        List<Movie> movies = new LinkedList<>();
        Movie movie1 = new Movie("Fast Furious", 2001, "action movie", director1, casts1);
        Movie movie2 = new Movie("Avatar", 2009, "Franshiza", director2, casts2);
        Movie movie3 = new Movie("Sumerki", 2008, "romans fantasy", director3, casts3);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        int search = new Scanner(System.in).nextInt();

        Movies movies1 = new Movies();
        Sorts sorts = new Sorts();

        switch (search) {
            case 1 -> movies1.getAllMovies(movies);
            case 2 -> movies1.findMovieByName(movies);
            case 3 -> movies1.findMovieByActorName(movies);
            case 4 -> movies1.findMovieByYear(movies);
            case 5 -> movies1.findMovieByDirector(movies);
            case 6 -> movies1.findMovieByDescription(movies);
            case 7 -> movies1.findMovieByRole(movies);
            case 8 -> sorts.sortByMovieName(movies);
            case 9 -> sorts.sortByYear(movies);
            case 10 -> sorts.sortByDirector(movies);
        }


    }
}