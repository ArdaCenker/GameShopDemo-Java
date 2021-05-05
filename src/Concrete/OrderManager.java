package Concrete;

import java.time.LocalDate;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.User;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		
		System.out.println(order.getId() + " numarasına sahip sipariş eklendi.");
		
	}

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı, " + game.getName() + " oyununu, "
			+ (campaign != null ? campaign.getName() + " kampanyasındaki %" + campaign.getDiscount()
			+ " indirim ile " +(game.getPrice() - (game.getPrice() * campaign.getDiscount()) / 100) : game.getPrice()) + " fiyatı ile satın aldı.");

		Order order = campaign != null ? new Order(1, user.getId(), game.getId(), campaign.getId(), LocalDate.now()) : new Order(1, user.getId(), game.getId(), LocalDate.now());
		
		add(order);
		
	}

}
