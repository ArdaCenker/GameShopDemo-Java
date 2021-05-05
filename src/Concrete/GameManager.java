package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi. Adý : " + game.getName() + " Fiyatý : " + game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Kampanya güncellendi. Adý : " + game.getName());		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Kampanya silindi. Adý : " + game.getName());		
	}

}
