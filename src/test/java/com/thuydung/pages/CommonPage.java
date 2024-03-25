package com.thuydung.pages;

public class CommonPage {
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public OrderPage orderPage;
    public AddProductPage addProductPage;
    public ProductInfoPage productInfoPage;
    public RegisterPage registerPage;
    public HomePage homePage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ProfilePage getProfilePage() {
        if (profilePage == null) {
            profilePage = new ProfilePage();
        }
        return profilePage;
    }

    public OrderPage getOrderPage() {
        if (orderPage == null) {
            orderPage = new OrderPage();
        }
        return orderPage;
    }

    public AddProductPage getAddProductPage() {
        if (addProductPage == null) {
            addProductPage = new AddProductPage();
        }
        return addProductPage;
    }

    public ProductInfoPage getProductInfoPage() {
        if (productInfoPage == null) {
            productInfoPage = new ProductInfoPage();
        }
        return productInfoPage;
    }
    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
}