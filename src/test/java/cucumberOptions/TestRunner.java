    package cucumberOptions;

    import java.io.*;
    import org.junit.AfterClass;
    import org.junit.runner.RunWith;
    import com.cucumber.listener.Reporter;
    import cucumber.api.CucumberOptions;
    import cucumber.api.junit.Cucumber;
    import cucumber.api.testng.AbstractTestNGCucumberTests;
import dataProviders.ConfigFileReader;
   // import dataProviders.ConfigFileReader;
  

   
    
    

	@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "src/test/java/Features",
		    glue= {"StepDefinations"},
		    dryRun = false,
		    monochrome = true,
		    tags = {"@Test"},
		   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		  
			
			)
	public class TestRunner extends AbstractTestNGCucumberTests  {
		 
		
		  @AfterClass public static void writeExtentReport() { 
			  ConfigFileReader configFileReader = new ConfigFileReader(); 
			  Reporter.loadXMLConfig(new File(configFileReader.getReportConfigPath())); }
		 

}
//"pretty","html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report_a.json",