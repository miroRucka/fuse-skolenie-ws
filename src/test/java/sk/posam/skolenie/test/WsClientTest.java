package sk.posam.skolenie.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import sk.posam.skolenie.api.IService;
import sk.posam.skolenie.test.config.WsClientConfig;

/**
 * @author rucka
 */
@ContextConfiguration(classes = {WsClientConfig.class})
public class WsClientTest extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier(value = "ws-client-test")
    private IService service;

    @Test
    public void wsClient() {
        Assert.assertNotNull(service);
        String result = service.zlozityVypis();
        System.out.println(">>> result: " + result);
    }
}
