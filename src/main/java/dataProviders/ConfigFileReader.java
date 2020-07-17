package dataProviders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;


public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getFilePath(){
		String filePath = properties.getProperty("filePath");
		if(filePath!= null) return filePath;
		else throw new RuntimeException("FilePath not specified in the Configuration.properties file.");		
	}
	
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	
	  public DriverType getBrowser() { String browserName =
	  properties.getProperty("browser"); if(browserName == null ||
	  browserName.equals("chrome")) return DriverType.CHROME; else
	  if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX; else
	  if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER; else
	  throw new
	  RuntimeException("Browser Name Key value in Configuration.properties is not matched : "
	  + browserName); }
	  
	  
	  
	  public Boolean getBrowserWindowSize() { String windowSize =
	  properties.getProperty("windowMaximize"); if(windowSize != null) return
	  Boolean.valueOf(windowSize); return true; }
	  
	  public String getReportConfigPath(){
			String reportConfigPath = properties.getProperty("reportConfigPath");
			if(reportConfigPath!= null) return reportConfigPath;
			else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
		}
	  
		
		  public String getLeadFirstName() { String firstName =
		  properties.getProperty("LeadFirstName"); if(firstName != null) return firstName;
		  else throw new
		  RuntimeException("firstName not specified in the Configuration.properties file."
		  ); }
		  
		  public String getLeadLastName() { String lastName =
				  properties.getProperty("LeadLastName"); if(lastName != null) return lastName;
				  else throw new
				  RuntimeException("lastName not specified in the Configuration.properties file."
				  ); }
		  
		  public String getstatus() { String status = properties.getProperty("Status"); if(status
		  != null) return status; else throw new
		  RuntimeException("status not specified in the Configuration.properties file.");
		  }
		 
	 
	
	
	

}
