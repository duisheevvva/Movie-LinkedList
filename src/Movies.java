import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Movies implements Findable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie movie1 : movies) {
            System.out.println(movie1.toString());
        }return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {

        String b = new Scanner(System.in).nextLine();
        for (Movie movie2 : movies) {
            if (movie2.getName().toUpperCase().equals(b)) {
                System.out.println(movie2.toString());
            }
        }
        }

    @Override
    public void findMovieByActorName(List<Movie> movies) {

        String v = new Scanner(System.in).nextLine();
        for (Movie movie3 : movies) {
            for (Cast cast1 : movie3.getCast()) {
                if (cast1.getActorFullName().toUpperCase().equals(v)) {
                    System.out.println(cast1.toString());
                }
            }
        }
    }


    @Override
    public void findMovieByYear(List<Movie> movies) {

        int v = new Scanner(System.in).nextInt();
        for (Movie movie4 : movies) {
            if (movie4.getYear() == v) {
                System.out.println(movie4.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {

        String s = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie5 : movies) {
            if (movie5.getDirector().getName().toUpperCase().equals(s)) {
                System.out.println(movie5.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {

        String d = new Scanner(System.in).nextLine();
        for (Movie movie6 : movies) {
            if (movie6.getDescription().toUpperCase().equals(d)) {
                System.out.println(movie6.toString());
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {

        String f = new Scanner(System.in).nextLine();
        for (Movie movie7 : movies) {
            for (Cast cast : movie7.getCast()) {
                if (cast.getRole().toUpperCase().equals(f)) {
                    System.out.println(cast.toString());
                }
            }
        }
    }


}
