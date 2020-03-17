/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;


import entity.Subject;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class SubjectProvider {
    private Scanner scanner = new Scanner(System.in);
    public Subject createSubject(){
        Subject subject = new Subject();
        System.out.println("Создание предмета!");
        
        System.out.println("Введите название предмета:");
        subject.setName(scanner.nextLine());
        System.out.println("Введите часы предмета:");
        subject.setHours(scanner.nextInt());
        return subject;
    }
}
