package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.User;

public interface OrderService {
	
	void add(Order order);
	void buy(User user, Game game, Campaign campaign);
}
