package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // Получчение сессии

            session.beginTransaction(); // Открытие транзакции

           /* Employee employee = session.get(Employee.class,1); // Получаем необходимый объект
            employee.setSalary(1500); // изменяем поле объекта*/
            session.createQuery("update  Employee set salary =500 where  surname = 'Maheev' or department = 'Manager'").executeUpdate();

            session.getTransaction().commit();// Закрытие транзакции





            System.out.println("Done!");
        }
    }
}
