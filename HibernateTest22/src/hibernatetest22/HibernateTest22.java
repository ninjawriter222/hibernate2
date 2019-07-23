package hibernatetest22;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Poozer
 */
public class HibernateTest22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();

            System.out.println("Populating the database !");
            Customer customer = new Customer();
            customer.setCustomerName("Poe");
            customer.setCustomerAddress("103 S Olive");
            customer.setCustomerEmail("devin.a.poe@gmail.com");

            session.save(customer);
            session.getTransaction().commit();

            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
//            session.flush();
//            session.close();
        }
    }

}
