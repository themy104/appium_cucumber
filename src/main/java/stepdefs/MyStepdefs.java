package stepdefs;

import core.Swipe;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;


public class MyStepdefs {
    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Swipe swipe = new Swipe();
    HotProductDetailPage hotProductDetailPage = new HotProductDetailPage();
    HotCategoryPage hotCategoryPage = new HotCategoryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();

    @Given("Open Banggood Easy Online Shopping App successfully")
    public void open(){

    }
    @When("Click to the Category on footer menu")
    public void clickToCategory(){
        homePage.clickToCategory();
    }
    @When("Scroll to Home and Garden in Left menu")
    public void swipeToHomeAndGarden(){
        swipe.scrollToHomeAndGarden();
    }
    @When("Click to Home and Garden in Left menu")
    public void clickToHomeAndGarden(){
        categoryPage.clickToHomeAndGarden();
    }
    @When("Click to the Home Decor")
    public void clickToHomeDecor(){
        categoryPage.clickToHomeDecor();
    }
    @When("Click to the Filter")
    public void clickToFilter() {
        categoryPage.clickToFilter();
    }
    @When("Input price from 20 to 30")
    public void inputMinMax(){
        categoryPage.inputMin();
        categoryPage.inputMax();
    }
    @When("Click Done")
    public void clickToDone(){
        categoryPage.clickToDone();
    }
    @When("Click first product")
    public void clickToFirstProduct(){
        categoryPage.clickToFirstProduct();
    }
    @Then("Verify product name should be displayed")
    public void verifyNameProduct(){
        Assert.assertTrue(productDetailPage.verifyName());
    }
    @When("Product price in range 20 to 30")
    public void verifyPriceInRange(){
        productDetailPage.verifyPrice();
    }
    @When("Scroll to Hot Categories")
    public void scrollToHotCategories(){
        swipe.scrollToHotPrice();
    }
    @When("Click to the first category")
    public void clickToFirstCategory(){
        homePage.clickToFirstCategory();
    }
    @When("Click to the first product")
    public void clickToFirstProduct1(){
        hotCategoryPage.clickFirstProduct();
    }
    @Then("The product detail page should be displayed: Product name, product price, Buy now button and Add to Cart button")
    public void verifyProductDetail()  {
        Assert.assertTrue(hotProductDetailPage.verifyProductDetail());
    }
    @When("Click Add to Cart")
    public void clickToAddToCart(){
        hotProductDetailPage.clickToAddToCart();
    }
    @When("Click to Add to Cart button")
    public void clickToAddToCart2() {
        hotProductDetailPage.clickToAddToCart2();
    }
    @When("Click to Cart icon")
    public void clickToCartIcon()  {
        hotCategoryPage.clickToCartIcon();
    }
    @Then("Product name, product size, product price and quantity should be displayed")
    public void verifyShoppingCart()  {
        Assert.assertTrue(shoppingCartPage.verifyShoppingCart());
    }

    @When("Click Account on footer menu")
    public void clickAccount(){
        loginPage.clickAccount();
    }
    @When("Click View All Order")
    public void clickAllOrder(){
        loginPage.clickViewAll();
    }

    @Then("Verify the login screen")
    public void verifyLoginScreen(){
        loginPage.verifyLoginScreen();
    }
}