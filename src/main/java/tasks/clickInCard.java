package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class clickInCard implements Task {

    private String cardName;

    public clickInCard(String cardName){
        this.cardName = cardName;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Scroll.to(nameToTarget(cardName)),
                Click.on(nameToTarget(cardName))
        );
    }

    public static clickInCard byName(String cardName) {
        return instrumented(clickInCard.class, cardName);
    }

    private Target nameToTarget(String cardName){
        switch(cardName){
            case "elementsCard": return elementsCard;
            case "formsCard": return formsCard;
            case "afwCard": return afwCard;
            case "widgetsCard": return widgetsCard;
            case "interactionsCard": return interactionsCard;
            case "bsaCard": return bsaCard;
            default: return null;
        }
    }


}
