package spring.boot.jersey.sample.data;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

	private final List<Person> personList = new ArrayList<>();

	@PostConstruct
	public void init() {
		personList.add(new Person(1, "Uzumaki Naruto", "uzumaki_naruto@konohagakure.com"));
		personList.add(new Person(2, "Uchiha Sasuke", "uchiha_sasuke@konohagakure.com"));
		personList.add(new Person(3, "Sakura Haruno", "sakura_haruno@konohagakure.com"));
		personList.add(new Person(1, "Hatake Kakashi", "hatake_kakashi@konohagakure.com"));
	}

	public Person getById(int personId) {
		return personList.stream().filter((person) -> person.getPersonId() == personId).findFirst().get();
	}

	public List<Person> getAllPersons() {
		return personList;
	}

}
