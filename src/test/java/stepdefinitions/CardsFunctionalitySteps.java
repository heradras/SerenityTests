package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tasks.clickInCard;
import tasks.clickInMainPageTab;
import userinterfaces.HomePage;
import static userinterfaces.MainPage.pageTitle;


public class CardsFunctionalitySteps {

    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("newUser");
    private HomePage homePage=new HomePage();

    @Given("^que un nuevo usuario accede hasta la web demoqa$")
    public void queUnNuevoUsuarioAccedeHastaLaWebDemoqa() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.wasAbleTo(Click.on(By.xpath("//*[@id=\"close-fixedban\"]")));
    }


    @When("^el hace click en la tarjeta (.*)$")
    public void elHaceClickEnUnaTarjeta(String cardName) {
        actor.wasAbleTo(
                clickInCard.byName(cardName)
        );
    }

    @Then("^ve la pagina de elementos desplegables con titulo (.*)$")
    public void veLaPaginaDeElementosDesplegables(String title) {
        actor.attemptsTo(

                Ensure.that(pageTitle).text().isEqualTo(title)
        );


    }

    @When("^el usuario hace click en la pestaña (.*) de los elementos desplegados$")
    public void elUsuarioHaceClickEnLaPestañaDeLosElementosDesplegados(String tabName) {
        actor.wasAbleTo(
                clickInMainPageTab.byName(tabName)

        );
    }


    @Then("^ve la pagina con titulo (.*)$")
    public void veLaPaginaConTituloTextBox(String title) {
        actor.attemptsTo(
                Ensure.that(pageTitle).text().isEqualTo(title)
        );
    }



}
