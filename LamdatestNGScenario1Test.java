public class lamdatest {
    WebDriver driver;

    @BeforeMethod
    public void googleSearch(){
        System.setProperty("webdriver.chrome.driver", "path to web driver");
        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/.");
        System.out.println(" ---------- Start -------------");      
    try {
         Assert.assertTrue(driver.findElement(By.xpath("xyz")).isDisplayed(), "unable to find the link");

    } catch (Throwable t) {
        System.out.println("Error");
    }
    System.out.println(" ---------- End -------------");
  }

@Test
public void test() throws InterruptedException {
// saving the GUI element reference into a "element" variable of WebElement type
WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Selenium Playground')]")));
WebElement element = driver.find_elements(By.XPATH, '//*[@id="__next"]/div/section[1]/div/h1')
// click on the compose button as soon as the "compose" button is visible

}
}
