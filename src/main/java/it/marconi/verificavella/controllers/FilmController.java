package it.marconi.verificavella.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import it.marconi.verificavella.domains.FilmForm;
import it.marconi.verificavella.services.FilmService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class FilmController {
    
    @Autowired
    private FilmService filmService;

    @GetMapping("/films")
    public String greet() {
        return"homepage";
    }
    
    @GetMapping("/films/new")
    public ModelAndView newFilmForm(){
        return new ModelAndView("film-form").addObject(new FilmForm());
    } 
    
    @PostMapping("/films/new")
    public ModelAndView deleteContact(
        @PathVariable("codice") String codice,
        RedirectAttributes attr) {
        
            return new ModelAndView("redirect:/films/new/{codice}");
    }
    
    
}