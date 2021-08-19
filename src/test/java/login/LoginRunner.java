package login;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(

        features = "src/test/resources/feature/login/login.feature",
        tags = {"@LoginSuccessFul"},
        glue = "stepdefinition",
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class LoginRunner {
}
