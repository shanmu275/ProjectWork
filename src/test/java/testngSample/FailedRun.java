package testngSample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedRun implements IAnnotationTransformer {

	public void transform(ITestAnnotation an, Class Cl, Constructor con, Method md) {
		
		IRetryAnalyzer r = an.getRetryAnalyzer();
		
		if (r==null) {
			an.setRetryAnalyzer(Failed.class);
		}
	}

}
