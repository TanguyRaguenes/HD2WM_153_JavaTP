package eni.tp.app.eni_app.controller;

import eni.tp.app.eni_app.bo.User;
import eni.tp.app.eni_app.ihm.EniFlashMessage;
import eni.tp.app.eni_app.ihm.EniIHMHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//Récupérer user dans la session
@SessionAttributes({"loggedUser"})
@Controller
public class AuthController {

    @GetMapping("show-login")
    public String showLogin(Model model, RedirectAttributes redirectAttributes) {

        //Tester si déjà connecté
        User loggedUser = (User)model.getAttribute("loggedUser");
        if (loggedUser != null) {

//            return "auth/already-logged-page";
            EniIHMHelpers.sendCommonFlashMessage(redirectAttributes,EniFlashMessage.TYPE_FLASH_ERROR,"Vous êtes déjà connecté(e)...");
            return "redirect:/home";
        }

        User user = new User("","");
        model.addAttribute("user", user);
        return "auth/login-page";
    }

    @PostMapping("login-form")
    public String loginForm(@ModelAttribute User user, Model model, RedirectAttributes redirectAttributes) {

        System.out.println(String.format("Utilisateur saisi : nom = %s, password = %s", user.email, user.password));

        //Mettre le user dans la session
        model.addAttribute("loggedUser", user);
        //Ajouter un message temporaire (flash message)
//        redirectAttributes.addFlashAttribute("flashMessage", new EniFlashMessage(EniFlashMessage.TYPE_FLASH_SUCCESS, "Vous êtes bien connecté(e) !"));
        EniIHMHelpers.sendCommonFlashMessage(redirectAttributes,EniFlashMessage.TYPE_FLASH_SUCCESS,"Vous êtes bien connecté(e) !");
        return "redirect:/home";
    }

    @GetMapping("show-logout")
    public String showLogout(SessionStatus status, Model model,RedirectAttributes redirectAttributes) {

        status.setComplete();
        EniIHMHelpers.sendCommonFlashMessage(redirectAttributes,EniFlashMessage.TYPE_FLASH_SUCCESS,"Vous êtes bien déconnecté(e) !");
        return "redirect:/show-login";
    }



}
