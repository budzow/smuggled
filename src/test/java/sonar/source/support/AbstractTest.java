package sonar.source.support;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.test.context.ActiveProfiles;

public class AbstractTest {

	private final ObjectMapper objectMapper = new ObjectMapper();
	
	private final TestUtils testUtils = new TestUtils();
	
	protected String getSampleRealtimeEvent() {
		String eventBody = testUtils.loadResource("samplePayloadForIndexingScheam.json");
		try {
			return objectMapper.readValue(eventBody, String.class);
			
		} catch (JsonProcessingException e) {

		}
		return eventBody;
		
	}
	
}
