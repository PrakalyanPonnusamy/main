package log4j_concepts;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Xml_configurator {
static Logger logger = Logger.getLogger(Xml_configurator.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is debug log");
		logger.info("This is info log");
		logger.warn("This is warn log");
		logger.error("This is error log");
		logger.fatal("This is fatal log");

	}

}
