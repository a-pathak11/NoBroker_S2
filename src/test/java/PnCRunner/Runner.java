package PnCRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features\\PnCFeature.feature",
glue="PnCStepDefinition" 
,tags = "@propertyDetails",

plugin= {("pretty"),
		"html:target/HTMLReports/PnCReport5.html",
		"json:target/JSONReports/PnCReport5.json",
		"junit:target/JUNITReport/PnCReport5.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Runner extends AbstractTestNGCucumberTests{

}

