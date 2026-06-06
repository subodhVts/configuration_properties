package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo  personRepo;
	
	public void savePerson() {
		
		Person person = new Person();
		Passport passport=new Passport();
		passport.setPassportNum("ABC68686");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		person.setPersonName("Ashok");
		person.setDob(LocalDate.now().minusYears(30));
		person.setPassport(passport);
		passport.setPerson(person);
		personRepo.save(person);
		
	}

}
