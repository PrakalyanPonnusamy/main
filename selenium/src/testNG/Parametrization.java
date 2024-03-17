package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
@Test
@Parameters("Name")    // this wll call the TestNG XMl to get the name from there
public void Myname(String Name) {   // we are passing a name through xml and that needs to be stored someware here i.e. String Name
	System.out.println("This is " + Name);
}
}
//Note :
//<parameter name="Name" value="Prahalya"></parameter> ----> This line of code is used to add paramaters from XML log to here 
// They fnd it through name and pass them through values