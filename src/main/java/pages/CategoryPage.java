package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends AppiumBase {
    public CategoryPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Home and Garden\"]")
    private WebElement homeAndGarden;
    public void clickToHomeAndGarden(){
       wait.until(ExpectedConditions.visibilityOf(homeAndGarden)).click();
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Home Decor\"]")
    private WebElement homeDecor;
    public void clickToHomeDecor(){
        wait.until(ExpectedConditions.visibilityOf(homeDecor)).click();
    }
    @FindBy(xpath = "(//android.widget.ImageView)[4]")
    private WebElement filter;
    public void clickToFilter(){
      filter.click();
    }
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.banggood.client:id/edit_price_min\"]")
    private WebElement min;
    public void inputMin(){
        wait.until(ExpectedConditions.visibilityOf(min)).sendKeys("20");
    }
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.banggood.client:id/edit_price_max\"]")
    private WebElement max;
    public void inputMax(){
        wait.until(ExpectedConditions.visibilityOf(max)).sendKeys("30");
    }
    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.banggood.client:id/btn_done\"]")
    private WebElement done;
    public void clickToDone(){
        wait.until(ExpectedConditions.visibilityOf(done)).click();
    }

    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.banggood.client:id/tv_product_name\"])[1]")
    private WebElement firstProduct;
    public void clickToFirstProduct(){
        wait.until(ExpectedConditions.visibilityOf(firstProduct)).click();
    }

}
