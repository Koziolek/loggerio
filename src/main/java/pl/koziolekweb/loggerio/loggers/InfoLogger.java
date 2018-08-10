package pl.koziolekweb.loggerio.loggers;

import java.util.function.Consumer;

public final class InfoLogger extends AbstractLogger{
	public InfoLogger(Consumer<String> target) {
		super(target);
	}
}
