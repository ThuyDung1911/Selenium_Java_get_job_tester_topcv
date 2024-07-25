package com.thuydung.pages;

import com.thuydung.helpers.ExcelHelper;
import com.thuydung.helpers.PropertiesHelper;
import com.thuydung.helpers.SystemHelper;
import com.thuydung.keywords.WebUI;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JobPage extends CommonPage{
    public static By inputSearchJob = By.xpath("//input[@id='keyword']");
    public static By btnSearchJob = By.xpath("//button[contains(@class,'btn-search-job')]");
    public static By titleJob = By.xpath("//div[contains(@class,'job-list')]//span[@title]");
    public static By nameCompany = By.xpath("//div[contains(@class,'job-list')]//a[@class='company']");
    public static By salaryJob = By.xpath("//div[contains(@class,'job-list')]//label[@class='title-salary']");
    public static By addressCompany = By.xpath("//div[contains(@class,'job-list')]//label[@class='address']");
    public static By timeExpApplyJob = By.xpath("//div[contains(@class,'job-list')]//label[@class='time']");

    public void searchJob(String keySearchJob) {
        WebUI.openURL(PropertiesHelper.getValue("URL"));
        WebUI.setTextFromSplitString(inputSearchJob, keySearchJob);
        WebUI.clickElement(btnSearchJob);
        WebUI.waitForElementVisible(titleJob);
    }
    public void getListJob(String keySearchJob) {
//        searchJob(keySearchJob);
        WebUI.openURL("https://www.topcv.vn/viec-lam-it?sort=&skill_id=&skill_id_other=&keyword=Tester&company_field=&position=&salary=");
        setDataJob();

    }
    public void setDataJob() {
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("data/DataJob.xlsx", "DataJob");
        List<WebElement> listTitleJob = WebUI.getWebElements(titleJob);
        List<WebElement> listNameCompany = WebUI.getWebElements(nameCompany);
        List<WebElement> listSalaryJob = WebUI.getWebElements(salaryJob);
        List<WebElement> listAddressCompany = WebUI.getWebElements(addressCompany);
        List<WebElement> listTimeExpApplyJob = WebUI.getWebElements(timeExpApplyJob);
        if (listTitleJob.size() <= 20) {
            System.out.println("Có ít hơn 20 job");
        } else {
            List<String> listTitleJobValues = new ArrayList<>();
            List<String> listNameCompanyValues = new ArrayList<>();
            List<String> listSalaryJobValues = new ArrayList<>();
            List<String> listAddressCompanyValues = new ArrayList<>();
            List<String> listTimeExpApplyJobValues = new ArrayList<>();

            for (WebElement element : listTitleJob) {
                listTitleJobValues.add(element.getText());
            }
            for (WebElement element : listNameCompany) {
                listNameCompanyValues.add(element.getText());
            }
            for (WebElement element : listSalaryJob) {
                listSalaryJobValues.add(element.getText());
            }
            for (WebElement element : listAddressCompany) {
                listAddressCompanyValues.add(element.getText());
            }
            for (WebElement element : listTimeExpApplyJob) {
                listTimeExpApplyJobValues.add(element.getText());
            }

            for (int i = 0; i < listTitleJobValues.size(); i++) {
                excel.setCellData(listTitleJobValues.get(i), i + 1, "TitleJob");
            }
            for (int i = 0; i < listNameCompanyValues.size(); i++) {
                excel.setCellData(listNameCompanyValues.get(i), i + 1, "NameCompany");
            }
            for (int i = 0; i < listSalaryJobValues.size(); i++) {
                excel.setCellData(listSalaryJobValues.get(i), i + 1, "SalaryJob");
            }
            for (int i = 0; i < listAddressCompanyValues.size(); i++) {
                excel.setCellData(listAddressCompanyValues.get(i), i + 1, "AddressCompany");
            }
            for (int i = 0; i < listTimeExpApplyJobValues.size(); i++) {
                excel.setCellData(listTimeExpApplyJobValues.get(i), i + 1, "TimeExpApplyJob");
            }

        }
    }


}
