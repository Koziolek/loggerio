package pl.koziolekweb.loggerio.loggers;

import java.util.function.Consumer;

public final class DebugLogger extends AbstractLogger {

	public DebugLogger(Consumer<String> target) {
		super(target);
	}
}
