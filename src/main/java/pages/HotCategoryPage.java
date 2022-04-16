package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotCategoryPage extends AppiumBase {
    public HotCategoryPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.banggood.client:id/tv_product_name\"])[1]")
    private WebElement firstProduct;
    public void clickFirstProduct(){
        wait.until(ExpectedConditions.visibilityOf(firstProduct)).click();
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.banggood.client:id/cv_slide_cart\"]")
    private WebElement cartIcon;
    public void clickToCartIcon(){
        cartIcon.click();
    }
}
