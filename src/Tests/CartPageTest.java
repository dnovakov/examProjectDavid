package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignInPage;

public class CartPageTest extends BaseTest {
    
    public HomePage homePage;
    public LoginPage loginPage;
    public CartPage cartPage;
    public SignInPage signInPage;
    String email = "david.novakovic1111@gmail.com";
    String password = "12345@qa";
    String price="$19.25";
    String confirmationMessage="Your order on My Store is complete.";

    @Test
    public void addProductToCart(){
      
        loginPage=new LoginPage(driver);
        cartPage=new CartPage(driver);
        signInPage=new SignInPage(driver);
        homePage=new HomePage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(email, password);
        homePage.clickOnTShirts();
        homePage.clickOnProduct();
        homePage.clickOnAddToCart();
        cartPage.clickOnProceedToCheckout();
        cartPage.verifyTotalPrice(price);
        cartPage.clickOnProceedToCheckoutSummaryPage();
        cartPage.clickOnProceedToCheckoutAddress();
        cartPage.acceptTerms();
        cartPage.clickOnProceedToCheckoutShipping();
        cartPage.choosePayByCheckOption();
        cartPage.confirmOrder();
        cartPage.verifySuccessfulOrder(confirmationMessage);

        
    }


    
}
