package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BaseTest {

    public HomePage homePage;
    public LoginPage loginPage;

    int numberOfProductsPopularPage = 7;
    int numberOfProductsBestSellersPage = 7;
    String emailAdress = "david.novakovic1111@gmail.com";
    String password = "12345@qa";
   
    @Test

    public void validateNumberOfProductsOnPopularPage(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    
        loginPage.basePage();
        homePage.numberPopular(numberOfProductsPopularPage);
    }
   /// "popular" button should be selected by default, but for Best Sellers we must click on the button
    @Test

    public void validateNumberOfProductsOnBestSellerPage(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    
        loginPage.basePage();
        homePage.selectBestSellersButton();
        homePage.numberBestSellers(numberOfProductsBestSellersPage);
    }
   
}
