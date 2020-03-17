
import entity.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


  public class StoregeInFile {

    public void savePerson(List<Person> listPerson) {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listPerson);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
        
       
    }


    
    
    
    
    
}
    
   