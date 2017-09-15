package com.training.ano;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;


@NamedQueries({
    @NamedQuery( 
        name = "listEmploye", 
       query = "from Employee e where e.name = :empName" ) 
       }
) 


@Entity 
@Table(name = "Ano_Employee")


public class Employee {

	
	  public Employee() {

	  }
	  @Id
	  @Column(name = "id")
	  Integer id;

	  @Column(name = "name")
	  String name;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
}
