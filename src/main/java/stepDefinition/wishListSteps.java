package stepDefinition;

import PageObjectModel.AddToCartPage;
import PageObjectModel.wishListPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wishListSteps {
    AddToCartPage acp =     new AddToCartPage();
            wishListPage wlp = new wishListPage();
    @When("^click add to  wish list button$")
    public void click_add_to_wish_list_button() throws Throwable {
        acp.clickToListIcon();
        Thread.sleep(1000);
        wlp.clickRandomWishButton();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^verify to added wishlist message$")
    public void verifyToAddedWishlistMessage() throws InterruptedException {
        wlp.verifyToSuccesfullyAdded();
        Thread.sleep(2000);
        wlp.ClickCloseButton();
    }

    @Given("^click my profile$")
    public void click_my_profile() throws Throwable {
        wlp.clickMyAccountButton();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^click my wishlist$")
    public void click_my_wishlist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        wlp.clickToMyWishList();
    }

    @Then("^verify your product should be displayed$")
    public void verify_your_product_should_be_displayed() throws Throwable {

        wlp.verifyMyWishProducts();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^click to delete button$")
    public void click_to_delete_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            wlp.clickRemoveIcon();
    }

    @When("^accept to alert message$")
    public void accept_to_alert_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            wlp.acceptAlertMessage();
    }

    @Then("^wishlist should be empty$")
    public void wishlist_should_be_empty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            Thread.sleep(1000);
        wlp.verifyDeleteMyList();
    }

}
