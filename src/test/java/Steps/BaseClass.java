package Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterSuite;


public class BaseClass extends Elements{
    WebDriver driver;
    String PassOpen;
    String AnaPage;
    //WebDriverWait wait = new WebDriverWait(driver,300);
    Elements elements = new Elements();
    @FindBy(how = How.XPATH, xpath = "//div[text()='Adrese Teslim']")
    private WebElement BTN_ADRESE_TESLİM;
    @FindBy(how = How.XPATH, xpath = "//span[text()='Giriş Yap']")
    private WebElement TXT_GRS_YAP;

    public void openLoginPage() throws Throwable{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abatman\\Projects\\DominosTestFramework\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Open Login Page");
        driver.get("https://www.dominos.com.tr/");
        String equl = "Adrese Teslim";
        PassOpen = driver.findElement(By.xpath("//div[text()='Adrese Teslim']")).getText();
        if (PassOpen.equals(equl)){
            System.out.println("------------BAŞARILI OPEN-----------------");
        }
        else {
            System.out.println("------------BAŞARISIZ OPEN-----------------");
        }
    }

    public void ServisSeçimi() throws Throwable {
        driver.findElement(By.xpath("//div[text()='Adrese Teslim']")).click();
        //BTN_ADRESE_TESLİM.click();
    }

    public void BolgeSecimi() throws Throwable {
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//i[@class='icon-chevron-down dropdown__ButtonIndicatorIcon-wa0gtc-5 cTBsPq'])[1]")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//div[@class='menuItem dropdown__MenuItem-wa0gtc-15 jfECxv'])[1]")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//i[@class='icon-chevron-down dropdown__ButtonIndicatorIcon-wa0gtc-5 cTBsPq'])[2]")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//div[text()='Arnavutköy'])")).click();
        Thread.currentThread().sleep(7000);
        driver.findElement(By.xpath("(//i[@class='icon-chevron-down dropdown__ButtonIndicatorIcon-wa0gtc-5 cTBsPq'])[3]")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//div[text()='Arnavutköy Merkez Mh.'])")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.id("DPE_TR_STOREFILTERFORMDELIVERY_BUTTON_ADDRESSSELECT")).click();
    }

    public void Anasayfa() throws Throwable {
        String  Anasayfa = "Giriş Yap";
        AnaPage = driver.findElement(By.xpath("//span[text()='Giriş Yap']")).getText();
        compare(Anasayfa,AnaPage);
        /*
        if (AnaPage.equals(Anasayfa)){
            System.out.println("------------BAŞARILI ANASAYFA-----------------");
        }
        else {
            System.out.println("------------BAŞARISIZ ANASAYFA-----------------");
        }*/
    }

    public void TumKampanyalar() throws Throwable {

       // JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("DPE_TR_HOME_BUTTON_CAMPAIGNS"));
        ElementiGoreneKadarScroll(element);
      //  js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void ElementiGoreneKadarScroll(WebElement str) throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", str);
    }

    public void RandomKamp() throws Throwable {
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon-times-bold']")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//div[text()='Sipariş ver'])[1]")).click();

    }

    public void SepeteEkle() throws Throwable {
        Thread.currentThread().sleep(5000);
        WebElement element = driver.findElement(By.xpath("//h2[@class='styled__ProductTitle-kipobh-24 bOOSDE']"));
        ElementiGoreneKadarScroll(element);
      /*  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);*/
        driver.findElement(By.xpath("(//div[@class='dropdown__Button2Indicator-wa0gtc-10 oYXWv'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='styled__HasImageContainer-kipobh-0 fvsATd'])[1]")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("(//a[text()='Sepete Ekle'])[2]")).click();

    }

    public void SepeteGit() throws Throwable {
        Thread.currentThread().sleep(5000);
        driver.findElement(By.xpath("//i[@class='icon-angle-up']")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.xpath("//a[@class='styled__BasketButton-sc-126ws66-37 lkIlON']")).click();

    }

    public void SepetiOnayla() throws Throwable {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("(//a[text()='Sipariş Ver'])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.xpath("(//a[text()='Sipariş Ver'])[1]")).click();
        Thread.currentThread().sleep(1000);
        driver.findElement(By.xpath("//span[text()='Üye Olmadan Devam Et']")).click();
        Thread.currentThread().sleep(5000);
    }

    public void AdresTamamla() throws Throwable {
        driver.findElement(By.xpath("(//i[@class='icon-chevron-down dropdown__ButtonIndicatorIcon-wa0gtc-5 cTBsPq'])[4]")).click();
        driver.findElement(By.xpath("(//div[text()='23 Nisan Cd.'])[1]")).click();
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_DROPDOWN_APARTMENTNUMBER")).sendKeys("7");
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_INPUT_DOORNUMBER")).sendKeys("1");
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_INPUT_PHONE")).click();
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_INPUT_PHONE")).sendKeys("554445566");
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_INPUT_INSTRUCTIONS")).sendKeys("adres tarifi");
        driver.findElement(By.id("DPE_TR_ADDRESSADDMODAL_BUTTON_SAVE")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.id("DPE_TR_ADDRESSLISTDELIVERY_BUTTON_SELECTADDRESS")).click();

    }

    public void OdemeTipiSecDevamEt() throws Throwable {
        Thread.currentThread().sleep(3000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(By.xpath("(//div[@class='styled__Header-sc-9iecht-5 ipRoCX'])[2]")).click();
        driver.findElement(By.id("DPE_TR_PAYMENTOPTIONS_BUTTON_CONTINUE-D")).click();

    }

    public void checkTestClosed() {
        String CurrentUrl = driver.getCurrentUrl();
        String Url = "https://www.dominos.com.tr/misafir/onay";
        if (CurrentUrl.equals(Url)) {
            System.out.println(driver.getCurrentUrl());
            System.out.println("İstenilen sayfasındasınız");
            System.out.println("-------------BAŞARILI Senaryo----------------");

        } else {
            System.out.println(driver.getCurrentUrl());
            System.out.println("istenilen sayfaya gidemediniz");
            System.out.println("------------BAŞARISIZ Senaryo-----------------");


        }
        TearDown();
    }
    public void compare(String String1,String String2){
        if(String1.equals(String1)){
            System.out.println("System.out.println(\"------------BAŞARILI ANASAYFA-----------------\");");
        }
        else System.out.println("System.out.println(\"------------BAŞARISIZ ANASAYFA-----------------\");");

    }
    @AfterSuite
    public void TearDown() {
        driver.close();
        driver.quit();
    }
}
