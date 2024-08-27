package eni.tp.app.eni_app.ihm;

public class EniFlashMessage {

    public static final int TYPE_FLASH_SUCCESS = 0;
    public static final int TYPE_FLASH_ERROR = 1;
    public static final int TYPE_FLASH_INFORMATION = 2;

    int type;
    String message;

    public EniFlashMessage() {
        super();
    }

    public EniFlashMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getTypeCssClass(){
        if(type == TYPE_FLASH_SUCCESS){
            return "uk-alert-success";
        }else if(type == TYPE_FLASH_ERROR){
            return "uk-alert-warning";
        }

        return "uk-alert-primary";
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
