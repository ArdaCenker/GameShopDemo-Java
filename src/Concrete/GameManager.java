package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi. Ad� : " + game.getName() + " Fiyat� : " + game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Kampanya g�ncellendi. Ad� : " + game.getName());		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Kampanya silindi. Ad� : " + game.getName());		
	}

}
