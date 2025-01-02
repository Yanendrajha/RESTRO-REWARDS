package rewards.internal.restaurant;

import org.springframework.data.repository.Repository;

/**
 * Loads restaurant aggregates. Called by the reward network to find and reconstitute Restaurant entities from an
 * external form such as a set of RDMS rows.
 *
 * Objects returned by this repository are guaranteed to be fully-initialized and ready to use.
 */
// TODO-06: Alter this interface to extend a proper Spring Data interface.
// - The method name also needs refactoring (renaming) to use Spring Data finder
//   naming conventions so Spring Data will implement it automatically for you.
public interface RestaurantRepository extends Repository<Restaurant, Long> {

	/**
	 * Load a Restaurant entity by its merchant number.
	 * @param merchantNumber the merchant number
	 * @return the restaurant
	 */
	public Restaurant findByNumber(String merchantNumber);

}
