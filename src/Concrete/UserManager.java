package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws Exception {
		if (userCheckService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� eklendi : " + user.getFirstName() + " " + user.getLastName());
		} else {
			throw new Exception("Ge�erli bir ki�i de�il.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
