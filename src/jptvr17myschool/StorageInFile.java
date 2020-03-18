package jptvr17myschool;
import entity.Jornal;
import entity.Pupil;
import entity.Subject;
import interfaces.Saveble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

  public class StorageInFile implements Saveble{
     
       public void saveJornals(List<Jornal> listJornal) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Jornal.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listJornal);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }
     
    public List<Jornal> loadJornalFromStorage(){
         List<Jornal> jornal = new ArrayList<>();
         FileInputStream fis = null;
         ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Jornal.txt");
            oin = new ObjectInputStream(fis);
            jornal = (List<Jornal>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
     return jornal;
        }
    
    public void saveSubjects(List<Subject> listSubject) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Subject.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listSubject);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }
    
    public  List<Subject> loadSubjectFromStorage(){
         List<Subject> subjects = new ArrayList<>();
         FileInputStream fis = null;
         ObjectInputStream oin = null;
        try {   
            fis = new FileInputStream("Subject.txt");
            oin = new ObjectInputStream(fis);
            subjects = (List<Subject>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return subjects;
     }

      @Override
    public void savePupils(List<Pupil> listPupils) {     
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listPupils);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }
    
    public List<Pupil>loadPupilFromStorage(){
         List<Pupil> pupils = new ArrayList<>();
         FileInputStream fis = null;
         ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Pupils.txt");
            oin = new ObjectInputStream(fis);
            pupils = (List<Pupil>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
     return pupils;
    }

        
    }
   
     
     

     
    
    
    


    
    
    
    
    

    
   