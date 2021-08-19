package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import time.Waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static ui.LoginUI.*;

public class LoginQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        theActorInTheSpotlight().attemptsTo(Waiting.seconds(5));
        return VISUALIZE_HOME.resolveFor(actor).isVisible();
    }
    public static LoginQuestion ThisPresentTheElement(){
        return new LoginQuestion();
    }
}
