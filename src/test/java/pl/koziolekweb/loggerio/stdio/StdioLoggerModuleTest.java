package pl.koziolekweb.loggerio.stdio;

import com.google.inject.Guice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StdioLoggerModuleTest {

	@Test
	@DisplayName("Should start stdio logger module without any exception")
	void shouldSetupModule() {
		Guice.createInjector(new StdioLoggerModule());
	}

}