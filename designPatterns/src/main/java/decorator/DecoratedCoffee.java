package decorator;

/**
 * Abstract class representing a decorated coffee. It serves as a base class
 * for all coffee decorators, adhering to the {@link Coffee} interface.
 * <p>
 * This class wraps an existing {@link Coffee} object and delegates calls to
 * it, allowing extensions to modify or enhance the behavior of the methods
 * {@code getCost()} and {@code getDescription()}.
 * Decorators extend this class to add additional functionality or properties
 * to the wrapped coffee object.
 * </p>
 */
public abstract class DecoratedCoffee implements Coffee {

    /**
     * The wrapped Coffee instance that this decorator modifies or enhances.
     */
    protected final Coffee decoratedCoffee;

    /**
     * Constructor that initializes this decorator with the given coffee object.
     *
     * @param decoratedCoffee the {@link Coffee} object to be wrapped
     */
    public DecoratedCoffee(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    /**
     * Returns the cost of the decorated coffee. This method delegates the call
     * to the wrapped {@link Coffee} instance.
     *
     * @return the cost of the coffee
     */
    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }
    /**
     * Returns the description of the decorated coffee. This method delegates
     * the call to the wrapped {@link Coffee} instance.
     *
     * @return the description of the coffee
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}