package pl.koziolekweb.loggerio.loggers;

import java.util.function.Consumer;

public final class WarnLogger extends AbstractLogger{
	public WarnLogger(Consumer<String> target) {
		super(target);
	}
}
