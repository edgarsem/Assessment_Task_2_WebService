package lt.viko.eif.esemasko.soap.soap.student;

import myschema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * The MoviesEndpoint class handles SOAP requests for the movie web service.
 * <p>
 * This class maps incoming SOAP requests to corresponding methods and uses
 * the MoviesRepository to process the requests.
 * </p>
 *
 * @author Edgar Semasko
 * @version 1.0
 * @since 1.0
 */
@Endpoint
public class MoviesEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private MoviesRepository moviesRepository;

    @Autowired
    public MoviesEndpoint(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    /**
     * Retrieves a movie by given title.
     *
     * @param request contains the title of the movie to be retrieved
     * @return a response containing the requested movie
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMovieRequest")
    @ResponsePayload
    public GetMovieResponse getMovie(@RequestPayload GetMovieRequest request) {
        GetMovieResponse response = new GetMovieResponse();
        response.setMovie(moviesRepository.findMovieByTitle(request.getName()));
        return response;
    }

    /**
     * Retrieves movies by given genre.
     *
     * @param request contains the genre of the movies to be retrieved
     * @return a response containing a list of movies with the specified genre
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMoviesByGenreRequest")
    @ResponsePayload
    public GetMoviesByGenreResponse getMoviesByGenre(@RequestPayload GetMoviesByGenreRequest request) {
        GetMoviesByGenreResponse response = new GetMoviesByGenreResponse();
        response.getMoviesByGenre().addAll(moviesRepository.findMoviesByGenre(request.getGenre()));
        return response;
    }

    /**
     * Retrieves all movies.
     *
     * @param request an empty request object
     * @return a response containing a list of all movies
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllMoviesRequest")
    @ResponsePayload
    public GetAllMoviesResponse getAllMovies(@RequestPayload GetAllMoviesRequest request) {
        GetAllMoviesResponse response = new GetAllMoviesResponse();
        response.getAllMovies().addAll(moviesRepository.getAllMovies());
        return response;
    }

    /**
     * Retrieves actors of a movie by given title.
     *
     * @param request contains the title of the movie
     * @return a response containing a list of actors for the specified movie
     */
    //
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMovieActorsRequest")
    @ResponsePayload
    public GetMovieActorsResponse getMovieActors(@RequestPayload GetMovieActorsRequest request) {
        GetMovieActorsResponse response = new GetMovieActorsResponse();
        response.getGetMovieActorsReturn().addAll(moviesRepository.getMovieActors(request.getMovieTitle()));
        return response;
    }

    /**
     * Adds a director to a movie by a given title.
     *
     * @param request contains the title of the movie and the director to be added
     * @return a response indicating whether the director was added successfully
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addDirectorRequest")
    @ResponsePayload
    public AddDirectorResponse addDirector(@RequestPayload AddDirectorRequest request) {
        AddDirectorResponse response = new AddDirectorResponse();
        response.setAddedDirector(moviesRepository.addDirector(request.getMovieTitle(), request.getDirector()));
        return response;
    }

    /**
     * Deletes an actor from a movie.
     *
     * @param request contains the IDs of the movie and the actor to be deleted
     * @return a response indicating whether the actor was deleted successfully
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteActorRequest")
    @ResponsePayload
    public DeleteActorResponse deleteActor(@RequestPayload DeleteActorRequest request) {
        DeleteActorResponse response = new DeleteActorResponse();
        response.setDeleteActor(moviesRepository.deleteActor(request.getMovieId(), request.getActorId()));
        return response;
    }

    /**
     * Changes the data of an existing actor.
     *
     * @param request contains the ID of the actor and the new actor data
     * @return a response containing the updated actor
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "changeActorRequest")
    @ResponsePayload
    public ChangeActorResponse changeActor(@RequestPayload ChangeActorRequest request) {
        ChangeActorResponse response = new ChangeActorResponse();
        response.setActor(moviesRepository.changeActorData(request.getActorId(), request.getActor()));
        return response;
    }

    /**
     * Adds a review to a movie.
     *
     * @param request contains the movie ID, user ID, rating, and criticism
     * @return a response indicating whether the review was added successfully
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addReviewRequest")
    @ResponsePayload
    public AddReviewResponse addReview(@RequestPayload AddReviewRequest request) {
        AddReviewResponse response = new AddReviewResponse();
        response.setAddedReview(moviesRepository.addReview(request.getMovieId(), request.getUserId(), request.getRating(), request.getCriticism()));
        return response;
    }

    /**
     * Retrieves the average rating of a movie by a given title.
     *
     * @param request contains the title of the movie
     * @return a response containing the average rating of the specified movie
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAverageRatingRequest")
    @ResponsePayload
    public GetAverageRatingResponse addReview(@RequestPayload GetAverageRatingRequest request) {
        GetAverageRatingResponse response = new GetAverageRatingResponse();
        response.setAverageRating(moviesRepository.getAverageRating(request.getMovieTitle()));
        return response;
    }

    /**
     * Adds a new movie.
     *
     * @param request contains the new movie data
     * @return a response indicating whether the movie was added successfully
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addMovieRequest")
    @ResponsePayload
    public AddMovieResponse addMovie(@RequestPayload AddMovieRequest request) {
        AddMovieResponse response = new AddMovieResponse();
        response.setIsAdded(moviesRepository.addMovie(request.getMovie()));
        return response;
    }
}

