package web;
import service.BanqueServiceProxy;
import service.Compte;

public class ClientWS {

	public static void main(String[] args) {
		try {
			BanqueServiceProxy proxy = new BanqueServiceProxy();
			System.out.println(proxy.conversionEuro(2500));
			Compte compte = proxy.getCompte(3);
			System.out.println("code : "+compte.getCode());
			System.out.println("solde : "+compte.getSolde());
			Compte[] comptes = proxy.listComptes();
			for (Compte cp : comptes) {
				System.out.println("-------------------------");
				System.out.println("code : "+cp.getCode());
				System.out.println("solde : "+cp.getSolde());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
