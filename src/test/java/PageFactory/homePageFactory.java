package PageFactory;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class homePageFactory {

	static WebDriver driver;
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement lbl_cart;

	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM_button;

	@FindBy(id="menu_pim_addEmployee")
	WebElement Add_emp;

	@FindBy(id="//div[@class='head']/h1")
	WebElement Add_Emp_title;

	@FindBy(name="firstName")
	WebElement txt_firstname;


	@FindBy(name="middleName")
	WebElement txt_middlename;

	@FindBy(name="lastName")
	WebElement txt_lastname;

	@FindBy(id="employeeId")
	WebElement Emp_ID;

	@FindBy(xpath="//input[@id='photofile']")
	WebElement Add_photo;

	@FindBy(xpath="//input[@id='btnSave']")
	WebElement btn_save;

	@FindBy(id="btnSave")
	WebElement Edit_btn;
	
	@FindBy(id="personal_txtOtherID")
	WebElement other_id;

	@FindBy(id="personal_txtLicenNo")
	WebElement Lic_id;

	@FindBy(id="personal_txtLicExpDate")
	WebElement Lic_Exp_date;

	@FindBy(id="personal_optGender_1")
	WebElement Gender;

	@FindBy(id="personal_cmbMarital")
	WebElement Marital_stu;

	@FindBy(id="personal_cmbNation")
	WebElement National;

	@FindBy(id="personal_DOB")
	WebElement Per_DOB;

	@FindBy(id="btnSave")
	WebElement user_save_btn;
	
	@FindBy(id="empsearch_id")
	WebElement Search_ID;
	
	@FindBy(id="searchBtn")
	WebElement Search_btn;
	
	@FindBy(id="ohrmList_chkSelectAll")
	WebElement Select_all;
	
	@FindBy(id="btnDelete")
	WebElement Delete;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement Delete_ok;


	public void isCartDisplayed()
	{
		lbl_cart.isDisplayed();
	}

	public homePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void ClickOnPIM() {
		PIM_button.click();
	}
	public void ClickOnAddUser() {
		Add_emp.click();
	}
	public void Verify_Add_Emp_Title() {
		Add_Emp_title.getText();
	}

	public  void enterFirstname(String firstName) {
		txt_firstname.sendKeys(firstName);
	}
	public void enterMiddlename(String usermiddlename) {
		txt_middlename.sendKeys(usermiddlename);
	}
	public void enterLasname(String userlastname) {
		txt_lastname.sendKeys(userlastname);	
	}

	public void enterEmpid(String EmployeeID) {
		Emp_ID.clear();
		Emp_ID.sendKeys(EmployeeID);
	}
	public void  uplodePhoto(String uploadsimage) {
		Add_photo.sendKeys(uploadsimage);
	}
	public void saveButton() {
		btn_save.click();
	}
	public void EditButton() {
		Edit_btn.click();
	}
	public void personalId(String otherid) {
		other_id.clear();
		other_id.sendKeys(otherid);
	}

	public void LicExpID(String licensenumber ) {
		Lic_id.clear();
		Lic_id.sendKeys(licensenumber);
	}
	public void LicExpDate(String ExpiryDate) {
		Lic_Exp_date.clear();
		Lic_Exp_date.sendKeys(ExpiryDate);
		Lic_Exp_date.click();
	}
	public void GenderOption() {
		Gender.click();
	}

	public void  MaritalStu(String MaritalStatus) {
		WebElement w=Marital_stu;
		Select select=new Select(w);
		select.selectByVisibleText(MaritalStatus);
	}

	public void  Nationality(String Nationality) {
		WebElement w1=National;
		Select sel=new Select(w1);
		sel.selectByVisibleText(Nationality);
	}

	public void DofB(String DateofBirth) {
		Per_DOB.click();
		Per_DOB.sendKeys(DateofBirth);
		Per_DOB.click();
	}

	public void entersavebtn() {
		user_save_btn.click();
	}
	public void Search_id(String EmployeeID) {
		Search_ID.sendKeys(EmployeeID);
	}
	
	public void SearchButton() {
		Search_btn.click();
	}
	public void SelectAll() {
		Select_all.click();
	}
	public void ClickOnDelete() {
		Delete.click();
	}
	public void popUpOk() {
		
		Set<String> parentHandle = driver.getWindowHandles();
		// driver.findElement(By.id("btnDelete")).click();
		 Set<String> handles = driver.getWindowHandles();
		 //String[] handles = null;
		for(String handle: handles) {
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
			
				Delete_ok.click();
			
			}
		}

	}
}
