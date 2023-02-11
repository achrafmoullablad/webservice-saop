/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BanqueService extends java.rmi.Remote {
    public double conversionEuro(double montant) throws java.rmi.RemoteException;
    public service.Compte getCompte(int code) throws java.rmi.RemoteException;
    public service.Compte[] listComptes() throws java.rmi.RemoteException;
}
