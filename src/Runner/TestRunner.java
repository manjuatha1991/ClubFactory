package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG rn=new TestNG();
        List<String> l1 = new ArrayList<String>();
        l1.add("/ClubFactory/test-output/testng-failed.xml");
        rn.setTestSuites(l1);
        rn.run();
	}
}
