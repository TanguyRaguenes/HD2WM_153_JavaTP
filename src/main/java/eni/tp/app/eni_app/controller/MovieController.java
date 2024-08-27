package eni.tp.app.eni_app.controller;

import eni.tp.app.eni_app.bo.Movie;
import eni.tp.app.eni_app.ihm.EniFlashMessage;
import eni.tp.app.eni_app.ihm.EniIHMHelpers;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SessionAttributes("movie")
@Controller
public class MovieController {

    @GetMapping("movieForm")
    public String getAddMovie(Model model) {
        Movie movie = new Movie(1,"Titre par défaut",1950,60,"Synopsis par défaut","http://PathParDefaut");
        model.addAttribute("movie",movie);
        return "/movies/movie-form-page";
    }

    @PostMapping("movieForm")
    public String postAddMovie(@Valid @ModelAttribute Movie movie, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model ) {

        if (bindingResult.hasErrors()) {
            System.out.println("Erreur de contôle de surface !");
            return "/movies/movie-form-page";
        }

        model.addAttribute("movie", movie);
        EniIHMHelpers.sendCommonFlashMessage(redirectAttributes,EniFlashMessage.TYPE_FLASH_SUCCESS,"Film bien ajouté !");
        System.out.println(movie.toString());
        return "redirect:/home";
    }

}
