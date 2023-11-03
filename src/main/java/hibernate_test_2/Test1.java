package hibernate_test_2;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        // ADD

/*
      try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // обертка вокруг БД ,основа для работы с БД
            Employee employee = new Employee("Alex","Alexov","IT",700);
            Detail detail = new Detail("Taganrog","12890371287","dwowd@mail.com");

            employee.setDetail(detail);

            session.beginTransaction(); // Открытие транзакции

            session.persist(employee);

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // обертка вокруг БД ,основа для работы с БД
            Employee employee = new Employee("Oleg","Merzov","Sales",300);
            Detail detail = new Detail("Moscov","212314","kkkdd@mail.com");

            employee.setDetail(detail);

            session.beginTransaction(); // Открытие транзакции

            session.persist(employee);

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }
*/
        // GET

 /*       try (SessionFactory factory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Employee.class)
                                            .addAnnotatedClass(Detail.class)
                                            .buildSessionFactory();
                                             Session session = factory.getCurrentSession()  // обертка вокруг БД ,основа для работы с БД
        ){
            session.beginTransaction(); // Открытие транзакции

            Employee employee = session.get(Employee.class,10);
            System.out.println(employee.getDetail());

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }*/

        // DELETE
       try (SessionFactory factory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Employee.class)
                                            .addAnnotatedClass(Detail.class)
                                            .buildSessionFactory();
                                             Session session = factory.getCurrentSession()  // обертка вокруг БД ,основа для работы с БД
        ){
            session.beginTransaction(); // Открытие транзакции

            Employee employee = session.get(Employee.class,2);//получаем объект из БД
            session.remove(employee); // Помечаем его для удаления по окончанию транзакции

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }




    }
}
