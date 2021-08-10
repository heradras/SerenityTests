package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage extends PageObject {
    public static final Target pageTitle = Target.the("Page Title").located(By.xpath("//*[contains(@class,'pattern-backgound playgound-header')]/*"));

    public static final Target textBoxTab = Target.the("Form Tab").located(By.xpath("//*/span[contains(text(),'Text Box')]"));
    public static final Target checkBoxTab = Target.the("Checkbox Tab").located(By.xpath("//*/span[contains(text(),'Check Box')]"));
    public static final Target radioButtonTab = Target.the("Radio Button Tab").located(By.xpath("//*/span[contains(text(),'Radio Button')]"));
    public static final Target webTablesTab = Target.the("Web Tables Tab").located(By.xpath("//*/span[contains(text(),'Web Tables')]"));
    public static final Target buttonsTab = Target.the("Buttons Tab").located(By.xpath("//*/span[contains(text(),'Buttons')]"));
    public static final Target linksTab = Target.the("Buttons Tab").located(By.xpath("//*/span[starts-with(text(),'Links')]"));
    public static final Target brokenLinksTab = Target.the("Broken Links - Images Tab").located(By.xpath("//*/span[starts-with(text(),'Broken')]"));
    public static final Target uploadAndDownloadTab = Target.the("Upload and Download Tab").located(By.xpath("//*/span[starts-with(text(),'Upload')]"));
    public static final Target dynamicPropertiesTab = Target.the("Dynamic Properties Tab").located(By.xpath("//*/span[starts-with(text(),'Dynamic')]"));

    public static final Target practiceFormTab = Target.the("Practice Form").located(By.xpath("//*/span[contains(text(),'Practice Form')]"));

    public static final Target browserWindowTab = Target.the("Browser Window Tab").located(By.xpath("//*/span[contains(text(),'Browser Windows')]"));
    public static final Target alertsTab = Target.the("Alerts Tab").located(By.xpath("//*/span[contains(text(),'Alerts')]"));
    public static final Target framesTab = Target.the("Frames Tab").located(By.xpath("//*/span[starts-with(text(),'Frames')]"));
    public static final Target nestedFramesTab = Target.the("Nested Frames Tab").located(By.xpath("//*/span[contains(text(),'Nested Frames')]"));
    public static final Target modalDialogsTab = Target.the("Modal Dialogs Tab").located(By.xpath("//*/span[contains(text(),'Modal Dialogs')]"));

    public static final Target accordianTab = Target.the("Accordian Tab").located(By.xpath("//*/span[contains(text(),'Accordian')]"));
    public static final Target autoCompleteTab = Target.the("AutoComplete Tab").located(By.xpath("//*/span[contains(text(),'Auto Complete')]"));
    public static final Target datePickerTab = Target.the("Date Picker Tab").located(By.xpath("//*/span[contains(text(),'Date Picker')]"));
    public static final Target sliderTab = Target.the("Slider Tab").located(By.xpath("//*/span[contains(text(),'Slider')]"));
    public static final Target progressBarTab = Target.the("Progress Bar Tab").located(By.xpath("//*/span[contains(text(),'Progress Bar')]"));
    public static final Target tabsTab = Target.the("Tabs Tab").located(By.xpath("//*/span[contains(text(),'Tabs')]"));
    public static final Target toolTipsTab = Target.the("Tool Tips Tab").located(By.xpath("//*/span[contains(text(),'Tool Tips')]"));
    public static final Target menuTab = Target.the("Menu Tab").located(By.xpath("//*/span[starts-with(text(),'Menu')]"));
    public static final Target selectMenuTab = Target.the("Select Menu Tab").located(By.xpath("//*/span[contains(text(),'Select Menu')]"));

    public static final Target sortableTab = Target.the("Sortable Tab").located(By.xpath("//*/span[contains(text(),'Sortable')]"));
    public static final Target selectableTab = Target.the("Selectable Tab").located(By.xpath("//*/span[contains(text(),'Selectable')]"));
    public static final Target rezisableTab = Target.the("Rezisable Tab").located(By.xpath("//*/span[contains(text(),'Resizable')]"));
    public static final Target droppableTab = Target.the("Droppable Tab").located(By.xpath("//*/span[contains(text(),'Droppable')]"));
    public static final Target dragabbleTab = Target.the("Dragabble Tab").located(By.xpath("//*/span[contains(text(),'Dragabble')]"));

    public static final Target loginTab = Target.the("Login Tab").located(By.xpath("//*/span[contains(text(),'Login')]"));
    public static final Target bookStoreTab = Target.the("Book Store Tab").located(By.xpath("//*/span[contains(text(),'Book Store')]"));
    public static final Target profileTab = Target.the("Profile Tab").located(By.xpath("//*/span[contains(text(),'Profile')]"));
    public static final Target bookStoreAPITab = Target.the("Book Store API Tab").located(By.xpath("//*/span[contains(text(),'Book Store API')]"));

}


