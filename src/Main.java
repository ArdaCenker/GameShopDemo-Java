import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		
		User customer = new User(1, "arda@arda.com", "123456", "Arda Cenker", "Karagöz", 10600948626L ,LocalDate.of(2005, 6, 8));
		userManager.add(customer);

		GameManager gameManager = new GameManager();
		
		Game game = new Game(1, "Forza Horizon 4", 31.00);
		gameManager.add(game);

		CampaignManager campaignManager = new CampaignManager();
		
		Campaign campaign = new Campaign(1, "Hallowen",25);
		campaignManager.add(campaign);

		OrderManager orderManager = new OrderManager();
		orderManager.buy(customer, game, campaign);
	}

}
