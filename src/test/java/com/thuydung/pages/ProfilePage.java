package com.thuydung.pages;

import com.thuydung.drivers.DriverManager;
import com.thuydung.helpers.ExcelHelper;
import com.thuydung.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ProfilePage extends CommonPage{
    private By menuManageProfile = By.xpath("(//span[normalize-space()='Manage Profile'])[1]/ancestor::li");
    private By titleManageProfile = By.xpath("//h1[normalize-space()='Manage Profile']");
    private By inputName = By.xpath("//input[@placeholder='Your name']");
    private By inputPhone = By.xpath("//input[@placeholder='Your Phone']");
    private By selectAvatar = By.xpath("//div[@class='form-control file-amount']");
    private By inputPassword = By.xpath("//input[@placeholder='New Password']");
    private By inputConfirmPassword = By.xpath("//input[@placeholder='Confirm Password']");
    private By buttonUpdateProfile = By.xpath("//button[normalize-space()='Update Profile']");
    private By messageNotPermitted = By.xpath("//span[@data-notify='message' and normalize-space() = 'Sorry! the action is not permitted in demo']");
    private By titleChangeEmail = By.xpath("//h5[normalize-space()='Change your email']");
    private By inputEmail = By.xpath("//input[@placeholder='Your Email']");
    private By buttonVerifyEmail = By.xpath("//button[@class='btn btn-outline-secondary new-email-verification']");
    private By buttonUpdateEmail = By.xpath("//button[normalize-space()='Update Email']");
    private By messageUpdate = By.xpath("//span[@data-notify='message']");
    private By titleAddress = By.xpath("//h5[normalize-space()='Address']");
    private By divAddress = By.xpath("//h5[normalize-space()='Address']/ancestor::div[@class='card']");
    private By buttonAddNewAddress = By.xpath("//div[@onclick='add_new_address()']/div");
    private By valueNewestAddress = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='Address:']/following-sibling::span");
    private By valueNewestCountry = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='Country:']/following-sibling::span");
    private By valueNewestState = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='State:']/following-sibling::span");
    private By valueNewestCity = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='City:']/following-sibling::span");
    private By valueNewestPostalCode = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='Postal code:']/following-sibling::span");
    private By valueNewestPhone = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//span[text()='Phone:']/following-sibling::span");
    private By titlePopupNewAddress = By.xpath("//div[@id='new-address-modal']//h5[@id='exampleModalLabel']");
    private By titlePopupEditAddress = By.xpath("//div[@id='edit-address-modal']//h5[@id='exampleModalLabel']");
    private By inputYourAddress = By.xpath("(//textarea[@name='address'])[2]");
    private By inputAddYourAddress = By.xpath("(//textarea[@name='address'])[1]");
    private By selectCountry = By.xpath("//div[@id='edit-address-modal']//select[@data-placeholder='Select your country']/parent::div");
    private By selectAddCountry = By.xpath("//div[@id='new-address-modal']//select[@data-placeholder='Select your country']/parent::div");
    private By inputSearchCountry = By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']");
    private By selectState = By.xpath("(//select[@name='state_id']/parent::div)[2]");
    private By selectAddState = By.xpath("(//select[@name='state_id']/parent::div)[1]");
    private By inputSearchState = By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']");
    private By selectCity = By.xpath("(//select[@name='city_id']/parent::div)[2]");
    private By selectAddCity = By.xpath("(//select[@name='city_id']/parent::div)[1]");
    private By inputSearchCity = By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']");
    private By inputPostalCode = By.xpath("(//input[@name='postal_code'])[2]");
    private By inputAddPostalCode = By.xpath("(//input[@name='postal_code'])[1]");
    private By inputPhoneAddress = By.xpath("(//input[@name='phone'])[3]");
    private By inputAddPhoneAddress = By.xpath("(//input[@name='phone'])[2]");
    private By buttonSaveNewAddress = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By buttonSaveEditAddress = By.xpath("(//button[normalize-space()='Save'])[2]");
    private By inputPhoto = By.xpath("//label[normalize-space()='Photo']/following-sibling::div/descendant::div[normalize-space()='Browse']");
    private By tabUploadNew = By.xpath("//a[normalize-space()='Upload New']");
    private By tabSelectFile = By.xpath("//a[normalize-space()='Select File']");
    private By inputUploadPhoto = By.xpath("//input[@class='uppy-Dashboard-input']");
    private By buttonAddFile = By.xpath("//button[normalize-space()='Add Files']");
    private By inputSearchPhoto = By.xpath("//input[@placeholder='Search your files']");
    private By imageUploaded = By.xpath("(//div[@class='modal-body']//div[contains(@title,'AvatarAccount')]/descendant::img[@class='img-fit'])[1]");
    private By iconEllipsisInCardAddressNewest = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//i[@class='la la-ellipsis-v']");
    private By buttonEditInCardAddressNewest = By.xpath("//div[@onclick='add_new_address()']/preceding-sibling::div[1]//i[@class='la la-ellipsis-v']/parent::button/following-sibling::div[contains(@class, 'dropdown-menu')]/a[normalize-space()='Edit']");
    public void updateInfoBasicProfileCustomer(String name, String phone, String imgName, String password, String confirmPassword) {
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.verifyElementVisible(titleManageProfile, "Trang Manage Profile KHÔNG được hiển thị.");
        WebUI.setTextAndClear(inputName, name);
        WebUI.setTextAndClear(inputPhone, phone);
        WebUI.clickElement(inputPhoto);
        //Upload file new
//        WebUI.clickElement(tabUploadNew);
//        DriverManager.getDriver().findElement(inputUploadPhoto).sendKeys(SystemHelper.getCurrentDir() + "DataTest\\" + imgName + ".png");
        WebUI.clickElement(tabSelectFile);
        WebUI.setTextEnter(inputSearchPhoto, imgName);
        WebUI.waitForJQueryLoad();
        WebUI.clickElement(imageUploaded);
        WebUI.clickElement(buttonAddFile);
        WebUI.setTextAndClear(inputPassword, password);
        WebUI.setTextAndClear(inputConfirmPassword, confirmPassword);
        WebUI.clickElement(buttonUpdateProfile);
    }
    public void updateInfoBasicValidProfileCustomer(String name, String phone, String imgName, String password, String confirmPassword) {
        updateInfoBasicProfileCustomer(name, phone, imgName, password, confirmPassword);
        WebUI.verifyAssertTrueEqual(messageUpdate, "Your Profile has been updated successfully!", "Thông báo cập nhật thành công không đúng");
    }
    public void updateInfoBasicProfileCustomerWithoutName(String name, String phone, String imgName, String password, String confirmPassword) {
        updateInfoBasicProfileCustomer(name, phone, imgName, password, confirmPassword);
        WebUI.verifyAssertFalseEqual(messageUpdate, "Your Profile has been updated successfully!", "Thông báo cập nhật thành công VẪN được hiển thị, tên không bắt buộc.");
    }
    public void updateInfoBasicProfileCustomerWithoutPhone(String name, String phone, String imgName, String password, String confirmPassword) {
        updateInfoBasicProfileCustomer(name, phone, imgName, password, confirmPassword);
        WebUI.verifyAssertFalseEqual(messageUpdate, "Your Profile has been updated successfully!", "Thông báo cập nhật thành công VẪN được hiển thị, số điện thoại không bắt buộc.");
    }
    public void verifyUpdatePasswordFail(String password, String confirmPassword) {
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("DataTest/Login.xlsx", "Login");
        if(password!= confirmPassword) {
            //
            WebUI.clickElement(DashboardPage.buttonLogout);
            WebUI.waitForPageLoaded();
            WebUI.clickElement(HomePage.linkLogin);
            WebUI.waitForPageLoaded();
            WebUI.setTextAndClear(LoginPage.inputEmail, excel.getCellData("email", 4));
            WebUI.setTextAndClear(LoginPage.inputPassword, password);
            WebUI.clickElement(LoginPage.buttonSubmitLogin);
            WebUI.verifyAssertTrueIsDisplayed(LoginPage.messageAccDoesNotExist, "Đăng nhập vào hệ thống thành công với password mới: " + password);
            //
            WebUI.waitForPageLoaded();
            WebUI.setTextAndClear(LoginPage.inputEmail, excel.getCellData("email", 4));
            WebUI.setTextAndClear(LoginPage.inputPassword, password);
            WebUI.clickElement(LoginPage.buttonSubmitLogin);
            WebUI.verifyAssertTrueIsDisplayed(LoginPage.messageAccDoesNotExist, "Đăng nhập vào hệ thống thành công với password mới: " + confirmPassword);
        }
        else {
            WebUI.clickElement(DashboardPage.buttonLogout);
            WebUI.waitForPageLoaded();
            WebUI.clickElement(HomePage.linkLogin);
            WebUI.waitForPageLoaded();
            WebUI.setTextAndClear(LoginPage.inputEmail, excel.getCellData("email", 4));
            WebUI.setTextAndClear(LoginPage.inputPassword, password);
            WebUI.clickElement(LoginPage.buttonSubmitLogin);
            WebUI.verifyAssertTrueIsDisplayed(LoginPage.messageAccDoesNotExist, "Đăng nhập vào hệ thống thành công với password mới: " + password);
        }
        //
        WebUI.waitForPageLoaded();
        WebUI.setTextAndClear(LoginPage.inputEmail, excel.getCellData("email", 4));
        WebUI.setTextAndClear(LoginPage.inputPassword, excel.getCellData("password", 4));
        WebUI.clickElement(LoginPage.buttonSubmitLogin);
        WebUI.verifyAssertTrueIsDisplayed(DashboardPage.titleDashboard, "Đăng nhập vào hệ thống thành công với password cũ: " + excel.getCellData("password", 4));

    }
    public void updateInfoBasicProfileCustomerNoMatchPassword(String name, String phone, String imgName, String password, String confirmPassword) {
        updateInfoBasicProfileCustomer(name, phone, imgName, password, confirmPassword);
        WebUI.verifyAssertTrueIsDisplayed(messageUpdate, "Thông báo không xuất hiện");
        WebUI.verifyAssertFalseEqual(messageUpdate, "Your Profile has been updated successfully!", "Thông báo cập nhật thành công VẪN được hiển thị, mật khẩu không trùng khớp.");
        WebUI.sleep(2);
        //Đăng nhập lại để kiểm tra thông tin đã được cập nhật
        //verifyUpdatePasswordFail(password, confirmPassword);
    }
    public void updateInfoBasicProfileCustomerPasswordLessCharacter(String name, String phone, String imgName, String password, String confirmPassword) {
        updateInfoBasicProfileCustomer(name, phone, imgName, password, confirmPassword);
        WebUI.verifyAssertTrueIsDisplayed(messageUpdate, "Thông báo không xuất hiện");
        WebUI.verifyAssertFalseEqual(messageUpdate, "Your Profile has been updated successfully!", "Thông báo cập nhật thành công VẪN được hiển thị, mật khẩu ít hơn 6 ký tự.");
        WebUI.sleep(2);
        //Đăng nhập lại để kiểm tra thông tin đã được cập nhật
        //verifyUpdatePasswordFail(password, confirmPassword);
    }
    public void updateEmail(String email) {
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.scrollToElementToBottom(titleChangeEmail);
        WebUI.verifyElementVisible(titleChangeEmail, "Tieu de Change your email KHONG xuat hien.");
        WebUI.setTextAndClear(inputEmail, email);
        WebUI.clickElement(buttonUpdateEmail);
    }

    public void updateValidEmailCustomer(String email) {
        updateEmail(email);
        WebUI.verifyElementVisible(messageUpdate, "Cap nhat email that bai");
        WebUI.verifyAssertTrueEqual(messageUpdate, "A verification mail has been sent to the mail you provided us with.", "Thông báo da gui email không đúng");
    }
    public void updateEmailCustomerWithCurrentEmail(String email) {
        updateEmail(email);
        WebUI.verifyElementVisible(messageUpdate, "Cap nhat email that bai");
        WebUI.verifyAssertTrueEqual(messageUpdate, "Email already exists!", "Thông báo cập nhật email không đúng");
    }
    public void updateProfileWithEmailExist(String email) {
        updateEmail(email);
        WebUI.verifyElementVisible(messageUpdate, "Cap nhat email that bai");
        WebUI.verifyAssertTrueEqual(messageUpdate, "Email already exists!", "Thông báo cập nhật email không đúng");
    }
    public void updateProfileWithNewEmailIncorrectFormat(String email) {
        updateEmail(email);
        WebUI.checkHTML5MessageWithValueInvalid(inputEmail,"Email khong hop le.");
    }

    public void addNewAddress(String address, String country, String state, String city, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
//        WebUI.scrollToElementToBottom(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(buttonAddNewAddress);
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputAddYourAddress, address);
        WebUI.clickElement(selectAddCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.clickElement(selectAddState);
        WebUI.setTextAndClear(inputSearchState, state, Keys.ENTER);
        WebUI.clickElement(selectAddCity);
        WebUI.setTextAndClear(inputSearchCity, city, Keys.ENTER);
        WebUI.setTextAndClear(inputAddPostalCode, postalCode);
        WebUI.setTextAndClear(inputAddPhoneAddress, phone);
        WebUI.clickElement(buttonSaveNewAddress);
        }
    public void addNewAddressValid(String address, String country, String state, String city, String postalCode, String phone) {
        addNewAddress(address, country, state, city, postalCode, phone);
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.verifyAssertTrueEqual(valueNewestAddress, address, "Địa chỉ mới không được thêm vào.");
        WebUI.verifyAssertTrueEqual(valueNewestCountry, country, "Quốc gia mới không được thêm vào.");
        WebUI.verifyAssertTrueEqual(valueNewestState, state, "Tỉnh/Thành phố mới không được thêm vào.");
        WebUI.verifyAssertTrueEqual(valueNewestCity, city, "Thành phố mới không được thêm vào.");
        WebUI.verifyAssertTrueEqual(valueNewestPostalCode, postalCode, "Mã bưu chính mới không được thêm vào.");
        WebUI.verifyAssertTrueEqual(valueNewestPhone, phone, "Số điện thoại mới không được thêm vào.");
    }
    public void addNewAddressWithoutAddress(String address, String country, String state, String city, String postalCode, String phone) {
        addNewAddress(address, country, state, city, postalCode, phone);
        WebUI.checkHTML5MessageWithValueInvalid(inputAddYourAddress,"Address khong hop le.");
        WebUI.verifyAssertTrueEqualMessageHTML(inputAddYourAddress,"Please fill out this field.","Message khong dung.");
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void addNewAddressWithoutCountry(String address, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(buttonAddNewAddress);
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputAddYourAddress, address);
        WebUI.setTextAndClear(inputAddPostalCode, postalCode);
        WebUI.setTextAndClear(inputAddPhoneAddress, phone);
        WebUI.clickElement(buttonSaveNewAddress);
        WebUI.checkHTML5MessageWithValueInvalid(By.xpath("//div[@id='new-address-modal']//select[@name='country_id']"),"Country khong hop le.");
        WebUI.verifyAssertTrueEqualMessageHTML(By.xpath("//div[@id='new-address-modal']//select[@data-placeholder='Select your country']"),"Please select an item in the list.1","Message khong dung.");
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void addNewAddressWithoutState(String address, String country, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(buttonAddNewAddress);
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputAddYourAddress, address);
        WebUI.clickElement(selectAddCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.setTextAndClear(inputAddPostalCode, postalCode);
        WebUI.setTextAndClear(inputAddPhoneAddress, phone);
        WebUI.clickElement(buttonSaveNewAddress);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void addNewAddressWithoutCity(String address, String country, String state, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(buttonAddNewAddress);
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputAddYourAddress, address);
        WebUI.clickElement(selectAddCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.clickElement(selectAddState);
        WebUI.setTextAndClear(inputSearchState, state, Keys.ENTER);
        WebUI.setTextAndClear(inputAddPostalCode, postalCode);
        WebUI.setTextAndClear(inputAddPhoneAddress, phone);
        WebUI.clickElement(buttonSaveNewAddress);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void addNewAddressWithoutPostalCode(String address, String country, String state, String city, String postalCode, String phone) {
        addNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void addNewAddressWithoutPhone(String address, String country, String state, String city, String postalCode, String phone) {
        addNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupNewAddress, "Popup New Address da dong lai, dia chi moi duoc them vao.");
    }
    public void editNewAddress(String address, String country, String state, String city, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(iconEllipsisInCardAddressNewest); //Click vào icon 3 chấm cua card moi nhat
        WebUI.clickElement(buttonEditInCardAddressNewest); //Click vào Edit
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputYourAddress, address);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.clickElement(selectState);
        WebUI.setTextAndClear(inputSearchState, state, Keys.ENTER);
        WebUI.clickElement(selectCity);
        WebUI.setTextAndClear(inputSearchCity, city, Keys.ENTER);
        WebUI.setTextAndClear(inputPostalCode, postalCode);
        WebUI.setTextAndClear(inputPhoneAddress, phone);
        WebUI.clickElement(buttonSaveEditAddress);
    }
    public void editAddressValid(String address, String country, String state, String city, String postalCode, String phone) {
        editNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueEqual(valueNewestAddress, address, "Địa chỉ mới không được sua lai.");
        WebUI.verifyAssertTrueEqual(valueNewestCountry, country, "Quốc gia mới không được sua lai.");
        WebUI.verifyAssertTrueEqual(valueNewestState, state, "Tỉnh/Thành phố mới không được sua lai.");
        WebUI.verifyAssertTrueEqual(valueNewestCity, city, "Thành phố mới không được sua lai.");
        WebUI.verifyAssertTrueEqual(valueNewestPostalCode, postalCode, "Mã bưu chính mới không được sua lai.");
        WebUI.verifyAssertTrueEqual(valueNewestPhone, phone, "Số điện thoại mới không được sua lai.");
        WebUI.verifyAssertTrueIsDisplayed(messageUpdate, "Thông báo cập nhật thanh cong không hiển thị.");
        WebUI.verifyAssertTrueEqual(messageUpdate, "Address info updated successfully", "Thông báo cập nhật không đúng.");
    }
    public void editAddressWithoutAddress(String address, String country, String state, String city, String postalCode, String phone) {
        editNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }
    public void editAddressWithoutCountry(String address, String country, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(iconEllipsisInCardAddressNewest); //Click vào icon 3 chấm cua card moi nhat
        WebUI.clickElement(buttonEditInCardAddressNewest); //Click vào Edit
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputYourAddress, address);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.setTextAndClear(inputPostalCode, postalCode);
        WebUI.setTextAndClear(inputPhoneAddress, phone);
        WebUI.clickElement(buttonSaveEditAddress);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }
    public void editAddressWithoutState(String address, String country, String state, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(iconEllipsisInCardAddressNewest); //Click vào icon 3 chấm cua card moi nhat
        WebUI.clickElement(buttonEditInCardAddressNewest); //Click vào Edit
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputYourAddress, address);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, "Select your country", Keys.ENTER);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.clickElement(selectState);
        WebUI.setTextAndClear(inputSearchState, state, Keys.ENTER);
        WebUI.setTextAndClear(inputPostalCode, postalCode);
        WebUI.setTextAndClear(inputPhoneAddress, phone);
        WebUI.clickElement(buttonSaveEditAddress);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }
    public void editAddressWithoutCity(String address, String country, String state, String city, String postalCode, String phone) {
        WebUI.waitForPageLoaded();
        WebUI.moveToElement(menuManageProfile);
        WebUI.clickElement(menuManageProfile);
        WebUI.waitForPageLoaded();
        WebUI.scrollToElementToBottom(divAddress);
        WebUI.clickElement(iconEllipsisInCardAddressNewest); //Click vào icon 3 chấm cua card moi nhat
        WebUI.clickElement(buttonEditInCardAddressNewest); //Click vào Edit
        WebUI.verifyElementVisible(titlePopupNewAddress, "Popup New Address KHONG hien thi.");
        WebUI.setTextAndClear(inputYourAddress, address);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, "Select your country", Keys.ENTER);
        WebUI.clickElement(selectCountry);
        WebUI.setTextAndClear(inputSearchCountry, country, Keys.ENTER);
        WebUI.clickElement(selectState);
        WebUI.setTextAndClear(inputSearchState, state, Keys.ENTER);
        WebUI.clickElement(selectCity);
        WebUI.setTextAndClear(inputSearchCity, city, Keys.ENTER);
        WebUI.setTextAndClear(inputPostalCode, postalCode);
        WebUI.setTextAndClear(inputPhoneAddress, phone);
        WebUI.clickElement(buttonSaveEditAddress);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }
    public void editAddressWithoutPostalCode(String address, String country, String state, String city, String postalCode, String phone) {
        editNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }
    public void editAddressWithoutPhone(String address, String country, String state, String city, String postalCode, String phone) {
        editNewAddress(address, country, state, city, postalCode, phone);
        WebUI.verifyAssertTrueIsDisplayed(titlePopupEditAddress, "Popup New Address da dong lai, dia chi moi duoc sua lai.");
    }

}