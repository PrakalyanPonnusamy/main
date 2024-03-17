package log4j_concepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Using_Basic_Configurator {
	static Logger logger = Logger.getLogger(Using_Basic_Configurator.class);
	// Factory design pattern
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("This is a Info Log");
		logger.debug("This is debug message");
		logger.error("This is the error message");
	}
}
