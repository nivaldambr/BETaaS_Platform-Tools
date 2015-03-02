/*
Copyright 2014-2015 Intecs Spa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/

package eu.betaas.service.instancemanager.web.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2014-04-04T18:30:30.924+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "InstanceManagerExternalIF", 
                  wsdlLocation = "http://192.168.24.128:9302/im-service?wsdl",
                  targetNamespace = "http://api.instancemanager.service.betaas.eu/") 
public class InstanceManagerExternalIF extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://api.instancemanager.service.betaas.eu/", "InstanceManagerExternalIF");
    public final static QName InstanceManagerExternalIFPort = new QName("http://api.instancemanager.service.betaas.eu/", "InstanceManagerExternalIFPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.24.128:9302/im-service?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InstanceManagerExternalIF.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.24.128:9302/im-service?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InstanceManagerExternalIF(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InstanceManagerExternalIF(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InstanceManagerExternalIF() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InstanceManagerExternalIF(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InstanceManagerExternalIF(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InstanceManagerExternalIF(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns InstanceManagerExternalIFPortType
     */
    @WebEndpoint(name = "InstanceManagerExternalIFPort")
    public InstanceManagerExternalIFPortType getInstanceManagerExternalIFPort() {
        return super.getPort(InstanceManagerExternalIFPort, InstanceManagerExternalIFPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InstanceManagerExternalIFPortType
     */
    @WebEndpoint(name = "InstanceManagerExternalIFPort")
    public InstanceManagerExternalIFPortType getInstanceManagerExternalIFPort(WebServiceFeature... features) {
        return super.getPort(InstanceManagerExternalIFPort, InstanceManagerExternalIFPortType.class, features);
    }

}