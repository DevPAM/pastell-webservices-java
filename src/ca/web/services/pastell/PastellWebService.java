package ca.web.services.pastell;

import ca.utils.web.exceptions.headers.KeyHeaderNullException;
import ca.utils.web.exceptions.headers.ValueHeaderNullException;
import ca.utils.web.exceptions.send.ConnectionNullException;
import ca.utils.web.webservices.WebService;
import ca.utils.web.webservices.WebServiceAuthentication;
import ca.web.services.pastell.v3.entity.CreateEntity;
import ca.web.services.pastell.v3.entity.DetailEntity;
import ca.web.services.pastell.v3.entity.GetVersion;
import ca.web.services.pastell.v3.entity.ListEntities;

import java.io.IOException;

/** Web service for Pastell. */
public class PastellWebService extends WebServiceAuthentication {
    /** Initialize a new instance of {@link WebService} class.
     * @param address The web service's adress.
     * @param login The API's login.
     * @param password the API's password.
     * @throws Exception If the web service address is null or empty. */
    public PastellWebService(String address, String login, String password) throws Exception {
        super(address, login, password);
    }
    /** Initialize a new instance of {@link WebService} class.
     * @param address The web service's address.
     * @param login The API's login.
     * @param password the API's password.
     * @param keystore The path to the keystore.
     * @param keystore_password The keystore password.
     * @throws Exception If the web service address is null or empty. */
    public PastellWebService(String address, String login, String password, String keystore, String keystore_password) throws Exception {
        super(address, login, password);
        // Set the keystore ans key keystore password.
        // keystore : "C:\\personnel\\developpement\\certificats\\publickey.store"
        // password : "cg59500
        if(System.getProperty("javax.net.ssl.trustStore") == null) System.setProperty("javax.net.ssl.trustStore", keystore);
        if(System.getProperty("javax.net.ssl.trustStorePassword") == null) System.setProperty("javax.net.ssl.trustStorePassword", keystore_password);
    }
    /** Get Pastell's API version.
     * @throws KeyHeaderNullException Fired if a header key is not entered.
     * @throws ValueHeaderNullException Fired if a value key is not entered.
     * @throws IOException Launched in case of input / output.
     * @throws ConnectionNullException Fired if the connection is null. */
    public String getVersion() throws KeyHeaderNullException, ValueHeaderNullException, IOException, ConnectionNullException {
        GetVersion service = new GetVersion(this);
        return service.call();
    }
    /** Get Pastell's entities.
     * @throws KeyHeaderNullException Fired if a header key is not entered.
     * @throws ValueHeaderNullException Fired if a value key is not entered.
     * @throws IOException Launched in case of input / output.
     * @throws ConnectionNullException Fired if the connection is null. */
    public String listEntities() throws KeyHeaderNullException, ValueHeaderNullException, IOException, ConnectionNullException {
        ListEntities service = new ListEntities(this);
        return service.call();
    }
    /** Get Pastell entity's detail.
     * @param entity_id An entity id.
     * @throws KeyHeaderNullException Fired if a header key is not entered.
     * @throws ValueHeaderNullException Fired if a value key is not entered.
     * @throws IOException Launched in case of input / output.
     * @throws ConnectionNullException Fired if the connection is null. */
    public String getEntityDetail(int entity_id) throws KeyHeaderNullException, ValueHeaderNullException, IOException, ConnectionNullException {
        DetailEntity service = new DetailEntity(this, entity_id);
        return service.call();
    }
    /** Create a new entity to the service.
     * @throws KeyHeaderNullException Fired if a header key is not entered.
     * @throws ValueHeaderNullException Fired if a value key is not entered.
     * @throws IOException Launched in case of input / output.
     * @throws ConnectionNullException Fired if the connection is null. */
    public String createEntity(String denomination, String type, String siren) throws KeyHeaderNullException, ValueHeaderNullException, IOException, ConnectionNullException {
        CreateEntity service = new CreateEntity(this, denomination, type, siren);
        return service.call();
    }
}
