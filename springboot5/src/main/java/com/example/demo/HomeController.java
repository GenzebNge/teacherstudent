package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/")
    public String index(Model model){
        //first lets us create an actor
        Actor actor = new Actor();
        actor.setName("Sandra Bullock");
        actor.setRealName("Sandra Mae bullowski");

        //Now let's create a movie
        Movie movie = new Movie();
        movie.setTitle("Emonji movie");
        movie.setYear(2017);
        movie.setDescription("This is about Emonji movies");

        //Add the movies to an empity list

        Set<Movie>movies = new HashSet<Movie>();
        movies.add(movie);
        //add the list of movies to the actor movie list
        actor.setMovies(movies);

        // grade all the actor from the database and send them to the template
        model.addAttribute("actors", actorRepository.findAll());

        return"index";
    }
}
