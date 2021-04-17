package dao;

import entity.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertProduct(ProductEntity product) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }
    public List<ProductEntity> getAll() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<ProductEntity> list = em.createQuery("select p from ProductEntity p", ProductEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }


}
