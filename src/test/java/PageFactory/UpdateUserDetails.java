package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UpdateUserDetails {
	 WebDriver driver;
	
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

@FindBy(name="personal[cmbNation]")
WebElement National;

@FindBy(id="personal_DOB")
WebElement Per_DOB;

@FindBy(id="btnSave")
WebElement user_save_btn;

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
	WebElement w1=Gender;
	Select select=new Select(w1);
	select.selectByVisibleText(Nationality);
}

public void DofB(String DateofBirth) {
	Per_DOB.click();
	Per_DOB.sendKeys(DateofBirth);
	Per_DOB.click();
}

public void entersavebtn() {
	user_save_btn.click();
}


}

