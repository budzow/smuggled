package sonar.source.support;

import java.io.IOException;
import java.util.Objects;

public class TestUtils {
	
	public static String loadResource(String fileName) {
		try {
			return new String(Objects.requireNonNull(TestUtils.class.getClassLoader().getResourceAsStream(fileName)).readAllBytes());
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
