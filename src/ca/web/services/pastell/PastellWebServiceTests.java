package ca.web.services.pastell;

public class PastellWebServiceTests {
    public static void main(String[] args) {
        try {
            PastellWebService pws = new PastellWebService("https://pastell-tst.intranet.cg59.fr", "admin", "admin", "C:\\personnel\\developpement\\certificats\\publickey.store", "cg59500");
            System.out.println(pws.getVersion());
            System.out.println("----------------------------------------------");
            System.out.println(pws.listEntities());
            System.out.println("----------------------------------------------");
            System.out.println(pws.getEntityDetail(25));
            System.out.println("----------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
