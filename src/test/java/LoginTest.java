import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest {
    private final static String USERNAME = "EugenBorisik";
    private final static String PASSWORD = "qwerty12345";

    @Test
    public void login() {
        Configuration.browser = "chrome";
        open("https://192.168.100.26/");

        $(By.id("Username")).sendKeys(USERNAME);
        $(By.id("Password")).sendKeys(PASSWORD);
        $(By.id("SubmitButton")).click();
        $(By.xpath("//ins[text()='Sign Out']")).should(exist);
        $(By.xpath("//ins[text()='Sign Out']/../..")).shouldHave(cssClass("sign-out-span"));
    }
}