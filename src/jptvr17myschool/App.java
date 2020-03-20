/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr17myschool;

import entity.Jornal;
import entity.Pupil;
import entity.Subject;
import interfaces.Saveble;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import providers.JornalsPrivider;
import providers.PupilProvider;
import providers.SubjectProvider;

/**
 *
 * @author pupil
 */
/**/
class App {
    private List<Pupil> listPupils = new ArrayList<>();
    private  List<Subject> listSubjects = new ArrayList<>();
    private   List<Jornal> listJornals = new ArrayList<>();  
    private StorageInFile storageInFile;
    
    private Saveble saveble;
 
    
 
    public App() {
        saveble = new StorageInBase();
      /* storageInFile = new StorageInFile();*/
        try {
            listPupils = saveble.loadPupilFromStorage();
          /*listPupils = storageInFile.loadPersonFromFile();*/
        } catch (Exception e) {
            /*System.out.println("Нет файла Pupils.txt");*/
            System.out.println("Нет данных");
        }
       
        try {
            listJornals = saveble.loadJornalFromStorage();
           /*listJornals = storageInFile.loadJornalFromFile();*/
        } catch (Exception e) {
            System.out.println("Нет данных");
            /*System.out.println("Нет файла Jornal.txt");*/
        }
        try {
            listSubjects = saveble.loadSubjectFromStorage();
           /*listSubjects = storageInFile.loadSubjectFromFile();*/
        } catch (Exception e) {
            System.out.println("Нет данных");
           /* System.out.println("Нет файла Readers.txt");*/
        }
    }  

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String repeat = "r";
        System.out.println("---- Наша школа----");
        do{
            System.out.println("Выберите операцию:");
            System.out.println("1.Добавить ученика");
            System.out.println("2.Добавить предмет");
            System.out.println("3.Добавить оценку");
            System.out.println("4.Список оценок");
            int operation;
            operation = scanner.nextInt();
            scanner.nextLine();
            switch(operation){
                case 1:
                    System.out.println("Добавить ученика в школу");
                    PupilProvider pupilProvider = new PupilProvider();
                    listPupils.add(pupilProvider.createPupil());
                    /*storageInFile.savePerson(listPupils);*/
                    saveble.savePupils(listPupils);
                    for(int i=0; i < listPupils.size();i++){
                       System.out.println(
                            "Список учеников: " 
                            + listPupils.get(i).getName()
                        ); 
                    }
                    break;
                case 2:
                    System.out.println("Добавить предмет");
                    SubjectProvider subjectProvider = new SubjectProvider();
                    Subject subject;
                    subject = subjectProvider.createSubject();
                    listSubjects.add(subject);
                    /*storageInFile.saveSubjects(listSubjects);*/
                    saveble.saveSubjects(listSubjects);
                    
                    break;
                case 3:
                    System.out.println("Добавить оценку");
                    JornalsPrivider jornalsProvider = new JornalsPrivider();
                    Jornal jornal = jornalsProvider.createJornal(listPupils, listSubjects);
                    listJornals.add(jornal);
                    /*storageInFile.saveJornals(listJornals);*/
                    saveble.saveJornals(listJornals);
                    break;
                case 4:
                    System.out.println("Список оценок");
                    for(int i=0; i<listJornals.size(); i++){
                        System.out.println(listJornals.get(i));
                        System.out.printf("%d. %s %s. Предмет: %s. Оценка: %d%n",
                                i+1,
                                listJornals.get(i).getPupil().getName(),
                                listJornals.get(i).getPupil().getSurename(),
                                listJornals.get(i).getSubject().getName(),
                                listJornals.get(i).getHind());
                        }
                    
                    
            };
        
            System.out.println("Для продолжения программы введите r");
            repeat = scanner.nextLine();
        } while("r".equals(repeat));
        System.out.println("Программа закончила работу");
    }
    

}

