package screenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ROBOT {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		Robot robot=new Robot(); //Using robot class to take the screen shot
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); // This is to know the screen dimension
		Rectangle rectangle = new Rectangle(dimension); //storing the dimension of screen on the rectangle class
		BufferedImage source = robot.createScreenCapture(rectangle); // getting the screenshot and storing it in the buffered image
		File destination = new File("d://1.png"); // Destination of the file to be stored
		ImageIO.write(source, "png", destination); // like filehandler.copy we are using ImageIO.write here, ( source, format, destination )
		
		
		
	}

}
