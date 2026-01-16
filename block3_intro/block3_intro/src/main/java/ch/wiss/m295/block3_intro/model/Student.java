package ch.wiss.m295.block3_intro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  @NotBlank
  private String name;

  @ManyToOne
  private Klasse klasse;


  public Klasse getKlasse() {
    return klasse;
  }
  public void setKlasse(Klasse klasse) {
    this.klasse = klasse;
  }

  public long getId() {
    return id;
  }
  public void setId(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setId'");
  }

}
