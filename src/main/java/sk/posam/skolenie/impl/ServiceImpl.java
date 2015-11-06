package sk.posam.skolenie.impl;

import org.springframework.stereotype.Service;
import sk.posam.skolenie.api.IService;

import javax.jws.WebService;

/**
 * @author rucka
 */
@Service
@WebService(name = "ServiceApi", portName = "ServiceApiSOAP", targetNamespace = "http://posam.sk/skolenie/service-api", endpointInterface = "sk.posam.skolenie.api.IService", serviceName = "ServiceApi")
public class ServiceImpl implements IService {
    public String zlozityVypis() {
        return "hello world!";
    }
}
