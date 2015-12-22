package sk.posam.skolenie.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author rucka
 */
@Configuration
@ComponentScan(value = {"sk.posam.skolenie"})
@ImportResource("classpath:ctx-wsclient-test.xml")
public class WsClientConfig {
}
