package testrunners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/Vehiclefeatures/Vehicledata.feature"},
		glue = {"Steps"},
		plugin = {"pretty"}
		)
public class Vehicledatatestrunner {

}
