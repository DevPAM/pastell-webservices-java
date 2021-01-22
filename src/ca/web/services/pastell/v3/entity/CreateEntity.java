package ca.web.services.pastell.v3.entity;

import ca.utils.web.exceptions.headers.KeyHeaderNullException;
import ca.utils.web.exceptions.headers.ValueHeaderNullException;
import ca.web.services.pastell.PastellWebService;
import ca.web.services.pastell.v3.sources.post.POSTFormDataPastellService;

/** Service to create Entity. */
public class CreateEntity extends POSTFormDataPastellService {
    /** The entity's denomination. */
    private String denomination;
    /** The entity's type. */
    private String  type;
    /** The entity's siren */
    private String siren;
    /** Initialize a new instance of {@link CreateEntity} class.
     * @param service The service's web service. */
    public CreateEntity(PastellWebService service, String denomination, String type, String siren) throws KeyHeaderNullException, ValueHeaderNullException {
        super(service, "api/v2/entite");
        // Add the header.
        this.addHeader("Accept", "application/json");
        // Set the class parameters.
        this.addArgument("denomination", denomination);
        this.addArgument("siren", siren);
        this.addArgument("type", type);
    }
}
