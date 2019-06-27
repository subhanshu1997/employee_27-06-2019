package com.cg.eis.service;

public interface Validator {
String eidpattern="[0-9][0-9][0-9]";
String namepattern="[A-Z][a-zA-z]*";
String designation="[A-Z][a-z]*+[ ]+[A-Z][a-z]*";
String salary="[1-9][0-9]*";
public static boolean validate(String data,String pattern) {
	return data.matches(pattern);
}
}
