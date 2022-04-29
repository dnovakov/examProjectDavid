package Tests;

import org.junit.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;

    String email = "david.novakovic1111@gmail.com";
    String password = "12345@qa";
    String completedLogin = "My account";
    String verifySuccessfulSignOutMessage = "Authentication";
    String invalidEmailAddress = "david.nvic1111";
    String invalidEmailAddressMessage = "Invalid email address.";
    String wrongPassword = "123232";
    String invalidPasswordMessage = "Authentication failed.";
    String loginWithoutEmailMessage = "An email address required.";
    String loginWithoutPasswordMessage = "Password is required.";

    @Test

    public void loginToWebPage(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(email, password);
        loginPage.validateCompletedLogin(completedLogin);}

    @Test

    public void sighOutFromWebPage(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(email, password);
        loginPage.validateCompletedLogin(completedLogin); 
        loginPage.clickOnSignOutButton();
        loginPage.successfulSignOutMessage(verifySuccessfulSignOutMessage);}

    @Test

    public void loginWithoutEmail(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData("", password);
        loginPage.loginWithoutEmailMessage(loginWithoutEmailMessage);}

    @Test

    public void loginWithoutPassword(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(email, "");
        loginPage.loginWithoutPasswordMessage(loginWithoutPasswordMessage);}



    @Test

    public void signInWithInvalidEmailAddress(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(invalidEmailAddress, "");
        loginPage.invalidEmailMessage(invalidEmailAddressMessage); }

    @Test

    public void signInWithInvalidPassword(){

        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(email, wrongPassword);
        loginPage.invalidEmailMessage(invalidPasswordMessage);}
}
