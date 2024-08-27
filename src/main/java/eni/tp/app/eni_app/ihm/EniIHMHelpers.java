package eni.tp.app.eni_app.ihm;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class EniIHMHelpers {

    /**
     * @param redirectAttributes Attention : c'est le RedirectAttributes qu'on va injecter dans le controller
     * @param type Le type du message; Exemple : EniFlashMessage.TYPE_FLASH_SUCCESS
     * @param message Le message du flash
     */
    public static void sendCommonFlashMessage(RedirectAttributes redirectAttributes, int type, String message) {
        redirectAttributes.addFlashAttribute("flashMessage", new EniFlashMessage(type, message));
    }

}
