package p2.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class vegnonveg{
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://www.vegnonveg.com/");
            Thread.sleep(5000); // 5-second delay after opening the site
            
         // Navigate to the sign-in page once
            navigateToSignInPage(driver, wait);

            // Test case 1: Incorrect email
            testIncorrectEmail(driver, wait);
            Thread.sleep(5000); // 5-second delay

            // Test case 2: Correct email, incorrect password
            testCorrectEmailIncorrectPassword(driver, wait);
            Thread.sleep(5000); // 5-second delay

            // Handle the error dialog
            handleErrorDialog(driver, wait);

            // Test case 3: Correct email, correct password
            testCorrectEmailCorrectPassword(driver, wait);	
            Thread.sleep(5000); // 5-second delay

//            // Perform search operation
            performSearch(driver, wait);

            WebElement filter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/div")));
            filter.click();

            Thread.sleep(5000);

            WebElement filterGender = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div/div[3]/div/div[1]/ul/li[1]/label")));
            filterGender.click();
            Thread.sleep(3000);

            WebElement filterBrand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div/div[3]/div/div[2]/ul/li/label")));
            filterBrand.click();

            Thread.sleep(3000);

            WebElement filterSelectColour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div/div/div[4]/ul/li[1]/label")));
            filterSelectColour.click();

            Thread.sleep(5000);

            WebElement filterApply = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[3]")));
            filterApply.click();
            Thread.sleep(5000);

            WebElement shoeSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[1]/div[3]/a/div[1]/img[1]")));
            shoeSelect.click();
            Thread.sleep(5000);

            // Switch to the new tab
            String originalHandle = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Wait for the size dropdown arrow to be clickable
            WebElement sizeDropdownArrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div/i")));
            sizeDropdownArrow.click();
            Thread.sleep(1000); // Short delay after opening dropdown

            // Select a size (e.g., "US 9" - adjust xpath as needed)
            WebElement desiredSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/ul/li[1]")));
            desiredSize.click();
            Thread.sleep(1000); // Short delay after selecting size

            WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[4]/button")));
            addToCart.click();
            Thread.sleep(7000); // Wait for 7 seconds after adding to cart
            // Close the current tab
            driver.close();

            // Switch back to the original tab
            driver.switchTo().window(originalHandle);

            Thread.sleep(5000);

            WebElement headerHomeIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[1]/div[2]/a/img")));
            headerHomeIcon.click();


            // Wait for the home page to load
            Thread.sleep(5000); // 5-second delay after clicking the header icon

            // You can start your new actions from here
            System.out.println("Starting new actions from the homepage");

            WebElement apparel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[2]/div/nav/div[8]/a")));
            apparel.click();
            
            Thread.sleep(5000);
            
            
            WebElement apparelItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div/div[3]/div[1]/div[8]/a/div[1]/img[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", apparelItem);
            Thread.sleep(2000);
            apparelItem.click();
            Thread.sleep(5000);
            

            // Switch to the new tab
            String originalHandle1 = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle1)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Now you're in control of the new tab
            System.out.println("Switched to new tab: " + driver.getTitle());

            
            WebElement sizeDropdownArrow1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[1]/div/div/i")));
            sizeDropdownArrow1.click();
            Thread.sleep(2000);
            
            WebElement desiredSize1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[1]/div/ul/li[1]")));
            desiredSize1.click();
            Thread.sleep(2000);
            

            WebElement quantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/div/i[2]")));
            quantity.click();
            Thread.sleep(2000);
            
            WebElement addToCart1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[4]/button")));
            addToCart1.click();
            Thread.sleep(8000);
            
            driver.close();

            // Switch back to the original tab
            driver.switchTo().window(originalHandle1);
            Thread.sleep(5000);
            
            WebElement lifestyle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[2]/div/nav/div[11]/a")));
            lifestyle.click();
            Thread.sleep(5000);
            
            WebElement lifestyleItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div/div[3]/div[1]/div[4]/a/div[1]/img[1]")));
            lifestyleItem.click();
            Thread.sleep(5000);
            
            // Switch to the new tab
            String originalHandle2 = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle2)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Now you're in control of the new tab
            System.out.println("Switched to new tab: " + driver.getTitle());
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            Thread.sleep(5000);  // Wait for the scroll to complete

            WebElement sizeDropdownArrow2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[1]/div/div/i")));
            sizeDropdownArrow2.click();
            Thread.sleep(2000);
            
            WebElement desiredSize2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[1]/div/ul/li")));
            desiredSize2.click();
            Thread.sleep(2000);
            
            WebElement addToCart2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[4]/button")));
            addToCart2.click();
            Thread.sleep(8000);
            
            driver.close();

            // Switch back to the original tab
            driver.switchTo().window(originalHandle2);
            Thread.sleep(5000);
            
            
            WebElement airforce = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[2]/div/nav/div[5]/a")));
            airforce.click();
            
            Thread.sleep(5000);
            
            WebElement airforceItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" /html/body/div[2]/div[4]/div/div[3]/div[1]/div[7]/a/div[1]/img[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", airforceItem);
            Thread.sleep(5000);
            airforceItem.click();
            Thread.sleep(5000);
            
            // Switch to the new tab
            String originalHandle3 = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle3)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Now you're in control of the new tab
            System.out.println("Switched to new tab: " + driver.getTitle());
            
          
             WebElement sizeDropdownArrow3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/div/i")));
             sizeDropdownArrow3.click();
             Thread.sleep(1000); // Short delay after opening dropdown

             // Select a size (e.g., "US 9" - adjust xpath as needed)
             WebElement desiredSize3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[3]/div/div[1]/div/ul/li[2]")));
             desiredSize3.click();
             Thread.sleep(1000); // Short delay after selecting size

             WebElement addToCart3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/form/div[4]/button")));
             addToCart3.click();
             Thread.sleep(7000); // Wait for 7 seconds after adding to cart
             
             WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/div[4]/span[1]/i")));
             cartButton.click();
             Thread.sleep(5000);
            
             WebElement cartView = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/div[4]/div/div[2]/div[3]/div/a/button")));
             cartView.click();
             Thread.sleep(5000);
             
             WebElement removeItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/div/div[5]/div/span[2]/span")));
             removeItem.click();
             Thread.sleep(5000);
             
             WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[4]/div/a/button")));
             ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800);");
             checkout.click();
             Thread.sleep(5000);

          // After navigating to the checkout page
           //  fillBillingAddress(driver, wait);
             
             WebElement FirstName = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[1]/input"));
             FirstName.click();
             FirstName.sendKeys("Rubber");
             Thread.sleep(5000);
             
             WebElement LastName = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[2]/input"));
             LastName.click();
             LastName.sendKeys("Shredder");
             Thread.sleep(5000);
             
             WebElement Country = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[4]/select"));
             Country.click();
             Thread.sleep(5000);
             WebElement Country1 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[4]/select/option[3]"));
             Country1.click();
             Thread.sleep(5000);
             
             WebElement PhoneNo = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[3]/div/input"));
             PhoneNo.click();
             PhoneNo.sendKeys("1234567890");
             Thread.sleep(5000);
             
             
             WebElement Address1 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[2]/input"));
             Address1.click();
             Address1.sendKeys("Examplenagar");
             Thread.sleep(5000);
             
             WebElement Address2 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[3]/input"));
             Address2.click();
             Address2.sendKeys("K I A");
             Thread.sleep(5000);
             
             WebElement zipCode = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/input"));
             zipCode.click();
             zipCode.sendKeys("123456");
             Thread.sleep(5000);
             
             WebElement saveAndDeliver = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[7]/div/div/button")));
             saveAndDeliver.click();
             Thread.sleep(5000);
             
             WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[4]/div/div[2]/div/form/button")));
             continueButton.click();
             Thread.sleep(5000);
             
             ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1100);");
             
             WebElement payButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div[5]/div/div[2]/div[2]/form/div[2]/button")));
             payButton.click();
             Thread.sleep(15000);
             
             
             
             
             
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//             driver.quit(); // Close the browser
        }
    }

    private static void testIncorrectEmail(WebDriver driver, WebDriverWait wait) {
        try {
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
            WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/form/div[4]/button"));

            emailField.clear();
            passwordField.clear();
            emailField.sendKeys("example.com");
            passwordField.sendKeys("");
            Thread.sleep(3000); // 3-second delay before clicking submit
            submitButton.click();

            WebElement emailError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email-error\"]")));
            System.out.println("Email Error Message: " + emailError.getText());
        } catch (Exception e) {
            System.out.println("Error in testIncorrectEmail: " + e.getMessage());
        }
    }
    
     private static void testCorrectEmailIncorrectPassword(WebDriver driver, WebDriverWait wait) {
         try {
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
             WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
             WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/form/div[4]/button"));

             emailField.clear();
            passwordField.clear();
             emailField.sendKeys("example@gmail.com");
            Thread.sleep(2000); // 2-second delay after entering email
             passwordField.sendKeys("abcd");
             Thread.sleep(3000); // 3-second delay before clicking submit
             submitButton.click();

            WebElement passwordError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password-error\"]")));
            System.out.println("Password Error Message: " + passwordError.getText());
        } catch (Exception e) {
            System.out.println("Error in testCorrectEmailIncorrectPassword: " + e.getMessage());
         }
     }

    private static void testCorrectEmailCorrectPassword(WebDriver driver, WebDriverWait wait) {
         try {
             WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
             WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/form/div[4]/button"));

             emailField.clear();
             passwordField.clear();
             emailField.sendKeys("example@gmail.com");
             Thread.sleep(2000); // 2-second delay after entering email
             passwordField.sendKeys("password");
             Thread.sleep(3000); // 3-second delay before clicking submit
             submitButton.click();

            wait.until(ExpectedConditions.urlContains("account"));
           System.out.println("Login Successful");
         } catch (Exception e) {
             System.out.println("Error in testCorrectEmailCorrectPassword: " + e.getMessage());
         }
     }

    private static void performSearch(WebDriver driver, WebDriverWait wait) {
        try {
            // Click on the search icon
            WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/div[1]/i")));
            searchIcon.click();
            Thread.sleep(2000); // 2-second delay after clicking search icon

            // Enter shoe name in search bar
            WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/div[1]/form/div/input")));
            searchBar.sendKeys("Air Force 1"); // Replace with the actual shoe name you want to search
            Thread.sleep(2000); // 2-second delay after entering shoe name

            // Press Enter to submit the search
            searchBar.sendKeys(Keys.ENTER);
            Thread.sleep(5000); // 5-second delay after submitting search to allow page to load
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
     // Method to navigate to the sign-in page
     public static void navigateToSignInPage(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div/div[1]/div[1]/i")));
         menuButton.click();
         Thread.sleep(3000); // 3-second delay after clicking menu button

         WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidebar\"]/div/ul/li[3]/a")));
        signInOption.click();
         Thread.sleep(3000); // 3-second delay after clicking sign in
     }

    public static void scrollToElement(WebDriver driver, WebElement element, int offset) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, arguments[1]);", element, offset);
    }

   private static void handleErrorDialog(WebDriver driver, WebDriverWait wait) {
       try {
          WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div/div[1]/button")));
          closeButton.click();
          // Wait for the dialog to disappear
          wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div[4]/div")));
           System.out.println("Error dialog closed successfully");
       } catch (Exception e) {
           System.out.println("Error handling dialog box: " + e.getMessage());
       }
   }
   
  
}