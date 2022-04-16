package pages;

import core.AppiumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AppiumBase {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.banggood.client:id/et_email")
    private WebElement email;
    @FindBy(id = "com.banggood.client:id/et_pwd")
    private WebElement password;
    @FindBy(id = "com.banggood.client:id/btn_sign")
    private WebElement loginButton;

    public boolean verifyLoginScreen(){
        return wait.until(ExpectedConditions.visibilityOf(email)).isDisplayed()
                && password.isDisplayed()
                && loginButton.isDisplayed();
    }

    @FindBy(id = "com.banggood.client:id/main_tab_account")
    private WebElement account;
    public void clickAccount(){
        wait.until(ExpectedConditions.visibilityOf(account)).click();
    }
    @FindBy(id = "com.banggood.client:id/tv_view_all")
    private WebElement viewAll;
    public void clickViewAll(){
        wait.until(ExpectedConditions.visibilityOf(viewAll)).click();
    }
}
