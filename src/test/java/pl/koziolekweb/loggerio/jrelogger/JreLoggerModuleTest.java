package pl.koziolekweb.loggerio.jrelogger;

import com.google.inject.Guice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JreLoggerModuleTest {

	@Test
	@DisplayName("Should start JRE Logger module without any exception")
	void shouldSetupModule() {
		Guice.createInjector(new JreLoggerModule("test-logger"));
	}
}