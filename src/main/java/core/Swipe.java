package core;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Swipe extends AppiumBase {

    public void scrollToHomeAndGarden(){
        AndroidElement elementContainer = (AndroidElement) driver.findElement(By.id("com.banggood.client:id/primary_cate_list"));
        swipeUpInContainer(By.xpath("//android.widget.TextView[@text=\"Home and Garden\"]"), elementContainer, 10);}

    public void scrollToHotPrice(){
        AndroidElement elementContainer = (AndroidElement) driver.findElement(By.id("com.banggood.client:id/nav_host_main"));
        swipeUpInContainer(By.xpath("//android.widget.TextView[@text=\"Hot Categories\"]"), elementContainer, 10);}



    public void swipeUpInContainer(By locator, AndroidElement androidElementContainer, int count){
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible){
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;



        startx = endx = androidElementContainer.getLocation().getX() + Math.round(androidElementContainer.getSize().getWidth() / 2);



        starty = (int) (androidElementContainer.getLocation().getY() + Math.round(0.8 * androidElementContainer.getSize().getHeight()));
        endy = (int) (androidElementContainer.getLocation().getY() + Math.round(0.2 * androidElementContainer.getSize().getHeight()));
        System.out.println(startx+"_"+ starty+"_"+endx+"_"+ endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible){
                break;
            }
        }
    }

    public boolean checkElementDisplayed(By locator) {
        boolean isDisplay = false;
        AndroidElement androidElement = null;
        try {
            androidElement = (AndroidElement) driver.findElement(locator);
        }catch (Exception e){}
        if (null != androidElement) {
            try {
                if (null != androidElement.getLocation()) {
                    int x = androidElement.getLocation().getX();
                    int y = androidElement.getLocation().getY();
                    Dimension windowSize = driver.manage().window().getSize();
                    String deviceScreenSize = "";

                    int yMaxScreen = (int) Math.round(windowSize.getHeight());
                    int xMaxScreen = (int) Math.round(windowSize.getWidth());
                    if (driver instanceof AndroidDriver) {
                        deviceScreenSize = StringUtils.substringBetween(driver.toString(), "deviceScreenSize=",
                                ",");
                    }
                    if (null != deviceScreenSize && !deviceScreenSize.equals("")) {
                        yMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[1]);
                        xMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[0]);
                    }
                    if (x >= 0 && x < xMaxScreen && y >= 0 && y < yMaxScreen) {
                        isDisplay = true;
                    }
                }
            } catch (Exception e) {}
        }
        return isDisplay;
    }

    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(driver).longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
    }

    public void tapByElement (AndroidElement androidElement) {
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(androidElement))).perform();
    }
}