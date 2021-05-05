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
			System.out.println("Kullanýcý eklendi : " + user.getFirstName() + " " + user.getLastName());
		} else {
			throw new Exception("Geçerli bir kiþi deðil.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
