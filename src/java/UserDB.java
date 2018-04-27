
import java.lang.reflect.Array;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class UserDB {
    
    public static Array insertDatabase (User user) {
        EntityManagerFactory enMaFa = Persistence.createEntityManagerFactory("TOBAPU");
        EntityManager entitymanager = enMaFa.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(user);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        enMaFa.close();
        return null;
        
    }
} 
    



