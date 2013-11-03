
package name.abhijitsarkar.learning.webservices.jaxws.security.ut.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorUT", targetNamespace = "http://abhijitsarkar.name/learning/webservices/jaxws/security/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorUT {


    /**
     * 
     * @param j
     * @param i
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://abhijitsarkar.name/learning/webservices/jaxws/security/", className = "name.abhijitsarkar.learning.webservices.jaxws.security.ut.client.generated.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://abhijitsarkar.name/learning/webservices/jaxws/security/", className = "name.abhijitsarkar.learning.webservices.jaxws.security.ut.client.generated.AddResponse")
    @Action(input = "http://abhijitsarkar.name/learning/webservices/jaxws/security/CalculatorUT/addRequest", output = "http://abhijitsarkar.name/learning/webservices/jaxws/security/CalculatorUT/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}