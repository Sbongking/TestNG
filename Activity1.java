package TngAct;
public class Activity1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        
        
        driver.get("https://www.training-support.net");
    }

    @Test
    public void exampleTestCase() {
        
        String title = driver.getTitle();
            
        
        System.out.println("Page title is: " + title);
            
         
        Assert.assertEquals("Training Support", title);
                    
        
        driver.findElement(By.tagName("a")).click();
                    
        
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void afterMethod() {
        
        driver.quit();
    }

}