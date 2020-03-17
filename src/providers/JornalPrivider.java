/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;
import entity.Jornal;
import entity.Person;
import entity.Pupil;
import entity.Subject;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class JornalPrivider {
    
    private Scanner scanner = new Scanner(System.in);
    
    public Jornal createJornal(List<Person> listPupils, List<Subject> listSubjects){
        
        System.out.println("Список учеников:");
        for(int i=0; i<listPupils.size(); i++){
            System.out.println(listPupils.get(i));
            System.out.printf("%d. %s %s%n", 
                    i+1,
                    listPupils.get(i).getName(),
                    listPupils.get(i).getSurename());
        }
        System.out.println("Выбери ученика:");
        int numPupil = scanner.nextInt();
        
        System.out.println("Список предметов:");
        for(int i=0; i<listSubjects.size(); i++){
            System.out.println(listSubjects.get(i));
            System.out.printf("%d. %s%n", 
                    i+1,
                    listSubjects.get(i).getName()
            ); 
        }
        System.out.println("Выбери предмет:");
        int numSubject = scanner.nextInt();
        
        System.out.println("Выстови оценку от 1 до 5:");
        int hind = scanner.nextInt();
        Date date = new Date();
        Jornal jornal = new Jornal(listSubjects.get(numSubject-1), date, hind, listPupils.get(numPupil-1)); 
        return jornal;
    }

    public Jornal createJornal(List<Pupil> listPupils, List<Subject> listSubjects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
