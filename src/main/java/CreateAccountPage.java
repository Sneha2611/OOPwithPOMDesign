import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.Utils.Xls_Reader;
import com.page.BasePage;
import com.page.HomePage;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By mr_title = By.xpath("//input[@id='id_gender1']");
	private By mrs_title = By.xpath("//input[@id='id_gender2']");
	private By first_name= By.xpath("//input[@id='customer_firstname']");
	private By last_name= By.xpath("//input[@id='customer_lastname']");
	private By password= By.xpath("//input[@id='passwd']");
	private By day = By.xpath("//select[@id='days']");
	private By month = By.xpath("//select[@id='months']");
	private By year = By.xpath("//select[@id='years']");
	
	private By address_first_name= By.xpath("//input[@id='firstname']");
	private By address_last_name= By.xpath("//input[@id='lastname']");
	private By address= By.xpath("//input[@id='address1']");
	private By city= By.xpath("//input[@id='city']");
	private By state= By.xpath("//select[@id='id_state']");
	private By zip= By.xpath("//input[@id='postcode']");
	private By country= By.xpath("//select[@id='id_country']");
	private By mobile= By.xpath("//select[@id='phone_mobile']");
	private By alias_address= By.xpath("//input[@id='alias']");
	
	private By register_btn = By.xpath("//button[@id='submitAccount']");

	public WebElement getMr_title() {
		return getElement(mr_title);
	}

	public WebElement getMrs_title() {
		return getElement(mrs_title);
	}

	public WebElement getFirst_name() {
		return getElement(first_name);
	}

	public WebElement getLast_name() {
		return getElement(last_name);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getDay() {
		return getElement(day);
	}

	public WebElement getMonth() {
		return getElement(month);
	}

	public WebElement getYear() {
		return getElement(year);
	}

	public WebElement getAddress_first_name() {
		return getElement(address_first_name);
	}

	public WebElement getAddress_last_name() {
		return getElement(address_last_name);
	}

	public WebElement getAddress() {
		return getElement(address);
	}

	public WebElement getCity() {
		return getElement(city);
	}

	public WebElement getState() {
		return getElement(state);
	}

	public WebElement getZip() {
		return getElement(zip);
	}

	public WebElement getCountry() {
		return getElement(country);
	}

	public WebElement getMobile() {
		return getElement(mobile);
	}

	public WebElement getAlias_address() {
		return getElement(alias_address);
	}

	public WebElement getRegister_btn() {
		return getElement(register_btn);
	}
	
	
	public void fillDetail()
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sneha\\Downloads\\CreateAccountNew.xls");
		int rowCount = reader.getRowCount("Create_account");
		
		for(int rowNum=2 ; rowNum<=rowCount ; rowNum++)
		{
			String title = reader.getCellData("Create_account", "Title", rowNum);
			if(title.equals("Mr."))
			{
				getMr_title().click();
			}
			else
			{
				getMrs_title().click();
			}
			
			
			String first_name = reader.getCellData("Create_account", "first_name", rowNum);
			getFirst_name().clear();
			getFirst_name().sendKeys(first_name);
			
			String last_name = reader.getCellData("Create_account", "last_name", rowNum);
			getLast_name().clear();
			getLast_name().sendKeys(last_name);
			
			String password = reader.getCellData("Create_account", "password", rowNum);
			getPassword().clear();
			getPassword().sendKeys(password);
			
			
			String date = reader.getCellData("Create_account", "date", rowNum);
			selectDropDown(getDay(), date);
			

			
		}
		
	}
	
	
	
	public HomePage clickRegisterBtn()
	{
		
		
		getRegister_btn().click();
		return getInstance(HomePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
