package ca.web.services.pastell.v3;

import ca.utils.web.exceptions.headers.KeyHeaderNullException;
import ca.utils.web.exceptions.headers.ValueHeaderNullException;
import ca.web.services.pastell.PastellWebService;
import ca.web.services.pastell.v3.sources.GETPastellService;

/** Service that get the list od the entities. */
public class ListEntities extends GETPastellService {
    /** Initialize a new instance of {@link GETPastellService} class.
     * @param service The service web service. */
    public ListEntities(PastellWebService service) throws KeyHeaderNullException, ValueHeaderNullException {
        super(service, "api/v2/entite");
        // Set the header's values.
        this.addHeader("Accept", "application/json");
    }
}
