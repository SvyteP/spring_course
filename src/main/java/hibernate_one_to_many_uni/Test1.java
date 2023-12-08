package hibernate_one_to_many_uni;




import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

       try (SessionFactory factory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Employee.class)
                                            .addAnnotatedClass(Department.class)
                                            .buildSessionFactory();
                                             Session session = factory.getCurrentSession()  // обертка вокруг БД ,основа для работы с БД
        ){
      /*  Department department = new Department("HR",300,1200);
           Employee employee1 = new Employee("Andry","Drovb",1200);
           Employee employee2 = new Employee("Oleg","Floq",1000);
           department.addEmpToDep(employee1);
           department.addEmpToDep(employee2);
           session.beginTransaction(); // Открытие транзакции

            session.persist(department);

            session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");*/

/*
        session.beginTransaction(); // Открытие транзакции

           Department department = session.get(Department.class,1);
           System.out.println(department.getEmps());

          session.getTransaction().commit();// Закрытие транзакции

           System.out.println("Done!");
*/


           session.beginTransaction(); // Открытие транзакции
           Department department = session.get(Department.class,2);
           session.remove(department);

           session.getTransaction().commit();// Закрытие транзакции

           System.out.println("Done!");
        }




    }
}
