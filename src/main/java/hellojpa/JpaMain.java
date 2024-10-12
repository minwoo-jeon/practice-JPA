package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx =em.getTransaction();
        tx.begin();

        Member member = new Member();
        member.setId(2L);
        member.setName("HelloB");
        em.persist(member);
        //code

        tx.commit();


        em.close();
        emf.close();
    }
}
