package Commonfunc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configreader {
	public static commonfunction commonfunc = new commonfunction();
	private static Properties properties = new Properties();
	
	static {
        try {
            // Load the properties file during class loading
            FileInputStream inputStream = new FileInputStream(commonfunc.workingdir +"\\Resources\\input.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file.");
        }
    }
	
	public String getproperty(String url) {
		
		return properties.getProperty(url);
		
	}
	

}
