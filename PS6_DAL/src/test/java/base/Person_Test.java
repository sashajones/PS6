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
	

@BeforeClass
public static void setUpBeforeClass() throws Exception {

	personp = new PersonDomainModel();
	
	personp.setFirstName("Sasha");
	personp.setLastName("Jones");
	personp.setCity("Middletown");
	personp.setPostalCode(54321);
	personp.setStreet("21 Freefield Dr");
	
}

@Test
public void AddPersonTest(){
	PersonDAL.addPerson(personp);
}

@Test
public void GetPersonTest(){
	String LastName = personp.getLastName();
	assertEquals("Jones",LastName);
}

@Test
public void UpdatePersonTest(){
	personp.setFirstName("Sasha");
	PersonDAL.updatePerson(personp);
}

@Test
public void deletePersontest(){
	PersonDAL.addPerson(personp);
}



@AfterClass
public static void tearDownAfterClass() throws Exception {
}


}

