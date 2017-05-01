
package com.mycompany.testws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 *
 * @author kalsara
 */

@Entity
@Table(name="HUMANS")  
@XmlRootElement(name="person")
@XmlType(propOrder={"id","fullName","age"})
public class person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
       
    @Column(name="ID")
    private int id;
    @Column(name="FULLNAME")
    private String fullName;
    @Column(name="AGE")
    private int age;
    
@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@XmlElement

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
@XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
