package com.app.test;
import com.app.statement.StatementParser;
//  compile  javac -cp  dist/  -encoding utf-8   -d dist/  com/app/*.java 
//javac -cp  dist/  -encoding utf-8   -d dist/  com/app/statement/StatementParser.java    com/app/symbol/*.java   com/app/test/*.java


public class Parsertest {

	public static void main(String[] args) {
		
		String query = "select id, username , password , authority  from admin_staff;";
		
	
		StatementParser sp = new StatementParser(query);
		sp.divisionQuery(sp);
		sp.ForHandOverGetColumnName();
		
		
		
		
		
	}

}
