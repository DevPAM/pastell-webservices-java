package ca.web.services.pastell.v3.sources.get;

import ca.utils.web.exceptions.headers.KeyHeaderNullException;
import ca.utils.web.exceptions.headers.ValueHeaderNullException;
import ca.utils.web.webservices.WebService;
import ca.utils.web.webservices.services.get.GETService;
import ca.web.services.pastell.PastellWebService;

/** Pastell's service that use the GET method. */
public class GETPastellService  extends GETService  {
    /** Initialize a new instance of {@link GETService} class.
     * @param service The service's web services.
     * @param address The web request's address. */
    public GETPastellService(WebService service, String address) throws KeyHeaderNullException, ValueHeaderNullException {
        super(service, address);
        this.addHeader("Authorization", String.format("Basic %s", ((PastellWebService)this.service).getBase64Authentication()));
    }
}
