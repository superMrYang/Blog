
package com.demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateK2ProcStatusResponse_QNAME = new QName("http://service.k2callback.webservice.workorder.hypersmart.com/", "updateK2ProcStatusResponse");
    private final static QName _Exception_QNAME = new QName("http://service.k2callback.webservice.workorder.hypersmart.com/", "Exception");
    private final static QName _UpdateK2ProcStatus_QNAME = new QName("http://service.k2callback.webservice.workorder.hypersmart.com/", "updateK2ProcStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UpdateK2ProcStatusResponse }
     * 
     */
    public UpdateK2ProcStatusResponse createUpdateK2ProcStatusResponse() {
        return new UpdateK2ProcStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateK2ProcStatus }
     * 
     */
    public UpdateK2ProcStatus createUpdateK2ProcStatus() {
        return new UpdateK2ProcStatus();
    }

    /**
     * Create an instance of {@link CommonResult }
     * 
     */
    public CommonResult createCommonResult() {
        return new CommonResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateK2ProcStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.k2callback.webservice.workorder.hypersmart.com/", name = "updateK2ProcStatusResponse")
    public JAXBElement<UpdateK2ProcStatusResponse> createUpdateK2ProcStatusResponse(UpdateK2ProcStatusResponse value) {
        return new JAXBElement<UpdateK2ProcStatusResponse>(_UpdateK2ProcStatusResponse_QNAME, UpdateK2ProcStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.k2callback.webservice.workorder.hypersmart.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateK2ProcStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.k2callback.webservice.workorder.hypersmart.com/", name = "updateK2ProcStatus")
    public JAXBElement<UpdateK2ProcStatus> createUpdateK2ProcStatus(UpdateK2ProcStatus value) {
        return new JAXBElement<UpdateK2ProcStatus>(_UpdateK2ProcStatus_QNAME, UpdateK2ProcStatus.class, null, value);
    }

}
