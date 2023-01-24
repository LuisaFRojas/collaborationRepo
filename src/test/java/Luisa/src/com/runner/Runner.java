package Luisa.src.com.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/reports/cucumber-report.html",
        features = "src/test/java/Luisa/resources",
        glue = "src/test/java/Luisa/src/com/stepDefs",
        dryRun = false,
        tags = "@somethingToRun"
)
public class Runner {
    public static void main(String[] args) {

    }
}
