package com.example.FilmTheatre.service.impl;

import com.example.FilmTheatre.model.Movie;
import com.example.FilmTheatre.repository.MovieRepository;
import com.example.FilmTheatre.service.MovieService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    @Override
    public void saveMovieIfNotExists(Movie movie) {
        Optional<Movie> existingMovie = movieRepository.findByTitle(movie.getTitle());
        if (existingMovie.isEmpty()) {
            movieRepository.save(movie);
        }
    }
    @PostConstruct
    public void init() {
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028687.jpg?v=9",
                "VENOM THE LAST DANCE", "Action", "English", "https://youtu.be/8cAkGmzUqOY"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028574.jpg?v=9",
                "VETTAIYAN", "Drama", "Tamil", "https://youtu.be/zPqMbwmGC1U"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028738.jpg?v=9",
                "BLACK", "Horror", "Tamil", "https://youtu.be/By-VTqrdqFI"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00027894.jpg?v=9",
                "CONCLAVE", "Thriller", "English", "https://youtu.be/JX9jasdi3ic"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028716.jpg?v=9",
                "JIGRA", "Drama", "Hindi", "https://youtu.be/3uE0RuQndZc"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028573.jpg?v=9",
                "THE WILD ROBOT", "Animation", "English", "https://youtu.be/bUIvDoOAzI0"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028581.jpg?v=9",
                "DEVARA(PART-1)", "Action", "Tamil", "https://youtu.be/_T7ok9kXGCo"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028495.jpg?v=9",
                "PASSPORT", "Drama", "Sinhala", "https://youtu.be/G4kso3BXlZU"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028742.jpg?v=9",
                "SINGHAM AGAIN", "Action", "Hindi", "https://youtu.be/MD7v0-igVIM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00027296.jpg?v=9",
                "SMILE 2", "Horror", "English", "https://youtu.be/0HY6QFlBzUY"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028575.jpg?v=9",
                "AMARAN", "Action", "Tamil", "https://youtu.be/YkFaDqi2ueM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028265.jpg?v=9",
                "SIHINA NELUM MAL", "Drama", "Sinhala", "https://youtu.be/DO0HN5W0XbU"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028741.jpg?v=9",
                "BLOODY BEGGAR", "Drama", "Tamil", "https://youtu.be/ACdJjVt7iko"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00027968.jpg?v=9",
                "MANDARA", "Drama", "Sinhala", ""));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00025216.jpg?v=9",
                "JOKER FOLIE A DEUX", "Crime", "English", "https://youtu.be/0VWwjdZZEHQ"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028449.jpg?v=9",
                "TRANSFORMERS ONE", "Animation", "English", "https://youtu.be/u2NuUWuwPCM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028410.jpg?v=9",
                "THE APPRENTICE", "Biography", "English", "https://youtu.be/vGKfsALMcqc"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00028740.jpg?v=9",
                "BROTHER", "Comedy", "Tamil", "https://youtu.be/opBgszafxVc"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00025424.jpg?v=9",
                "IT ENDS WITH US", "Drama", "English", "https://youtu.be/Pzn032nNRpM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00024766.jpg?v=9",
                "KADIRA DIVYARAJA", "Drama", "Sinhala", "https://youtu.be/sMXk9D_xLug"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00026763.jpg?v=9",
                "KUNG FU PANDA 4", "Animation", "English", "https://youtu.be/_inKs4eeHiI"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00017914.jpg?v=9",
                "MISSION:IMPOSSIBLE-DEAD", "Action", "English", "https://youtu.be/avz06PDqDbM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00015572.jpg?v=9",
                "TOP GUN:MAVERICK", "Action", "English", "https://youtu.be/giXco2jaZ_4"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00021500.jpg?v=9",
                "ADARANEEYA PRARTHANA", "Romance", "Sinhala", "https://youtu.be/B1UKc8fJd0s"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00026150.jpg?v=9",
                "MIGRATION", "Animation", "English", "https://youtu.be/cQfo0HJhCnE"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00021360.jpg?v=9",
                "FAST X", "Action", "English", "https://youtu.be/n2JeiN9ooEM"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00022842.jpg?v=9",
                "THE SUPER MARIO BROS.MOVIE", "Animation", "English", "https://youtu.be/RjNcTBXTk4I"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00021362.jpg?v=9",
                "OPPENHEIMER", "Biography", "English", "https://youtu.be/uYPbbksJxIg"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00017705.jpg?v=9",
                "JURASSIC WORLD:DOMINION", "Action", "English", "https://youtu.be/-8y5ckwNs8Y"));
        saveMovieIfNotExists(new Movie(null, "https://originserver-static1-uat.pvrcinemas.com/newweb/movies/thumb/374x226/HO00020648.jpg?v=9",
                "PAW PATROL:THE MIGHTY MOVIE", "Animation", "English", "https://youtu.be/UDgjJ9XzgHk"));
    }

    @Override
    public Optional<Movie> getMovieByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public List<Movie> searchMoviesByTitle(String title) {
            return movieRepository.findByTitleStartingWith(title);
    }
}
