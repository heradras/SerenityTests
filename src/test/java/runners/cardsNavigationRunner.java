package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features= "src/test/resources/features/MainPageFunctionality.feature",
        features= {"src/test/resources/features/MainPageFunctionality.feature",
                    "src/test/resources/features/TestCardsFunctionality.feature"},
        glue = "stepdefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE
)

public class cardsNavigationRunner {



}
