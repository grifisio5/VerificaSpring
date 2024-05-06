package it.marconi.verificavella.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.marconi.verificavella.domains.Film;
import it.marconi.verificavella.domains.FilmForm;
// import it.marconi.verificavella.repositories.FilmRepository;

@Service
public class FilmService {
    
    // @Autowired
    // private FilmRepository filmRepo;

    
    ArrayList<Film> list;

    public ArrayList<Film> save(FilmForm filmForm){

        

        

   
        list= new ArrayList<Film>();
        list.add(new Film("a","a", "pluto", 2005, 3));
    



        return list;
    }

    // private Film mapFilm(FilmForm filmForm){
    //     Film f= new Film();
    //     f.setAnno(filmForm.getAnno());
    //     f.setGenere(filmForm.getGenere());
    //     f.setTitolo(filmForm.getTitolo());
    //     f.setVoto(filmForm.getVoto());
    //     return f;
    // }
}
