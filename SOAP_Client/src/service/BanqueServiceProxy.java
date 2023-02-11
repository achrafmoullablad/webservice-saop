package service;

public class BanqueServiceProxy implements service.BanqueService {
  private String _endpoint = null;
  private service.BanqueService banqueService = null;
  
  public BanqueServiceProxy() {
    _initBanqueServiceProxy();
  }
  
  public BanqueServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBanqueServiceProxy();
  }
  
  private void _initBanqueServiceProxy() {
    try {
      banqueService = (new service.BanqueWSLocator()).getBanqueServicePort();
      if (banqueService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)banqueService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)banqueService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (banqueService != null)
      ((javax.xml.rpc.Stub)banqueService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BanqueService getBanqueService() {
    if (banqueService == null)
      _initBanqueServiceProxy();
    return banqueService;
  }
  
  public double conversionEuro(double montant) throws java.rmi.RemoteException{
    if (banqueService == null)
      _initBanqueServiceProxy();
    return banqueService.conversionEuro(montant);
  }
  
  public service.Compte getCompte(int code) throws java.rmi.RemoteException{
    if (banqueService == null)
      _initBanqueServiceProxy();
    return banqueService.getCompte(code);
  }
  
  public service.Compte[] listComptes() throws java.rmi.RemoteException{
    if (banqueService == null)
      _initBanqueServiceProxy();
    return banqueService.listComptes();
  }
  
  
}