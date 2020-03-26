package stepDefinition;
import PageObjectModel.*;
import Utilities.Driver;
import Utilities.readProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
public class cartSteps extends AbstractClass {

    WebDriver driver;
    accountPage ap = new accountPage();
    signInPage sp = new signInPage();
    AddToCartPage acp = new AddToCartPage();





    @Given("^click to sign in button$")
    public void click_to_sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(1000);
        sp.clickSignInButton();
    }

    @And("^navigate over the titles$")
    public void navigateOverTheTitles() throws InterruptedException {

        acp.navigateOver();
    }

    @And("^click to women button$")
    public void clickToWomenButton() {
        acp.clickWomenButton();
    }


    @And("^choose a random product$")
    public void chooseARandomProduct() throws InterruptedException {



        acp.clickToListIcon();

        acp.clickRandomCartButton();



    }


    @When("^click to Proceed to checkout$")
    public void clickToProceedToCheckout() throws InterruptedException {
        acp.clickToCheckoutButton();




    }

    @Then("^cart shouldn't be empty$")
    public void cartShouldnTBeEmpty() {
        acp.verifyToCart();


    }
    @When("^click to remove button$")
    public void clickToRemoveButton() {
            scrollDown();
        acp.clickRemoveTitle();
    }



    @Then("^cart should be empty$")
    public void cartShouldBeEmpty() throws InterruptedException {

        acp.verifytoDelete();
    }


}
