package hibernate_test;


import hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory()) {

            Session session = factory.getCurrentSession(); // обертка вокруг БД ,основа для работы с БД
            Employee emp = new Employee("Oleg", "Maheev",
                    "HR", 200);

            session.beginTransaction(); // Открытие транзакции
            session.persist(emp); // сохранение новго объекта
            session.getTransaction().commit();// Закрытие транзакции


            System.out.println(emp);


            System.out.println("Done!");
        }
/*
        Employee emp = new Employee();
        emp.setName("qq");
        emp.setSurname("qq");
        emp.setDepartment("it");
        emp.setSalary(123);
Configuration con = new Configuration().configure();
con.addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder sBilder =new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties());
        SessionFactory sf = con.buildSessionFactory(sBilder.build());
        //create
        Session session = sf.openSession();
        Transaction trCreate = session.beginTransaction();
        session.persist(emp);
        trCreate.commit();
*/





    }
}
