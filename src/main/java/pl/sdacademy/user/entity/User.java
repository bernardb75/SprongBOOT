package pl.sdacademy.user.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class User {
    private String name;
    private String surname;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


}
