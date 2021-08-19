package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target LOG_IN_BTN = Target.the("press button log_in")
            .located(By.id("login2"));
    public static final Target USER_INPUT = Target.the("insert user")
            .located(By.id("loginusername"));
    public static final Target PASSWORD_INPUT = Target.the("insert password")
            .located(By.id("loginpassword"));
    public static final Target LOGIN_BTN = Target.the("Login ")
            .located(By.cssSelector("#logInModal .btn-primary"));

    public static final Target VISUALIZE_HOME = Target.the("Visualized the home of the page web of test ")
            .located(By.id("nameofuser"));


}
