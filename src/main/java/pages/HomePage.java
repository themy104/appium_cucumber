package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AppiumBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Category\"]")
    private WebElement category;

    public void clickToCategory(){
        wait.until(ExpectedConditions.visibilityOf(category)).click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Toothbrush\"]")
    private  WebElement firstCategory;
    public void clickToFirstCategory(){
        wait.until(ExpectedConditions.visibilityOf(firstCategory)).click();
    }
}
