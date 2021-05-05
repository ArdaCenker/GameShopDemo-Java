package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		
		KPSPublicSoap client= new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(user.getNationalityId(), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
		
	}
	
	
}
