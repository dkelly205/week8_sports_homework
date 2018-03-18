package models;

import models.Employee;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="managers")
public class Manager extends Employee {

    public Manager() {
    }

    public Manager(String name) {
        super(name);
    }
}
