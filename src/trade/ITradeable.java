package trade;

@FunctionalInterface
public interface ITradeable {
	void setPosition(float price, int position);
}
