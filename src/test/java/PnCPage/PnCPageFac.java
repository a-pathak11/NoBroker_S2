	package PnCPage;
	
	import java.util.Set;
	
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WindowType;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.locators.RelativeLocator;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import DriverSetup.SetupDriver;
	
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.InputEvent;
	import java.awt.event.KeyEvent;
	import java.time.Duration;
	
	public class PnCPageFac {
		WebDriver driver;
		WebDriverWait wait;
		Robot robot;
		Select select;
		Actions actions;
		JavascriptExecutor js;
		
		
	/*============================================ 1 (SEARCH BAR)============================================ */
		
		
	@FindBy(id="main-menu") 
	WebElement menu;	
	
	@FindBy(xpath="//div[@id=\"main-menu\"]/child::div[2]/child::a[3]")
	WebElement pnc;
	
	@FindBy(xpath="//div[@class=\"flex flex-wrap\"]/child::div[2]") 
	WebElement popAlert;
	
	@FindBy(xpath="//input[@name=\"search\"]") 
	WebElement searchbar;
	
	@FindBy(xpath="(//div[@class=\"bg-image-overlay absolute top-0 left-0 p-1 w-full text-xs text-white h-full\"])[1]")
	WebElement selectdropdown;
	
	@FindBy(xpath="//h1[@class=\"font-bold leading-snug text-24 md:text-32 md:w-80pe\"]")
	WebElement endMessage;
	
	/*============================================ 2 (CORPORATE ENQUIRY)============================================ */
	
	
	@FindBy(xpath="//div[@id=\"main-menu\"]/div[2]/a[12]")
	WebElement corpEnqBtn;
	
	@FindBy(id="name_main_mobile")
	WebElement fillName;
	
	@FindBy(id="phone_main_mobile")
	WebElement fillPhoneNo;
	
	@FindBy(id="email_main_mobile")
	WebElement fillEmail;
	
	@FindBy(id="MyCompanyName")
	WebElement fillCompName;
	
	@FindBy(id="citySelect")
	WebElement selectCity;
	
	@FindBy(xpath="//select[@id=\"citySelect\"]/option[12]")
	WebElement cityName;
	
	@FindBy(xpath="//button[@class=\"submitMobileFromButton\"]")
	WebElement bookConsultationBtn;
	
	@FindBy(xpath="//div[@class=\"submitMsg\"]")
	WebElement displayMsg;
	
	/*============================================ 3 (BLOG)============================================ */
	
	//
	@FindBy(xpath="//div[@id=\"main-menu\"]/div[2]/a[13]")
	WebElement blogBtn;
	
	@FindBy(xpath="//h2[text()=\"Top Blogs\"]") 
	WebElement topBlogs;
	
	@FindBy(xpath="//a[text()=\"Posh Areas in Gurgaon\"]") 
	WebElement onLink;
	
	@FindBy(id="username_sidebar") 
	WebElement sideName;
	
	@FindBy(id="city_sidebar") 
	WebElement sideSelectCity;
	
	@FindBy(id="service_sidebar") 
	WebElement sideChooseService;
	
	@FindBy(id="mobile_sidebar") 
	WebElement sideMobileNo;
	
	@FindBy(id="email_sidebar") 
	WebElement sideGmail;
	
	@FindBy(id="lead_gen_btn") 
	WebElement sideSubmit;
	 
	@FindBy(id="thanky") 
	WebElement sideResult;
	
	/*============================================ 4 (PROPERTY DETAILS)============================================ */
	
	
	@FindBy(xpath="//div[@id=\"raHomeTile\"]/child::img") WebElement rentalAgreement;
	
	@FindBy(xpath="//div[@class=\"tp:px-1.6p tp:pt-8 tp:pb-4.2p\"]/div[2]/div[2]") WebElement biometric;
	
	@FindBy(xpath="//div[text()=\"Mumbai\"]") WebElement selectPopCity;
	
	@FindBy(xpath="//div[@class=\"train-container md:z-20 \"]/div[3]") WebElement propertyDetail;
	
	@FindBy(xpath="//div[@id=\"ls-documentforms-propertyType-nbInput\"]/div/div/div") WebElement typeOfProperty;
	
	@FindBy(name="flatNumber")WebElement godownNo;
	
	@FindBy(name="buildingName") WebElement buildingName;
	
	@FindBy(name="locality") WebElement locality;
	
	@FindBy(xpath="(//button[@class=\"without-ring:focus:not border-none\"])[1]") WebElement noOfBedrooms;
	
	@FindBy(xpath="(//button[@class=\"without-ring:focus:not border-none\"])[2]") WebElement noOfBathroom;
	
	@FindBy(name="street") WebElement streetName;
	
	@FindBy(name="pincode") WebElement pincode;
	
	@FindBy(xpath="(//div[@class=\"css-v2nw5i-control nb-select__control\"])[2]/div/div") WebElement district;
	
	@FindBy(id="ls-documentforms-taluka-nbInput") WebElement taluka;
	
	@FindBy(id="ls-documentforms-village-nbInput") WebElement village;
	
	@FindBy(id="ls-documentforms-propertyNumberType-nbInput") WebElement propertyNoType;
	
	@FindBy(id="ls-documentforms-propertyNumber-nbInput") WebElement propertyNo;
	
	@FindBy(id="ls-documentforms-builtUpArea-nbInput") WebElement flatBuildUpArea;
	
	@FindBy(id="ls-documentforms-builtUpAreaUnit-nbInput") WebElement buildUpAreaUnit;
	
	@FindBy(id="ls-gender-NON_RESIDENTIAL") WebElement nonResidentialRadioBTn;
	
	@FindBy(name="parkingArea") WebElement parkingArea;
	
	@FindBy(id="ls-documentforms-parkingAreaUnit-nbInput") WebElement parkingAreaUnit;
	
	@FindBy(id="ls-documentforms-galleryArea-nbInput") WebElement galleryArea;
	
	@FindBy(id="ls-documentforms-galleryAreaUnit-nbInput") WebElement galleryAreaUnit;
	
	@FindBy(xpath="//div[@class=\"flex gap-2\"]/button[2]") WebElement saveNproceed;
	
	@FindBy(xpath="//div[@class=\"popup-form\"]/child::div[2]") WebElement landlordDetail;
	
	/*============================================ 5 (DEFECT IN CORP ENQUIRY)============================================ */
	
	@FindBy(id="name_main_mobile")
	WebElement nameDef;
	
	@FindBy(id="phone_main_mobile")
	WebElement phoneNoDef;
	
	
	//constructor
	public PnCPageFac(WebDriver driver) 
	{
				 this.driver=driver;
				 PageFactory.initElements(driver, this);
	}
	
	/*============================================ 1 ( METHODS OF SEARCH BAR)============================================ */
	
	public void clickMenu() 
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(menu));
	    
		menu.click();
		 
	}
	
	public void clickPnC() throws InterruptedException {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(pnc));
		
		//Thread.sleep(2000);
		pnc.click();
		
		
		 String mainWindowHandle = driver.getWindowHandle();
	     Set<String> allWindowHandles = driver.getWindowHandles();
	
	     for (String windowHandle : allWindowHandles) {
	         if (!windowHandle.equals(mainWindowHandle)) {
	             driver.switchTo().window(windowHandle);
	             break;
	         }
	     }
	     popAlert.click();
	     
	     driver.switchTo().window(mainWindowHandle);
		
	}
	
	public void typeInSearchBar(String inputSearchBar) throws InterruptedException {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(searchbar));
		
		
		searchbar.click();
		searchbar.sendKeys(inputSearchBar);
		
	}
	
	public void chooseThefacility() throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(selectdropdown));
		
		Thread.sleep(3000);
	    
		selectdropdown.click();
	}
	
	public String navigatesOnFacilityPage() {
		 
	     return endMessage.getText();
	
	 
	}
	
	/*============================================ 2 (METHODS OF CORPORATE ENQUIRY)============================================ */
	
	
	public void clickOnCorpEnq() {
		corpEnqBtn.click();
		
	}
	
	public void fillDetails(String name, String mobile_number, String email, String company_name) throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(fillName));
	    
		fillName.sendKeys(name);
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(fillPhoneNo));
	    
		fillPhoneNo.sendKeys(mobile_number);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(fillEmail));
	    
		fillEmail.sendKeys(email);
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(fillCompName));
	    
		fillCompName.sendKeys(company_name);	
	}
	
	public void selectCityFromList() throws InterruptedException {
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(selectCity));
	    
		selectCity.click();
		select = new Select(selectCity);
		select.selectByVisibleText("PUNE");
		cityName.click();
		
	}
	
	public void clickOnBookConsultation() throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(bookConsultationBtn));
		
		bookConsultationBtn.click();
	}
	
	public void displayTheMsg() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement e1 = driver.findElement(By.xpath("//div[@class=\"submitMsg\"]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"submitMsg\"]")));
		
		String res = e1.getText();
		
		Assert.assertEquals("Thank You For Submit The Form",res);
	
	}
	
	
	
	/*============================================ 3 (METHODS OF BLOG)============================================ */
	
	
	
	
	public void clickOnBlog() throws InterruptedException, AWTException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(menu));
	    
		Thread.sleep(2000);
		menu.click();
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(blogBtn));
		
		
		
		blogBtn.click();
			
		
		
	
	}
	
	public void scrollDownTheBlogPage() throws InterruptedException, AWTException {
		
		
		// Number of times to press Page Down 	
		 int numPageDowns = 12; 
		 robot = new Robot();
	     
	     for (int i = 0; i < numPageDowns; i++) {
	         robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	         robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     }
	    
	    //Thread.sleep(3000);
		
	}
	
	public void clickOnTopBlogs() {
	
		actions = new Actions(driver);
	    actions.click(topBlogs).build().perform();
		
	}
	
	public void scrollDownTopBlogs() throws InterruptedException, AWTException {
		robot = new Robot();
		
		int numPageDowns = 4; 
		 robot = new Robot();
	    
	    for (int i = 0; i < numPageDowns; i++) {
	        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    }
		
		
	}
	
	public void clickOnLink() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(onLink));
	    
		onLink.click();
	}
	
	public void scrollDownContactUs() throws AWTException {
		
		 js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	    
	}
	
	public void sideDetails(String bName , String bMobile_no, String bGmail) throws InterruptedException {
		//name
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(sideName));
		
		sideName.sendKeys(bName);
		
		
		//select choose a service
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(sideSelectCity));
	    
		sideSelectCity.click();
		select = new Select(sideSelectCity);
		select.selectByVisibleText("Ghaziabad");
		
		//choose a service
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(sideChooseService));
	    
		sideChooseService.click();
		select = new Select(sideChooseService);
		select.selectByVisibleText("Buy Property");
		
		//enter mobile number
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(sideChooseService));
	    
		sideMobileNo.sendKeys(bMobile_no);
		
		//enter email
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(sideGmail));
	    
		sideGmail.sendKeys(bGmail);
	
		
	}
	
	public void clickOnSideSubmit() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(sideSubmit));
	    
		sideSubmit.click();
	}
	
	public void checkSubmissionMsg() {
		
	
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("thanky")));
		
		 String res = sideResult.getText();
		
		Assert.assertEquals("Thanks for your Response",res);
	  
	}
	
	
	
	/*============================================ 4 (METHODS OF PROPERTY DETAILS)============================================ */
	
	
	
	public void scrollTheHomePage() throws InterruptedException, AWTException {
		Thread.sleep(2000);
	   robot = new Robot();
	  
	    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	    Thread.sleep(2000);
	}
	 
	
	
	public void chooseRentalAgreement() {
		
		actions = new Actions(driver);
		actions.click(rentalAgreement).perform();
	}
	
	public void navigatesToLegalServices() throws InterruptedException {
		
		
		String mainWindowHandle = driver.getWindowHandle();
	
			    for (String windowHandle : driver.getWindowHandles()) {
	
			        if (!windowHandle.equals(mainWindowHandle)) {
	
			            driver.switchTo().window(windowHandle);
	
			            break;
	
			        }
	
			    }
			    
			   Thread.sleep(3000); 
			  
	}
	
	public void clickOnSelectCity() {
		String mainWindowHandle = driver.getWindowHandle();
	
	    for (String windowHandle : driver.getWindowHandles()) {
	
	        if (!windowHandle.equals(mainWindowHandle)) {
	
	            driver.switchTo().window(windowHandle);
	
	        }
	
	    }
	    selectPopCity.click();
	    
	    
		
	}
	
	public void clickOnBiometric() throws InterruptedException {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(biometric));
		 
		 
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		js.executeScript("arguments[0].click();", biometric);
		
		
	}
	
	public void clickOnPropertyDetail() throws InterruptedException {
		Thread.sleep(5000);
		propertyDetail.click();
	}
	
	public void enterAllDetails(String flatNo, String BuildingName, String Locality ,String street,String pincode1 , String propNo, String flatBuildUpArea1, String parkingArea1 , String galleryArea1) throws InterruptedException, AWTException {
		
		//select type of property
		Thread.sleep(2000);
		typeOfProperty.click();
		
		 robot = new Robot();
	
		   for (int i = 0; i < 2; i++) {
			   robot.keyPress(KeyEvent.VK_DOWN);
				  robot.keyRelease(KeyEvent.VK_DOWN);
		   }
		
	
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER); 
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(godownNo));
		
		
		//select flat number
		godownNo.sendKeys(Keys.CONTROL +"a");
		godownNo.sendKeys(Keys.BACK_SPACE);
		godownNo.sendKeys(flatNo);
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(buildingName));
		
		//building name
		buildingName.sendKeys(Keys.CONTROL +"a");
		buildingName.sendKeys(Keys.BACK_SPACE);
		buildingName.sendKeys(BuildingName);
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(locality));
		  
		  //locality
		locality.sendKeys(Keys.CONTROL +"a");
		locality.sendKeys(Keys.BACK_SPACE);
		locality.sendKeys(Locality);
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(noOfBedrooms));
		  
		
		//no of bedroom
		noOfBedrooms.click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(noOfBathroom));
		
		//no of bathroom
		noOfBathroom.click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(streetName));
		
		//type the street name
		streetName.sendKeys(Keys.CONTROL +"a");
		streetName.sendKeys(Keys.BACK_SPACE);
		streetName.sendKeys(street);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(pincode));
		
		
		//enter the pincode
		pincode.sendKeys(Keys.CONTROL +"a");
		pincode.sendKeys(Keys.BACK_SPACE);
		pincode.sendKeys(pincode1);
		 
		//district
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(district)); 
		district.click();
		
	
		 
		
		 robot = new Robot();
	   
	   for (int i = 0; i < 4; i++)
	   {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	   }
	
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER); 
		  
		
		//taluka
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(taluka));
		  taluka.click();
		  
	
		   for (int i = 0; i < 2; i++) 
		   {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		   }
		   
	
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		
		  
		
		//village
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(village));
		  
	      village.click();
	    
	
	    for (int i = 0; i < 6; i++) 
	    {
	 	   robot.keyPress(KeyEvent.VK_DOWN);
	 	   robot.keyRelease(KeyEvent.VK_DOWN);
	    }
	
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
	
		  
		 
		
		//property number type
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.elementToBeClickable(propertyNoType));
		  
		  propertyNoType.click();
		  
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
		
		//property number
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(propertyNo));
		  propertyNo.sendKeys(Keys.CONTROL +"a");
		  propertyNo.sendKeys(Keys.BACK_SPACE);
		  propertyNo.sendKeys(propNo);		
		
		//house flat build up area
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(flatBuildUpArea));
		flatBuildUpArea.sendKeys(Keys.CONTROL +"a");
		flatBuildUpArea.sendKeys(Keys.BACK_SPACE);
		flatBuildUpArea.sendKeys(flatBuildUpArea1);
		
		
		
		//build up area unit
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.elementToBeClickable(buildUpAreaUnit));
		 buildUpAreaUnit.click();
		
	
		   for (int i = 0; i < 2; i++) {
			   robot.keyPress(KeyEvent.VK_DOWN);
			   robot.keyRelease(KeyEvent.VK_DOWN);
		   }
	
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		
		  //non residential radio button
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.elementToBeClickable(nonResidentialRadioBTn));
		  nonResidentialRadioBTn.click();
		
		  
		  //parking area
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(parkingArea));
		  parkingArea.sendKeys(Keys.CONTROL +"a");
		  parkingArea.sendKeys(Keys.BACK_SPACE);
		
		 parkingArea.sendKeys(parkingArea1);
			
			
	  //parking area unit
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(parkingAreaUnit));
		parkingAreaUnit.click();
			
	
		for (int i = 0; i < 2; i++) 
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
			   
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			  
	   //gallery area
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.visibilityOf(galleryArea));
		galleryArea.sendKeys(Keys.CONTROL +"a");
		galleryArea.sendKeys(Keys.BACK_SPACE);
		galleryArea.sendKeys("2904");
		
		  Thread.sleep(2000);
		
		//gallery area unit
		  wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.elementToBeClickable(galleryAreaUnit));
		  galleryAreaUnit.click();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		 
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		
	}
	
	public void clickOnSaveNproceed() {
		
		saveNproceed.click();
		
	}
	
	public void navigatesToLandlordDetailsPage() {
		
	     wait = new WebDriverWait(driver,Duration.ofSeconds(7));
	     wait.until(ExpectedConditions.visibilityOf(landlordDetail));
		
		
		 String landlordDeetTxt = landlordDetail.getText();
		  
		  Assert.assertEquals("Landlord Detail", landlordDeetTxt);
	      
	}
	
	
	/*============================================ 5 (METHODS OF DEFECT IN CORP ENQUIRY)============================================ */
	
	
	
	public void enterNamedef() {
		  wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOf(nameDef));
		  
		  nameDef.sendKeys("Neev Jagtap");
	}
	
	public void enterPhoneNoDef(String mobile_number) {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOf(phoneNoDef));
		
		 phoneNoDef.sendKeys(mobile_number);
		
		
	}
	
	}
		
	
	
