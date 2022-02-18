package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import net.bytebuddy.build.Plugin;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl= (ClientController) ctx.getBean("ctr");


         /*
            Client client = new Client("SALMA");
            List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1"),new Facture(2000.0,"facture2"));
            client.setFactures(factures);
            ctrl.save(client);
         */

         /*
            Client client = new Client("SALMA");
            List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
            client.setPromotions(promotions);
            ctrl.save(client);
         */

          /*
            Client client = new Client("SALMA");
            CarteFidelio carteFidelio = new CarteFidelio("A29930489");
            carteFidelio.setClient(client);
            client.setCarteFidelio(carteFidelio);
            ctrl.save(client);
         */

        // (ce cas pratique sera noté sur 5 points dans la note des TPs)

        /*
            Facture facture = new Facture(1500.0,"facture1") ;
            List<Produit> produits = Arrays.asList(new Produit("Produi1",20.00),new Produit("Produit2",30.00));
            facture.setProduits(produits);
            ctrl.create(facture);
        */

        /*
            Client client = new Client("SALMA");
            Adresse adresse = new Adresse("CALIFORNIE","CASABLANCA","Morocco");
            adresse.setClient(client);
            client.setAdresse(adresse);
            ctrl.save(client);
        */


    }

}