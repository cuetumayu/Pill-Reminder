package com.cgarcia.pillreminder.domain;

import java.io.Serializable;

public class Drug implements Serializable {

	protected String _name;

	protected String _description;

	protected Reminder _reminder;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Reminder getReminder() {
		return _reminder;
	}

	public void setReminder(Reminder reminder) {
		_reminder = reminder;
	}

}
