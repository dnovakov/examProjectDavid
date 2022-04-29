package Tests;

import org.junit.Test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignInPage;

public class SignInPageTest extends BaseTest {

    SignInPage signInPage;
    HomePage homePage;
    BasePage basePage;
    LoginPage loginPage;

    String firstName = "David";
    String lastName = "Novakovic";
    String password = "Testing@1234";
    String address = "Address";
    String city = "Belgrade";
    String zipCode = "11000";
    String mobilePhone = "+38166666666";
    String addressAlias = "addressAlias";
    String successfullRegistration = "MY ACCOUNT";
    String email="random123455663@email.com"; //this address needs to be changed every time before execution

    

    @Test
    public void createAccount(){
    homePage = new HomePage(driver);
    signInPage=new SignInPage(driver);
    basePage=new BasePage(driver);
    loginPage=new LoginPage(driver);
    loginPage.basePage();
    loginPage.clickOnSignInButton();
    signInPage.inputEmail(email);
    signInPage.clickOnCreateAccountButton();
    signInPage.fillOutRegistrationForm(firstName, lastName, email, password, address, city, zipCode, mobilePhone, addressAlias);
    signInPage.verifyCompletedRegistration(successfullRegistration);
    }
    
}
