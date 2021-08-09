package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends PageObject {
    public static final Target elementsCard = Target.the("Elements Card").located(By.xpath("//*[@class=\"card mt-4 top-card\"][1]/div/div[2]/*"));
    public static final Target formsCard = Target.the("Form card").located(By.xpath("//*[@class=\"card mt-4 top-card\"][2]/div/div[2]/*"));
    public static final Target afwCard = Target.the("Alert,frames,windows card").located(By.xpath("//*[@class=\"card mt-4 top-card\"][3]/div/div[2]/*"));
    public static final Target widgetsCard = Target.the("Widgets card").located(By.xpath("//*[@class=\"card mt-4 top-card\"][4]/div/div[2]/*"));
    public static final Target interactionsCard = Target.the("Interactions card").located(By.xpath("//*[@class=\"card mt-4 top-card\"][5]/div/div[2]/*"));
    public static final Target bsaCard = Target.the("Book store application").located(By.xpath("//*[@class=\"card mt-4 top-card\"][6]/div/div[2]/*"));
}
