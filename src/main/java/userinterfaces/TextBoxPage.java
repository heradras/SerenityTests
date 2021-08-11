package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextBoxPage {

    //FIELDS
    public static Target fullNameField = Target.the("Full Name Field").located(By.xpath("//*[@id=\"userName\"]"));

    //BUTTONS
    public static Target submitButton = Target.the("Submit Button").located(By.xpath("//*[@id=\"submit\"]"));

    //RESPONSES
    public static Target fullNameResponse = Target.the("Full Name Response").located(By.xpath("//*[@id=\"name\"]"));
}
