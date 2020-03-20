/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pupil
 */
@Entity
public class Jornal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    @OneToOne
   private Subject subject;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
   private Date date;
   private int hind;
    @OneToOne
   private Pupil pupil;

    public Jornal() {
    }

    public Jornal(Subject subject, Date date, int hind, Pupil pupil) {
        this.subject = subject;
        this.date = date;
        this.hind = hind;
        this.pupil = pupil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHind() {
        return hind;
    }

    public void setHind(int hind) {
        this.hind = hind;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPerson(Pupil pupil) {
        this.pupil = pupil;
    }

    @Override
    public String toString() {
        return "Jornal{" + "id=" + id + ", subject=" + subject + ", date=" + date + ", hind=" + hind + ", pupil=" + pupil + '}';
    }

   
  
}
