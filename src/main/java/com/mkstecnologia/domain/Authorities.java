/**
 * 
 */
package com.mkstecnologia.domain;

/**
 * @author Markus Souza on 19/02/2018
 *
 */
public enum Authorities {

    ROLE_USER,
    ROLE_ADMIN;

    public static String[] names() {
    	String[] names = new String[values().length];
    	for(int index = 0; index < values().length; index++) {
    		names[index] = values()[index].name();
    	}
    	
    	return names;
    }
}
