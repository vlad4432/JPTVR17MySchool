package interfaces;

import entity.Jornal;
import entity.Person;
import entity.Pupil;
import entity.Subject;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public interface Saveble {
    void savePersons(List<Person> listPersons);
    List<Person> loadPersonFromStorage();
    
    void savePupils(List<Pupil> listPupils);
    List<Pupil> loadPupilFromStorage();
    
    void saveJornals(List<Jornal> listJornals);
    List<Jornal> loadJornalFromStorage();
    
    void saveSubjects(List<Subject> listSubject);
    List<Subject> loadSubjectFromStorage();
    
}
