package sk.posam.skolenie.api;

import javax.jws.WebService;

/**
 * @author rucka
 */
@WebService(name = "ServiceApi", targetNamespace = "http://posam.sk/skolenie/service-api")
public interface IService {
    String zlozityVypis();
}
