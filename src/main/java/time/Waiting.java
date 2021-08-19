package time;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Waiting implements Interaction {
    private int seconds;

    public Waiting(int seconds) {
        this.seconds = seconds;
    }

    @Override
    @Step("{0} Waiting #seconds second(s) before executing the next step")
    public <T extends Actor> void performAs(T actor) {
    new InternalSystemClock().pauseFor((seconds * 1000));
    }
    public static Interaction seconds(int seconds){
        return Tasks.instrumented(Waiting.class, seconds);
    }
}
