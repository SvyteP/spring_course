package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // Получчение сессии

            session.beginTransaction(); // Открытие транзакции

            //  List <Employee> emps = session.createQuery("from  Employee").getResultList();
            List <Employee> emps = session.createQuery("from  Employee  where  name  = 'Oleg' and salary <500").getResultList();
            for (Employee e:
                 emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();// Закрытие транзакции





            System.out.println("Done!");
        }
    }
}
