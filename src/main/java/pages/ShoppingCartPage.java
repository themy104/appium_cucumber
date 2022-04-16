package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends AppiumBase {
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "com.banggood.client:id/tv_product_name")
    private WebElement productName;
    @FindBy(id="com.banggood.client:id/tv_product_price")
    private WebElement productPrice;
    @FindBy(id = "com.banggood.client:id/tv_product_options")
    private WebElement productSize;
    public boolean verifyShoppingCart(){
        return productName.isDisplayed()
                && productPrice.isDisplayed()
                && productSize.isDisplayed();
    }
}
