package hibernate_test;

import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory()) {

                Session session = factory.getCurrentSession(); // обертка вокруг БД ,основа для работы с БД
                Employee emp = new Employee("Oleg", "Sidr",
                        "HR", 900);

                session.beginTransaction(); // Открытие транзакции
                session.persist(emp); // сохранение новго объекта
                // session.getTransaction().commit();// Закрытие транзакции



                //session = factory.getCurrentSession(); // получаем новую сессию
                int myId = emp.getId(); // ID добавленного пользователя

                //session.beginTransaction(); // Открытие транзакции
                Employee employee = session.get(Employee.class,myId); // поиск по ID
                System.out.println(employee);
                session.getTransaction().commit(); // Закрытие транзакции

                System.out.println("Done!");
            }
    }
}
