package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);}

    String baseURL = "http://automationpractice.com/index.php";
///LogIn
    By signInButton = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    By emailAddressToLogin = By.xpath("//*[@id='email']");
    By passwordToLogin = By.xpath("//*[@id='passwd']");
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By submitLoginButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span");
    By loginSuccesfull = By.xpath("/html/body/div/div[2]/div/div[1]/span[2]");
///singOut
    By signOutButton = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");
    By successfullSignOut = By.xpath("/html/body/div/div[2]/div/div[1]/span[2]");
///wrog logIn:
    By loginWithoutEmail = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    By loginWithoutPassword = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    By invalidEmailAddress = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    By invalidPassword = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");


    public LoginPage basePage(){    
        driver.get(baseURL);
        return this;}

    public LoginPage clickOnSignInButton(){
        click(signInButton);
        return this;}

    public LoginPage inputLoginData(String username, String password){
        writeText(emailBy, username);
        writeText(passwordBy, password);
        click(submitLoginButton);
        return this;}

    public LoginPage validateCompletedLogin(String expectedText){
        waitVisibility(loginSuccesfull);
        String actualTitle = readText(loginSuccesfull);
        assertTextEquals(expectedText, actualTitle);
        return this;}
////sign out
    public LoginPage clickOnSignOutButton(){
        click(signOutButton);
        return this;
    }

    public LoginPage successfulSignOutMessage(String expectedText){
        waitVisibility(successfullSignOut);
        String actualTitle = readText(successfullSignOut);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
//// izlogovan
    public LoginPage loginWithoutEmailMessage(String expectedText){
        waitVisibility(loginWithoutEmail);
        String actualTitle = readText(loginWithoutEmail);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage loginWithoutPasswordMessage(String expectedText){
        waitVisibility(loginWithoutPassword);
        String actualTitle = readText(loginWithoutPassword);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage invalidEmailMessage(String expectedText){
        waitVisibility(invalidEmailAddress);
        String actualTitle = readText(invalidEmailAddress);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    
    public LoginPage invalidPasswordMessage(String expectedText){
        waitVisibility(invalidPassword);
        String actualTitle = readText(invalidPassword);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
}
