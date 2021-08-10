package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MainPage.*;

public class clickInMainPageTab implements Task {

    private String tabName;

    public clickInMainPageTab(String tabName){
        this.tabName = tabName;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Scroll.to(nameToTarget(tabName)),
                Click.on(nameToTarget(tabName))
        );
    }

    public static clickInMainPageTab byName(String tabName) {
        return instrumented(clickInMainPageTab.class, tabName);
    }

    private Target nameToTarget(String tabName){
        switch(tabName){
            case "textBox": return textBoxTab;
            case "checkBox": return checkBoxTab;
            case "radioButton": return radioButtonTab;
            case "webTables": return webTablesTab;
            case "buttons": return buttonsTab;
            case "links": return linksTab;
            case "brokenLinks-Images": return brokenLinksTab;
            case "uploadAndDownload": return uploadAndDownloadTab;
            case "dynamicProperties": return dynamicPropertiesTab;

            case "practiceForm": return practiceFormTab;
            case "browserWindows": return browserWindowTab;
            case "alerts": return alertsTab;
            case "frames": return framesTab;
            case "nestedFrames": return nestedFramesTab;
            case "modalDialogs": return modalDialogsTab;

            case "accordian": return accordianTab;
            case "autoComplete": return autoCompleteTab;
            case "datePicker": return datePickerTab;
            case "slider": return sliderTab;
            case "progressBar": return progressBarTab;
            case "tabs": return tabsTab;
            case "toolTips": return toolTipsTab;
            case "menu": return menuTab;
            case "selectMenu": return selectMenuTab;

            case "sortable": return sortableTab;
            case "selectable": return selectableTab;
            case "resizable": return rezisableTab;
            case "droppable": return droppableTab;
            case "dragabble": return dragabbleTab;

            case "login": return loginTab;
            case "bookStore": return bookStoreTab;
            case "profile": return profileTab;
            case "bookStoreAPI": return bookStoreAPITab;

            default: return null;
        }
    }
}
