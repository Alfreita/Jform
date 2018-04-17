package jpa;

        import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;
        import java.util.Calendar;

public class GeraTabelas {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();
        manager.close();

        factory.close();
    }

}
