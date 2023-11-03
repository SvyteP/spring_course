package hibernate_test_2;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        // ADD

/*    try (SessionFactory factory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Employee.class)
                                            .addAnnotatedClass(Detail.class)
                                            .buildSessionFactory();
                                             Session session = factory.getCurrentSession()  // обертка вокруг БД ,основа для работы с БД
        ){


            Employee employee = new Employee("Nikolay","Ivanov","HR",850);
            Detail detail = new Detail("Bataisk","1231245554","Nikolay@mail.com");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction(); // Открытие транзакции

            session.persist(detail);

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }*/
        // GET
/*        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()  // обертка вокруг БД ,основа для работы с БД
        ){



            session.beginTransaction(); // Открытие транзакции
            Detail detail = session.get(Detail.class,4);
            System.out.println(detail.getEmployee());

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
            Detail detail = session.get(Detail.class,1);
            detail.getEmployee().setEmpDetail(null); // разорвали связь между таблицами
            session.remove(detail);// удалили детали о сотруднике

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");
        }

    }
}
