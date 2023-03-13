import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorts implements Sortable {

    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(Movie.sortByMovieName);
        for (Movie movie1:movies) {
            System.out.println(movie1);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(Movie.sortByMovieYear);
        for (Movie movie2 : movies) {
            System.out.println(movie2);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(Movie.sortByMovieDirector);
        for ( Movie movie3: movies) {
            System.out.println(movie3);
        }
    }


}
