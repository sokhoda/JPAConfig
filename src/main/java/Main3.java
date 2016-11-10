import domain.Human;
import testdatasource.TestDataSource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main3 {
    public static void main(String[] args) {

        Human human = new Human("Alex");
        System.out.println("FitnessCalculator");
        TestDataSource.init(human);
//        System.out.println(human);
        if (args.length > 0) {
            System.out.println("age = " + args[0] + ", gender = " + args[1]);
        }

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory
//                ("jpa");
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//
//        em.merge(human);
//
//        et.commit();
//
//        em.close();
//        emf.close();
    }
}
