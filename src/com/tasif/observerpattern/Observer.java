package com.tasif.observerpattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener {
	
	public Observer(MyModel model) {
        model.addChangeListener(this);
    }
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
	            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
	}

}
