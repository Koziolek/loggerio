package pl.koziolekweb.loggerio.loggers;

import java.util.function.Consumer;

public abstract class AbstractLogger implements Consumer<String> {

	private final Consumer<String> target;

	protected AbstractLogger(Consumer<String> target) {
		this.target = target;
	}

	public void log(String message){
		accept(message);
	}

	@Override
	public Consumer<String> andThen(Consumer<? super String> consumer) {
		return target.andThen(consumer);
	}

	@Override
	public void accept(String s) {
		target.accept(s);
	}
}
