package pages;

import core.AppiumBase;
import org.opencv.core.Mat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailPage extends AppiumBase {
    public ProductDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.banggood.client:id/tv_product_name")
    private WebElement nameProduct;

    public boolean verifyName() {
        return wait.until(ExpectedConditions.visibilityOf(nameProduct)).isDisplayed();
    }

    @FindBy(id = "com.banggood.client:id/tv_product_price")
    private WebElement priceProduct;

    public void verifyPrice() {
        String price_product = priceProduct.getText();
        price_product = price_product.substring(0, price_product.length()-1 );
        double price = Double.parseDouble(price_product);
        if (20 < price && price < 30) {
            System.out.println("True");
        } else {
            System.out.println("Fail");
        }
    }
}




