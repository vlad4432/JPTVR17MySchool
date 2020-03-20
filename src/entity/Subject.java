/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Subject implements Serializable{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id; 
     private String name;
     private Integer hours;
     private String status;
     
public Subject(){} 

public Subject(String name,Integer hours,String status ){
        this.name = name;
        this.hours = hours;
        this.status = status;
    } 



@Override
public String toString() {
    return "Subject{" + "id=" + id + ", name=" + name + ", hours=" + hours + ", status=" + status + '}';
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
