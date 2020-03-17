/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import entity.Person;
import entity.Pupil;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PupilProvider {
    private Scanner scanner = new Scanner(System.in);
    public Pupil createPupil(){
        Pupil pupil = new Pupil();
        System.out.println("Создание человека!");
        
        System.out.println("Введите имя:");
        pupil.setName(scanner.nextLine());
        System.out.println("Введите фамилию:");
        pupil.setSurename(scanner.nextLine());
        
        System.out.println("Введите статус:");
        pupil.setStatus(scanner.nextLine());
        return pupil;
    }
}
