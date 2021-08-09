package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage extends PageObject {
    public static final Target pageTitle = Target.the("Page Title").located(By.xpath("//*[contains(@class,'pattern-backgound playgound-header')]/*"));
}


