package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // Получчение сессии

            session.beginTransaction(); // Открытие транзакции

            /*Employee employee = session.get(Employee.class,2);

            session.remove(employee); //удаление 2-го id в таблице (после завершения транзакции)
            session.delete(employee); //удаление 2-го id в таблице (немедленно)
            */

            session.createQuery("delete Employee where name = 'Max'").executeUpdate();


            session.getTransaction().commit();// Закрытие транзакции





            System.out.println("Done!");
        }
    }
}
