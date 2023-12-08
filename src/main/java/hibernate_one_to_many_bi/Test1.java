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
         /*  Department dep = new Department("Sales",1500,500);
           Employee employee1 = new Employee("Max", "abramov", 2000);
           Employee employee2 = new Employee("Alex", "Sas", 1000);
           Employee employee3 = new Employee("Anton", "Rebon", 1000);
           dep.addEmployeeToDepartment(employee1);
           dep.addEmployeeToDepartment(employee2);
           dep.addEmployeeToDepartment(employee3);
           session.beginTransaction(); // Открытие транзакции
           session.persist(dep);
           session.getTransaction().commit();// Закрытие транзакции*/


           session.beginTransaction(); // Открытие транзакции
           System.out.println("Get Depart");
           Department employee = session.get(Department.class,3);

           System.out.println("Show Depart");
           System.out.println(employee);
           employee.getEmps().get(0);


           session.getTransaction().commit();// Закрытие транзакции

           System.out.println("Show emps of the depart");
           System.out.println(employee.getEmps());

           System.out.println("Done!");



    /*       session.beginTransaction(); // Открытие транзакции
           Employee employee = session.get(Employee.class,7);
           session.remove(employee);
           session.getTransaction().commit();// Закрытие транзакции

           System.out.println("Done!");
*/

       }




    }
}
