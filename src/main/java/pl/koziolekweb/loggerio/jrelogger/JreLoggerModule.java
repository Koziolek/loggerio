package pl.koziolekweb.loggerio.jrelogger;

import com.google.inject.AbstractModule;
import pl.koziolekweb.loggerio.loggers.DebugLogger;
import pl.koziolekweb.loggerio.loggers.ErrorLogger;
import pl.koziolekweb.loggerio.loggers.InfoLogger;
import pl.koziolekweb.loggerio.loggers.WarnLogger;

import java.util.logging.Logger;

public class JreLoggerModule extends AbstractModule {

	private final Logger logger;

	public JreLoggerModule(String name) {
		logger = Logger.getLogger(name);
	}

	@Override
	protected void configure() {
		bind(DebugLogger.class).toInstance(new DebugLogger(logger::fine));
		bind(InfoLogger.class).toInstance(new InfoLogger(logger::info));
		bind(WarnLogger.class).toInstance(new WarnLogger(logger::warning));
		bind(ErrorLogger.class).toInstance(new ErrorLogger(logger::severe));
	}
}
