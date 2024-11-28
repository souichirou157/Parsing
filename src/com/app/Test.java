package com.app;

import java.util.function.Consumer;

import com.app.statement.Perser;

public class Test {
	
	public static void main(String[] args){

		
		String query = "select!!id#!username!#!password!#!authority!!!from admin_staff;";

		
	 
	Consumer<Perser> perser = Perser.setQuery(p ->{
		
		p.setStatement(query)
		.Molding()
		.divisionQuery()
		.findAll();
	
	
	});

	 
	}
	 
}
