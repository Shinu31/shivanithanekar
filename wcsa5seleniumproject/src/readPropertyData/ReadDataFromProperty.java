package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	public static void main(String[] args) throws IOException {
		//Read the data from config.properties file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create the obj of properties class
		Properties prop = new Properties();
        //make a file ready to read
		prop.load(fis);
		//read the particular property from file
       String data = prop.getProperty("Url");
       
       System.out.println(data);
	
	}

}
