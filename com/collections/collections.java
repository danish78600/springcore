package com.collections;

import java.util.List;
import java.util.Set;

public class collections {
private  List<String> names;
private Set<String> courses;
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Set<String> getCourses() {
	return courses;
}
public void setCourses(Set<String> courses) {
	this.courses = courses;
}


public collections(List<String> names, Set<String> courses) {
	super();
	this.names = names;
	this.courses = courses;
}


public collections() {
	super();
	// TODO Auto-generated constructor stub
}
}

