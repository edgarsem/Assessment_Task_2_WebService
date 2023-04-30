package lt.viko.eif.esemasko.soap.soap.student;

import jakarta.annotation.PostConstruct;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import myschema.*;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * MoviesRepository class representing a repository for storing movies and related data.
 */
@Component
public class MoviesRepository {

    private static final List<Movie> movies = new ArrayList<>();

    /**
     * Initializes the repository with some predefined data.
     */
    @PostConstruct
    public void initData() {

        Genre comedy = new Genre();
        comedy.setId((byte) 0);
        comedy.setCategory("Comedy");

        Genre action = new Genre();
        action.setId((byte) 1);
        action.setCategory("Action");

        Genre adventure = new Genre();
        adventure.setId((byte) 2);
        adventure.setCategory("Adventure");


        Director danielKwanD = new Director();
        danielKwanD.setId((byte) 0);
        danielKwanD.setName("Daniel");
        danielKwanD.setLastName("Kwan");

        Director danielScheinertD = new Director();
        danielScheinertD.setId((byte) 1);
        danielScheinertD.setName("Daniel");
        danielScheinertD.setLastName("Scheinert");

        Director joeRussoD = new Director();
        joeRussoD.setId((byte) 2);
        joeRussoD.setName("Joe");
        joeRussoD.setLastName("Russo");

        Director anthonyRussoD = new Director();
        anthonyRussoD.setId((byte) 3);
        anthonyRussoD.setName("Anthony");
        anthonyRussoD.setLastName("Russo");


        Writer danielKwanW = new Writer();
        danielKwanW.setId((byte) 0);
        danielKwanW.setName("Daniel");
        danielKwanW.setLastName("Kwan");

        Writer danielScheinertW = new Writer();
        danielScheinertW.setId((byte) 1);
        danielScheinertW.setName("Daniel");
        danielScheinertW.setLastName("Scheinert");

        Writer joeRussoW = new Writer();
        joeRussoW.setId((byte) 2);
        joeRussoW.setName("Joe");
        joeRussoW.setLastName("Russo");

        Writer anthonyRussoW = new Writer();
        anthonyRussoW.setId((byte) 3);
        anthonyRussoW.setName("Anthony");
        anthonyRussoW.setLastName("Russo");


        Actor michelleYeoh = new Actor();
        michelleYeoh.setId((byte) 0);
        michelleYeoh.setName("Michelle");
        michelleYeoh.setLastName("Yeoh");
        michelleYeoh.setAge((byte) 60);

        Actor jamieLeeCurtis = new Actor();
        jamieLeeCurtis.setId((byte) 1);
        jamieLeeCurtis.setName("Jamie Lee");
        jamieLeeCurtis.setLastName("Curtis");
        jamieLeeCurtis.setAge((byte) 64);

        Actor keHuyQuan = new Actor();
        keHuyQuan.setId((byte) 2);
        keHuyQuan.setName("Ke Huy");
        keHuyQuan.setLastName("Quan");
        keHuyQuan.setAge((byte) 51);

        Actor stephanieHsu = new Actor();
        stephanieHsu.setId((byte) 3);
        stephanieHsu.setName("Stephanie");
        stephanieHsu.setLastName("Hsu");
        stephanieHsu.setAge((byte) 32);

        Actor robertDowneyJr = new Actor();
        robertDowneyJr.setId((byte) 4);
        robertDowneyJr.setName("Robert");
        robertDowneyJr.setLastName("Downey Jr.");
        robertDowneyJr.setAge((byte) 61);

        Actor chrisEvens = new Actor();
        chrisEvens.setId((byte) 5);
        chrisEvens.setName("Chris");
        chrisEvens.setLastName("Evens");
        chrisEvens.setAge((byte) 41);

        Actor chrisHemsworth = new Actor();
        chrisHemsworth.setId((byte) 6);
        chrisHemsworth.setName("Chris");
        chrisHemsworth.setLastName("Hemsworth");
        chrisHemsworth.setAge((byte) 39);

        Actor scarlettJohansson = new Actor();
        scarlettJohansson.setId((byte) 7);
        scarlettJohansson.setName("Scarlett");
        scarlettJohansson.setLastName("Johansson");
        scarlettJohansson.setAge((byte) 42);


        User user1 = new User();
        user1.setId((byte) 0);
        user1.setName("Edgar");
        user1.setLastName("Semasko");

        User user2 = new User();
        user2.setId((byte) 1);
        user2.setName("John");
        user2.setLastName("Doe");


        MovieReview review1 = new MovieReview();
        review1.setId((byte) 0);
        review1.setRating((byte) 10);
        review1.setCriticism("This movie is awesome.");
        review1.setUser(user1);

        MovieReview review2 = new MovieReview();
        review2.setId((byte) 1);
        review2.setRating((byte) 9);
        review2.setCriticism("I really like this movie.");
        review2.setUser(user2);

        MovieReview review3 = new MovieReview();
        review3.setId((byte) 2);
        review3.setRating((byte) 10);
        review3.setCriticism("This movie rocks.");
        review3.setUser(user1);

        MovieReview review4 = new MovieReview();
        review4.setId((byte) 3);
        review4.setRating((byte) 8);
        review4.setCriticism("I kinda like this movie.");
        review4.setUser(user2);


        Movie movie1 = new Movie();
        movie1.setId((byte) 0);
        movie1.setTitle("Everything Everywhere All at Once");
        movie1.setLength((short) 140);
        movie1.getGenres().addAll(List.of(comedy, action, adventure));
        movie1.getDirectors().addAll(List.of(danielKwanD, danielScheinertD));
        movie1.getWriters().addAll(List.of(danielKwanW, danielScheinertW));
        movie1.getCast().addAll(List.of(michelleYeoh, jamieLeeCurtis, keHuyQuan, stephanieHsu));
        movie1.getReviews().addAll(List.of(review1, review2));


        movies.add(movie1);


        Movie movie2 = new Movie();
        movie2.setId((byte) 1);
        movie2.setTitle("Avengers: Infinity War");
        movie2.setLength((short) 149);
        movie2.getGenres().addAll(List.of(action, adventure));
        movie2.getDirectors().addAll(List.of(joeRussoD, anthonyRussoD));
        movie2.getWriters().addAll(List.of(joeRussoW, anthonyRussoW));
        movie2.getCast().addAll(List.of(robertDowneyJr, chrisEvens, chrisHemsworth, scarlettJohansson));
        movie2.getReviews().addAll(List.of(review3, review4));


        movies.add(movie2);
        System.out.println(movies);
    }

    /**
     * Finds a movie by its title.
     *
     * @param title the title of the movie to find
     * @return the movie with the specified title, or null if no such movie exists
     */
    public Movie findMovieByTitle(String title) {
        Assert.notNull(title, "The movie's title must not be null");
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Finds movies by genre.
     *
     * @param genreName the name of the genre to search for
     * @return a list of movie titles belonging to the specified genre
     */
    public List<String> findMoviesByGenre(String genreName) {
        Assert.notNull(genreName, "The genre must not be null");
        List<String> movieList = new ArrayList<String>();
        for (Movie movie : movies) {
            for (Genre genre : movie.getGenres()) {
                if (genre.getCategory().equals(genreName)) {
                    movieList.add(movie.getTitle());
                    break;
                }
            }
        }
        return movieList;
    }

    /**
     * Returns a list of all movies.
     *
     * @return a list of all movies in the repository
     */
    public List<Movie> getAllMovies() {
        return movies;
    }

    /**
     * Returns a list of actors for a movie with the given title.
     *
     * @param movieTitle the title of the movie for which to retrieve the actors
     * @return a list of actors in the specified movie
     */
    public List<Actor> getMovieActors(String movieTitle) {
        Assert.notNull(movieTitle, "The movie title must not be null");
        List<Actor> actorList = new ArrayList<Actor>();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(movieTitle))
                actorList.addAll(movie.getCast());
        }
        return actorList;
    }

    /**
     * Adds a director to the movie with the specified title.
     *
     * @param movieTitle the title of the movie to add the director to
     * @param director   the director to be added
     * @return true if the director was added successfully, false otherwise
     */
    public boolean addDirector(String movieTitle, Director director) {
        Assert.notNull(movieTitle, "The movie title must not be null");
        Assert.notNull(director, "The director object must not be null");
        for (Movie movie : movies) {
            if (movie.getTitle().equals(movieTitle)) {
                movie.getDirectors().add(director);
                return true;
            }
        }
        return false;
    }


    /**
     * Deletes an actor from the movie with the specified movieId.
     *
     * @param movieId the ID of the movie from which to delete the actor
     * @param actorId the ID of the actor to be deleted
     * @return true if the actor was deleted successfully, false otherwise
     */
    public boolean deleteActor(int movieId, int actorId) {
        Assert.notNull(actorId, "The actors id must not be null");
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                for (Actor actor : movie.getCast()) {
                    if (actor.getId() == actorId) {
                        movie.getCast().remove(actor);
                        return true;
                    }
                }
            }
        }
        return false;
    }


    /**
     * Changes the data of the actor with the specified actorId.
     *
     * @param actorId   the ID of the actor to be changed
     * @param actorData the new data for the actor
     * @return the updated actor, or null if the actor was not found
     */
    public Actor changeActorData(int actorId, Actor actorData) {
        Assert.notNull(actorId, "The actors id must not be null");
        Assert.notNull(actorData, "The actor object must not be null");

        for (Movie movie : movies) {
            for (Actor actor : movie.getCast()) {
                if (actor.getId() == actorId) {
                    actor.setName(actorData.getName());
                    actor.setLastName(actorData.getLastName());
                    actor.setAge(actorData.getAge());
                    return actor;
                }
            }

        }
        return null;
    }

    /**
     * Adds a review for the movie with the specified movieId.
     *
     * @param movieId   the ID of the movie to add the review to
     * @param userId    the ID of the user who wrote the review
     * @param rating    the rating given by the user
     * @param criticism the user's criticism of the movie
     * @return true if the review was added successfully, false otherwise
     */
    public boolean addReview(int movieId, int userId, int rating, String criticism) {
        Assert.notNull(movieId, "The movie id must not be null");
        Assert.notNull(userId, "The user id must not be null");
        Assert.notNull(rating, "The rating must not be null");
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                int tempId = movie.getReviews().get(movie.getReviews().size() - 1).getId() + 1;
                for (MovieReview review : movie.getReviews()) {
                    if (review.getUser().getId() == userId) {
                        MovieReview tempReview = new MovieReview();
                        tempReview.setId((byte) tempId);
                        tempReview.setCriticism(criticism);
                        tempReview.setRating((byte) rating);
                        tempReview.setUser(review.getUser());
                        movie.getReviews().add(tempReview);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns average rating of a movie with a given title.
     *
     * @param movieTitle the title of the movie to get the rating from
     * @return average rating of a movie if movie found successfully, returns 0 otherwise
     */
    public double getAverageRating(String movieTitle) {
        Assert.notNull(movieTitle, "The movie title must not be null");
        for (Movie movie : movies) {
            if (movie.getTitle().equals(movieTitle)) {
                double average = 0;
                for (MovieReview review : movie.getReviews())
                    average += review.getRating();
                average /= movie.getReviews().size();

                DecimalFormat df = new DecimalFormat("#.#");
                String formatted = df.format(average);
                double result = Double.parseDouble(formatted);

                return result;
            }
        }
        return 0;
    }

    /**
     * Adds a new movie to movies repository.
     *
     * @param movie a movie to be added
     * @return true when movie was added
     */
    public boolean addMovie(Movie movie) {
        movies.add(movie);
        return true;
    }
}
