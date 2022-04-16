package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotProductDetailPage extends AppiumBase {
    public HotProductDetailPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "com.banggood.client:id/tv_product_price")
    private WebElement price;
    @FindBy(id = "com.banggood.client:id/tv_product_name")
    private WebElement name;
    @FindBy(id = "com.banggood.client:id/btn_slide_buy")
    private WebElement buyNow;
    @FindBy(id = "com.banggood.client:id/btn_slide_cart")
    private WebElement addToCart;
    @FindBy(id = "com.banggood.client:id/btn_cart")
    private  WebElement addToCart2;


    public boolean verifyProductDetail(){
        return wait.until(ExpectedConditions.visibilityOf(price)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(name)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(buyNow)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(addToCart)).isDisplayed();
}
   public void clickToAddToCart(){
        addToCart.click();
    }
    public void clickToAddToCart2(){
        addToCart2.click();
    }
}
