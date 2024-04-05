package Retry_test;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(null);
	}

}
