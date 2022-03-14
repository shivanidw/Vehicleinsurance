import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class EnterVehicledata {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
   ChromeDriver driver = new ChromeDriver();
   driver.get("http://sampleapp.tricentis.com/101/app.php");
   driver.manage().window().maximize();
   WebElement ddown = driver.findElement(By.name("Make"));
   Select select =new Select(ddown);
   select.selectByVisibleText("Audi");
   WebElement ddown2 = driver.findElement(By.name("Model"));
   Select select2 =new Select(ddown2);
   select2.selectByVisibleText("Motorcycle");
   driver.findElement(By.id("cylindercapacity")).sendKeys("100");
   driver.findElement(By.id("engineperformance")).sendKeys("60");
   driver.findElement(By.id("opendateofmanufacturecalender")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")).click();
   WebElement ddown3 = driver.findElement(By.name("Number of Seats"));
   Select select3 =new Select(ddown3);
   select3.selectByVisibleText("2");
   WebElement radio1 = driver.findElement(By.xpath(".//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]/span"));
   radio1.click();
   System.out.println(radio1.isDisplayed());
   WebElement ddown4 = driver.findElement(By.name("Number of Seats Motorcycle"));
   Select select4 =new Select(ddown4);
   select4.selectByVisibleText("1");
   
   WebElement ddown5 = driver.findElement(By.name("Fuel Type"));
   Select select5 =new Select(ddown5);
   select5.selectByVisibleText("Petrol");
   
   driver.findElement(By.id("payload")).sendKeys("100");
   driver.findElement(By.id("totalweight")).sendKeys("1000");
   driver.findElement(By.id("listprice")).sendKeys("10000");
   driver.findElement(By.id("licenseplatenumber")).sendKeys("AWV4567");
   driver.findElement(By.id("annualmileage")).sendKeys("1000");
   driver.findElement(By.id("nextenterinsurantdata")).click();
   
   //Enter Insurant Data//*
   driver.findElement(By.id("firstname")).sendKeys("Shivani");
   driver.findElement(By.id("lastname")).sendKeys("Dwivedi");
   driver.findElement(By.id("opendateofbirthcalender")).click();
   Thread.sleep(3000);
   String monthyearval =driver.findElement(By.className("ui-datepicker-title")).getText();
    String month= monthyearval.split(" ")[0].trim();
    String year = monthyearval.split(" ")[1].trim();
   
    while (!(month.equals("April") && year.equals("1992"))) {
    	driver.findElement(By.xpath("//a[@title='Prev']")).click();
    	monthyearval =driver.findElement(By.className("ui-datepicker-title")).getText();
    	month= monthyearval.split(" ")[0].trim();
         year = monthyearval.split(" ")[1].trim();
    }
   
   driver.findElement(By.xpath(".//a[text()='11']")).click();
   WebElement radio = driver.findElement(By.xpath(".//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
   radio.click();
   System.out.println(radio.isDisplayed());

   driver.findElement(By.id("streetaddress")).sendKeys("Rua franciso Curitiba");
   driver.findElement(By.id("zipcode")).sendKeys("110094");
   driver.findElement(By.id("city")).sendKeys("Curitiba");
   driver.findElement(By.id("website")).sendKeys("http://sampleapp.tricentis.com/101/app.php");
   
   WebElement ddown6 = driver.findElement(By.name("Country"));
   Select select6 =new Select(ddown6);
   select6.selectByVisibleText("Brazil");
   WebElement ddown7 = driver.findElement(By.name("Occupation"));
   Select select7 =new Select(ddown7);
   select7.selectByVisibleText("Employee");
   driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
   driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();

   driver.findElement(By.xpath("//*[@id=\"picturecontainer\"]")).sendKeys("C:\\Users\\Lenovo\\Pictures\\self1.jpeg");
   
   driver.findElement(By.id("nextenterproductdata")).click();
   
   //Enter product data//
   driver.findElement(By.id("openstartdatecalender")).click();
   Thread.sleep(3000);
   String monthyearval1 =driver.findElement(By.className("ui-datepicker-title")).getText();
   String month1= monthyearval1.split(" ")[0].trim();
   String year1 = monthyearval1.split(" ")[1].trim();
  
   while (!(month1.equals("April") && year1.equals("2022"))) {
   	driver.findElement(By.xpath("//a[@title='Next']")).click();
   	monthyearval1 =driver.findElement(By.className("ui-datepicker-title")).getText();
   	month1= monthyearval1.split(" ")[0].trim();
        year1 = monthyearval1.split(" ")[1].trim();
   }
   driver.findElement(By.xpath(".//a[text()='28']")).click();
   
   WebElement ddown8 = driver.findElement(By.name("Insurance Sum"));
   Select select8 =new Select(ddown8);
   select8.selectByVisibleText("25.000.000,00");
   WebElement ddown9 = driver.findElement(By.name("Merit Rating"));
   Select select9 =new Select(ddown9);
   select9.selectByVisibleText("Bonus 9");
   WebElement ddown10 = driver.findElement(By.name("Damage Insurance"));
   Select select10 =new Select(ddown10);
   select10.selectByVisibleText("Full Coverage");
   WebElement ddown11 = driver.findElement(By.name("Courtesy Car"));
   Select select11 =new Select(ddown11);
   select11.selectByVisibleText("Yes");
   driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
   driver.findElement(By.id("nextselectpriceoption")).click();
   
   //Select Price Option\\
   
   driver.findElement(By.xpath(".//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
   WebElement navigate =driver.findElement(By.id("nextsendquote"));
   Actions actions=new Actions(driver);
   actions.moveToElement(navigate);
   actions.perform();
   driver.findElement(By.xpath(".//*[@name=\"Next (Send Quote)\"]")).click();
   
   //Send Quote//
   driver.findElement(By.id("email")).sendKeys("shivanidwvd43@gmail.com");
   driver.findElement(By.id("phone")).sendKeys("5511948267201");
   driver.findElement(By.id("username")).sendKeys("Shivani12");
   driver.findElement(By.id("password")).sendKeys("acc@8&Hr");
   driver.findElement(By.id("confirmpassword")).sendKeys("acc@8&Hr");
   driver.findElement(By.id("Comments")).sendKeys("Vehicle insurance data register");
   driver.findElement(By.id("sendemail")).click();
   
  /*Alert alert = driver.switchTo().alert();
  String alertmessage = driver.switchTo().alert().getText();
  System.out.println(alertmessage);
  alert.accept();*/
	}

}
