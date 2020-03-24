package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class wishListPage extends  AbstractClass {
    WebDriver driver;

    public wishListPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    // TODO  <3 Wish button <3 <3 <3 <3
    @FindAll({
            @FindBy(xpath = "//a[contains(text(),'Add to Wishlist')]")
    })
    private List<WebElement> wishButton;


    //TODO  Added Message
    @FindBy(xpath = "//p[text()='Added to your wishlist.']")
    private WebElement wishlistMessage;


    //TODO Close the Added Message
    @FindBy(xpath = "//a[@title='Close']")
    private WebElement closeTheMessage;


    //TODO Go to My Account
    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement MyAccount;


    //TODO Click To My Wishlists

    @FindBy(xpath = "//span[text()='My wishlists']")
    private WebElement myWishLists;


    @FindBy(xpath = "//a[contains(text(),'My wishlist')]")
    private WebElement myWishProduct;


    @FindBy(xpath = "//a[@class='icon']")
    private WebElement removeIcon;


    @FindBy(xpath = "//div[@class='columns-container']")
    private WebElement allPage;


    @FindBy(xpath = "//table[@class='table table-bordered']")
    private WebElement table;


    public void clickRandomWishButton() {
        randomMethod(wishButton);

    }


    public void verifyToSuccesfullyAdded() {


        String message = "Added to your wishlist.";
        String actual = wishlistMessage.getText().trim();
        if (message.equals(actual)) {
            System.out.println("it is verified");
        } else {
            Assert.fail("eklemedi");
        }
    }

    public void ClickCloseButton() {
        clickOnFunctionalities(closeTheMessage);

    }

    public void clickMyAccountButton() {

        clickOnFunctionalities(MyAccount);
    }

    public void clickToMyWishList() {
        clickOnFunctionalities(myWishLists);
    }


    public void verifyMyWishProducts() {

        String message = "My wishlist";
        String actual = myWishProduct.getText().trim();
        if (message.equals(actual)) {
            System.out.println("It has been displayed");
        } else {
            Assert.fail("Nothing was added..");
        }

    }


    public void clickRemoveIcon() {

        clickOnFunctionalities(removeIcon);
    }

    public void acceptAlertMessage() {

        driver.switchTo().alert().accept();
    }


    public void verifyDeleteMyList() {


    }
}








