package jptvr17myschool;

import entity.Jornal;
import entity.Pupil;
import entity.Subject;
import interfaces.Saveble;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class StorageInBase implements Saveble{
     private EntityManager em;
    private EntityTransaction tx;
    

    public StorageInBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myschooljptvr17");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    public void savePupils(List<Pupil> listpupils){
        int n =  listpupils.size();
        this.tx.begin();
            for(int i=0; i<n; i++){
                if(listpupils.get(i).getId() == null){
                    em.persist(listpupils.get(i));
                }else{
                    em.merge(listpupils.get(i));
                }
            }
            this.tx.commit();
    }
    public List<Pupil> loadPupilFromStorage(){
        this.tx.begin();
            List<Pupil> listpupis = em.createQuery("SELECT pup From Pupil pup").getResultList();
        this.tx.commit();
        return listpupis;
    }
    public void saveJornals(List<Jornal> listJornals){
        int n = listJornals.size();
        this.tx.begin();
            for(int i=0; i<n; i++){
                if(listJornals.get(i).getId() == null){
                   em.persist(listJornals.get(i));
                }else{
                        em.merge(listJornals.get(i));
                    }
            }
            this.tx.commit();
            }
    public List<Jornal> loadJornalFromStorage(){
        this.tx.begin();
            List<Jornal> listJornals = em.createQuery("SELECT j FROM Jornal j").getResultList();
        this.tx.commit();
        return listJornals;
    } 
    public void saveSubjects(List<Subject> listSubjects){
        int n = listSubjects.size();
        this.tx.begin();
            for(int i=0; i<n; i++){
                if(listSubjects.get(i).getId() == null){
                em.persist(listSubjects.get(i));
                }
            }
            this.tx.commit();
                                                      }
    
    public List<Subject> loadSubjectFromStorage(){
        this.tx.begin();
            List<Subject> listSubjects = em.createQuery("SELECT s FROM Subject s").getResultList();
        this.tx.commit();
        return listSubjects;
            
        
    }


}
    
    
    
    

