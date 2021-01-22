package ca.web.services.pastell.v3.sources.post;

import ca.utils.web.exceptions.headers.KeyHeaderNullException;
import ca.utils.web.exceptions.headers.ValueHeaderNullException;
import ca.utils.web.webservices.WebService;
import ca.utils.web.webservices.services.post.POSTMultipartFormDataService;
import ca.web.services.pastell.PastellWebService;

/** Class for services using the POST method with a content-type multipart form-data. */
public class POSTFormDataPastellService extends POSTMultipartFormDataService {
    /** Initialize a new instance of {@link POSTMultipartFormDataService} class.
     * @param service The web service to which the service is attached.
     * @param address */
    public POSTFormDataPastellService(WebService service, String address) throws KeyHeaderNullException, ValueHeaderNullException {
        super(service, address);
        this.addHeader("Authorization", String.format("Basic %s", ((PastellWebService)this.service).getBase64Authentication()));
    }
}
