package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageFactory.UpdateUserDetails;
import PageFactory.homePageFactory;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginStepDefinition {    
	
static WebDriver driver;
loginPageFactory login;
static homePageFactory home;
UpdateUserDetails update;
@Given("User is on the login page")
public void user_is_on_the_login_page() {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
	driver.get("http://www.isiri.co/hrm/");
   }

//@When("User enters valid {username} and {password}")
//public void user_enters_valid_username_and_password() {
@When("User enters valid {string} and {string}")
public void user_enters_valid_and(String username, String password) {

	login= new loginPageFactory(driver);
	login.enterusername(username);
	login.enterpassword(password);
   }

@And("clicks on Login Button")
public void clicks_on_login_button() {
	login.clickOnLoginBtn();
  }

@Then("User is navigated to Home Page")
public void user_is_navigated_to_home_page() {
	home =new homePageFactory(driver);
	home.isCartDisplayed();
	
//	Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to Home Page");
   }

@And("Click on PIM Button")
public void click_on_pim_button() {
	home.ClickOnPIM();
}

@And("Click on Add new employee button")
public void click_on_add_new_employee_button() {
	home.ClickOnAddUser();
	
}

@And("enters user {string} creds")
public void enters_user_first_name_creds(String firstName) {
	home.enterFirstname(firstName);
}
@Then("enter user {string} creds")
public void enter_user_creds(String usermiddlename) {
	home.enterMiddlename(usermiddlename);
}
@Then("enters {string} creds")
public void enters_creds(String userlastname) {
	home.enterLasname(userlastname);
}

@Then("enters {string}")
public void enters(String EmployeeID) {
	home.enterEmpid(EmployeeID);
}
@Then("successfully {string} file")
public void successfully_file(String uploadsimage) {
	home.uplodePhoto(uploadsimage);
}

@Then("clicks on save button")
public void clicks_on_save_button() {
	home.saveButton();
}


@Then("click on edit button")
public void click_on_edit_button() {
	home.EditButton();
}

@Then("enter employee {string}")
public void enter_employee(String otherid) {
	home.personalId(otherid);
}

@Then("enter Driving {string}")
public void enter_driving(String licensenumber) {
	home.LicExpDate(licensenumber);
}

@Then("License {string}")
public void license(String ExpiryDate) {
	home.LicExpDate(ExpiryDate);
}

@Then("Select the Gender")
public void select_the_Gender() {
	home.GenderOption();
}

@Then("Select Emplo {string}")
public void select_emplo(String MaritalStatus) {
	home.MaritalStu(MaritalStatus);
}
@Then("Select emp {string}")
public void select_emp(String Nationality) {
	home.Nationality(Nationality);
}
@And("enter the {string}")
public static void enter_the(String DateofBirth) {
		home.DofB(DateofBirth);		
}
@Then("click on save button")
public void click_on_save_button() {
	home.EditButton();
}
@Then("click on PIM button option")
public void click_on_pim_button_option() {
	home.ClickOnPIM();
}

@Then("enter {string}")
public void enter(String EmployeeID) {
	home.Search_id(EmployeeID);
}

@And("Click on Search button")
public void Click_on_Search_button() throws InterruptedException {
	home.SearchButton();
	Thread.sleep(5);
}

@Then("select employee")
public void select_employee() {
	home.SelectAll();
	
}

@Then("click on delete button")
public void click_on_delete_button() {
	home.ClickOnDelete();
}

@Then("click on ok")
public void click_on_ok() {
	home.popUpOk();
}


@And("Close the browser")
public void close_the_browser() {
	driver.quit();
   }


}
