package models;

import models.Employee;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player extends Employee {

    public Player() {
    }

    public Player(String name) {
        super(name);
    }
}
