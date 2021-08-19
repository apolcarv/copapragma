package tasks;

import dataMapBd.dataLogin.DataLogin;
import models.login.LoginData;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import time.Waiting;
import java.util.List;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.LoginUI.*;

public class LoginTask implements Task {
    private final DataLogin conexionLogin = new DataLogin();
    private LoginData loginData;
    private String data;
    public LoginTask(String data) {
       this.data = data;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Waiting.seconds(5),
                Click.on(LOG_IN_BTN),
                WaitUntil.the(USER_INPUT, isVisible()).forNoMoreThan(5).seconds(),
               // Enter.theValue(conexionLogin.list.get(0).getUser()).into(USER_INPUT),
                Enter.theValue("test").into(USER_INPUT),
                WaitUntil.the(PASSWORD_INPUT, isVisible()).forNoMoreThan(5).seconds(),
              //  Enter.theValue(conexionLogin.list.get(0).getPassword()).into(PASSWORD_INPUT),
                Enter.theValue("test").into(PASSWORD_INPUT),
                Click.on(LOGIN_BTN)
        );
    }
    public static Performable loginSuccessFul(List<String> data){
        return Tasks.instrumented(LoginTask.class,data.get(1));
    }
}
