/**
 * BanqueWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BanqueWS extends javax.xml.rpc.Service {
    public java.lang.String getBanqueServicePortAddress();

    public service.BanqueService getBanqueServicePort() throws javax.xml.rpc.ServiceException;

    public service.BanqueService getBanqueServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
