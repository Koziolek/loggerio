package pl.koziolekweb.loggerio.stdio;

import com.google.inject.AbstractModule;
import pl.koziolekweb.loggerio.loggers.DebugLogger;
import pl.koziolekweb.loggerio.loggers.ErrorLogger;
import pl.koziolekweb.loggerio.loggers.InfoLogger;
import pl.koziolekweb.loggerio.loggers.WarnLogger;

public class StdioLoggerModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(DebugLogger.class).toInstance(new DebugLogger(System.out::println));
		bind(InfoLogger.class).toInstance(new InfoLogger(System.out::println));
		bind(WarnLogger.class).toInstance(new WarnLogger(System.out::println));
		bind(ErrorLogger.class).toInstance(new ErrorLogger(System.err::println));
	}
}
