package jetty;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.JettyWebXmlConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebXmlConfiguration;

public class StartWs {

    public static final String WS_SERVER_WEB_PATH = "src/main/webapp";

    public static void main(String[] args) throws Exception {
        Server server = new Server(8083);
        WebAppContext bb = new WebAppContext();
        bb.setServer(server);
        bb.setContextPath("/");
        ResourceCollection resources = new ResourceCollection(new String[]{
                WS_SERVER_WEB_PATH,
        });
        bb.setBaseResource(resources);
        bb.setConfigurations(new Configuration[]{new JettyWebXmlConfiguration(), new WebXmlConfiguration()});
        bb.getInitParams().put("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
        bb.setDescriptor(WS_SERVER_WEB_PATH + "/WEB-INF/web-test.xml");
        server.setHandler(bb);
        try {
            server.start();
            while (System.in.available() == 0) {
                Thread.sleep(5000);
            }
            server.stop();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(100);
        }
    }

}
