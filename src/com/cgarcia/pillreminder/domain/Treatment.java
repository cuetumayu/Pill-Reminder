package com.cgarcia.pillreminder.domain;

import java.io.Serializable;
import java.util.List;

public class Treatment implements Serializable {

	protected String _name;

	protected List<Drug> _drugs;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public List<Drug> getDrugs() {
		return _drugs;
	}

	public void setDrugs(List<Drug> drugs) {
		_drugs = drugs;
	}

}
