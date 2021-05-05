package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {
	
	boolean checkIfRealPerson(User User) throws RemoteException;
}
