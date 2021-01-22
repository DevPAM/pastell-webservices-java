package ca.web.services.pastell.v3.sources.post;

import ca.utils.web.webservices.services.post.POSTService;
import ca.web.services.pastell.PastellWebService;

/** Class for pastel services using the POST method. */
public class POSTPastellService extends POSTService {
    /** Initialize a new instance of {@link POSTPastellService} class.
     * @param service The web service to which the service is attached.
     * @param address The address (shortcuts) of the service within the web service. */
    public POSTPastellService(PastellWebService service, String address) {
        super(service, address);
    }
}
