package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User User) throws RemoteException {
		return true;
	}

}
