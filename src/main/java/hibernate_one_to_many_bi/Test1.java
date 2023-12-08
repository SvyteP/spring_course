package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
           /*Department dep = new Department("IT",300,1200);
           Employee employee1 = new Employee("max", "abramov", 2000);
           Employee employee2 = new Employee("MAS", "Sss", 1000);
           dep.addEmployeeToDepartment(employee1);
           dep.addEmployeeToDepartment(employee2);
           session.beginTransaction(); // Открытие транзакции
           session.save(dep);
           session.getTransaction().commit();// Закрытие транзакции*/
/*
           session.beginTransaction(); // Открытие транзакции
            Employee employee = session.get(Employee.class,1);
           System.out.println(employee);
           System.out.println(employee.getDepartment());
           session.getTransaction().commit();// Закрытие транзакции

            System.out.println("Done!");*/



             session.beginTransaction(); // Открытие транзакции
           Employee employee = session.get(Employee.class,7);
           session.remove(employee);
           session.getTransaction().commit();// Закрытие транзакции

           System.out.println("Done!");


       }




    }
}
