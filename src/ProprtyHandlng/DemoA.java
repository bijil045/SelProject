package ProprtyHandlng;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class DemoA {
@Test
public static void testA() throws Exception{
	Properties p = new Properties();
	p.load(new FileInputStream("./input/data.properties"));
	String v = p.getProperty("city");
			System.out.println(v);
}
}
