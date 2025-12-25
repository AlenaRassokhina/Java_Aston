import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebsiteTest {

    String websiteUrl = "https://www.mts.by";

    @Test
    @DisplayName("Проверка названия указанного блока")
    public void testBlockName() {

        WebDriver driver = new ChromeDriver();
        driver.get(websiteUrl);

        WebElement titleElement = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));

        String actualTitleText = titleElement.getText();

        String expectedTitleText = "Онлайн пополнение\nбез комиссии";

        assertEquals(expectedTitleText, actualTitleText, "Заголовок не соответствует ожидаемому!");

        driver.quit();
    }

    @Nested
    @DisplayName("Проверка наличия логотипов платёжных систем")
    class testLogoName {

        @Test
        @DisplayName("Проверка наличия логотипа Visa")
        public void testNameVisa() {

            WebDriver driver = new ChromeDriver();
            driver.get(websiteUrl);

            WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
            cookieOk.click();

            boolean searchLogoVisaExists = !driver.findElements(By.cssSelector("img[alt='Visa']")).isEmpty();
            assert searchLogoVisaExists : "Логотип Visa не найден!";

            driver.quit();
        }

        @Test
        @DisplayName("Проверка наличия логотипа Verified By Visa")
        public void testNameVerifiedByVisa() {

            WebDriver driver = new ChromeDriver();
            driver.get(websiteUrl);

            WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
            cookieOk.click();

            boolean searchLogoVerifiedByVisaExists = !driver.findElements(By.cssSelector("img[alt='Verified By Visa']")).isEmpty();
            assert searchLogoVerifiedByVisaExists : "Логотип Verified By Visa не найден!";

            driver.quit();
        }

        @Test
        @DisplayName("Проверка наличия логотипа Master Card")
        public void testNameMasterCard() {

            WebDriver driver = new ChromeDriver();
            driver.get(websiteUrl);

            WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
            cookieOk.click();

            boolean searchLogoMasterCardExists = !driver.findElements(By.cssSelector("img[src$='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg'"))
                    .isEmpty();
            assert searchLogoMasterCardExists : "Логотип Master Card не найден!";

            driver.quit();
        }

        @Test
        @DisplayName("Проверка наличия логотипа Master Card Secure Code")
        public void testNameMasterCardSecureCode() {

            WebDriver driver = new ChromeDriver();
            driver.get(websiteUrl);

            WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
            cookieOk.click();

            boolean searchLogoMasterCardSecureCodeExists = !driver.findElements(By.cssSelector("img[src$='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg'"))
                    .isEmpty();
            assert searchLogoMasterCardSecureCodeExists : "Логотип Master Card Secure Code не найден!";

            driver.quit();
        }
    }

    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
    public void testLinkDetails() {

        WebDriver driver = new ChromeDriver();
        driver.get(websiteUrl);

        WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
        cookieOk.click();

        WebElement link = driver.findElement(By.cssSelector("div.pay__wrapper > a"));
        if (link.isEnabled()) {
            System.out.println("Ссылка активна (isEnabled = true)");
            link.click();
        } else {
            System.out.println("Ссылка не активна (isEnabled = false)");
        }
        driver.quit();
    }

    @Test
    @DisplayName("Проверка работы кнопки «Продолжить»")
    public void testButton() {

        WebDriver driver = new ChromeDriver();
        driver.get(websiteUrl);

        WebElement cookieOk = driver.findElement(By.cssSelector("[id='cookie-agree']"));
        cookieOk.click();

        WebElement inputPhoneNumber = driver.findElement(By.cssSelector("[id='connection-phone']"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");

        WebElement inputSum = driver.findElement(By.cssSelector("[id='connection-sum']"));
        inputSum.click();
        inputSum.sendKeys("50");

        WebElement inputEmail = driver.findElement(By.cssSelector("[id='connection-email']"));
        inputEmail.click();
        inputEmail.sendKeys("nwskk@airsworld.net");

        WebElement buttonElement = driver.findElement(By.xpath("//form[@id = 'pay-connection']//button"));
        buttonElement.click();

        WebDriver frame = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        String payFrame = "//*[@class='bepaid-iframe']";

        frame.findElements(By.xpath(payFrame));

        driver.quit();
    }
}
