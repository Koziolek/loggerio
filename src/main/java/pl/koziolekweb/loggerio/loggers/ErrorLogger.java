package pl.koziolekweb.loggerio.loggers;

import java.util.function.Consumer;

public final class ErrorLogger extends AbstractLogger {
	public ErrorLogger(Consumer<String> target) {
		super(target);
	}
}
