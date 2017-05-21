package base;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;


public class Person_Test {

	private static PersonDomainModel personp;
	



@Test
public void AddPersonTest(){
	personp = new PersonDomainModel();
	
	personp.setFirstName("Sasha");
	personp.setLastName("Jones");
	personp.setCity("Middletown");
	personp.setPostalCode(54321);
	personp.setStreet("21 Freefield Dr");
	personp.setBirthday(new Date());
	PersonDAL.addPerson(personp);
	assertEquals(PersonDAL.getPersons().size(),1);
	PersonDAL.deletePerson(personp.getPersonID());
}

@Test
public void GetPersonTest(){
	personp = new PersonDomainModel();
	
	personp.setFirstName("Sasha");
	personp.setLastName("Jones");
	personp.setCity("Middletown");
	personp.setPostalCode(54321);
	personp.setStreet("21 Freefield Dr");
	personp.setBirthday(new Date());
	String LastName = personp.getLastName();
	PersonDAL.addPerson(personp);
	assertEquals("Jones",LastName);
	PersonDAL.deletePerson(personp.getPersonID());
}

@Test
public void UpdatePersonTest(){
	personp = new PersonDomainModel();
	
	personp.setFirstName("Sasha");
	personp.setLastName("Jones");
	personp.setCity("Middletown");
	personp.setPostalCode(54321);
	personp.setStreet("21 Freefield Dr");
	personp.setBirthday(new Date());
	PersonDAL.addPerson(personp);
	personp.setFirstName("Tom");
	PersonDAL.updatePerson(personp);
	assertEquals(PersonDAL.getPerson(personp.getPersonID()).getFirstName(),"Tom");
	PersonDAL.deletePerson(personp.getPersonID());
}

@Test
public void deletePersontest(){
	personp = new PersonDomainModel();
	
	personp.setFirstName("Sasha");
	personp.setLastName("Jones");
	personp.setCity("Middletown");
	personp.setPostalCode(54321);
	personp.setStreet("21 Freefield Dr");
	personp.setBirthday(new Date());
	PersonDAL.addPerson(personp);
	assertEquals(PersonDAL.getPersons().size(),1);
	PersonDAL.deletePerson(personp.getPersonID());
}






}

