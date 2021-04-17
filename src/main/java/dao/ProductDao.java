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
//    public void updateProduct(int id) {
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        ProductEntity product = em.find(ProductEntity.class, id);
//        if (product != null) {
//            product.setName("new name");
//            product.setPrice(100);
//        }
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public void deleteProduct(int id) {
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        ProductEntity product = em.find(ProductEntity.class, id);
//        if (product != null) {
//            em.remove(product);
//        }
//        em.getTransaction().commit();
//        em.close();
//
//    }
//    public List<ProductEntity> getAllProduct(){
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        String query = "SELECT c from ProductEntity c";
//        List<ProductEntity> list =   em.createQuery(query, ProductEntity.class).getResultList();
//        em.getTransaction().commit();
//        em.close();
//        return  list ;
//    }
//    public ProductEntity findProduct(int id) {
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        ProductEntity productEntity = em.createQuery("select p from ProductEntity p where p.id = "+id, ProductEntity.class).getSingleResult();
//        return productEntity;
//    }
//    public List<ProductEntity> getAll() {
//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        List<ProductEntity> list = em.createQuery("select p from ProductEntity p", ProductEntity.class).getResultList();
//        em.getTransaction().commit();
//        em.close();
//        return list;
//    }

}
