package com.tasif.observerpattern;

import com.tasif.observerpattern.MyModel.Person;

public class ObserverClient {

	public static void main(String[] args) {
		 MyModel model = new MyModel();
	     Observer observer = new Observer(model);
	     // we change the last name of the person, observer will get notified
	     for (Person person : model.getPersons()) {
	    	person.setLastName(person.getLastName() + " Changed First Name");
	     }
	     
	     // we change the name of the person, observer will get notified
	     for (Person person : model.getPersons()) {
	    	 person.setFirstName(person.getFirstName() + " Changed Secound Name");
	     }

	}

}
