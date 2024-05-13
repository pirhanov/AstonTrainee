package hordsman.hw9;

public class Singleton {

	private static volatile Singleton instance;
	private final String name;

	private Singleton(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static final class Builder {
		private String name;

		public Builder() {
			this.name = "Default Name";
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Singleton build() {
			if (instance == null) {
				synchronized (Singleton.class) {
					if (instance == null) {
						instance = new Singleton(this.name);
					}
				}
			}
			return instance;
		}
	}
}
