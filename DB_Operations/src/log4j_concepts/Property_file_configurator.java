package log4j_concepts;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_file_configurator {
static Logger logger = Logger.getLogger(Property_file_configurator.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("jana.properties");
		logger.debug("This is info log");
		logger.info("This is info log");
		logger.warn("This is info log");
		logger.error("This is info log");
		logger.fatal("This is info log");


	}

}
