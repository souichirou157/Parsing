package com.app.statement;

import java.util.StringTokenizer;
import java.util.function.Consumer;


public class Perser {
	
	 private String statement;
	 private StringTokenizer divState;
	 private String attr[];
	 
	public Perser() {}
	
	public Perser(String statement) { this.statement = statement;}
	
	
	public Perser setStatement(String statement) { 
		
		this.statement = statement;
		return this;
	}
	
	public static Consumer<Perser> setQuery(Consumer<Perser> ps,String statement) {
		
		ps.accept(new Perser(statement));

		return ps;
	}
	
	public static Consumer<Perser> setQuery(Consumer<Perser> ps) {
		
		
		ps.accept(new Perser());

		return ps;
	}
	
	
	
	//ブラウザから受け取ったクエリをアンエスケープする
	public Perser Molding() {
		 
		for(int i =0; i < statement.length();i++) {
			 if(statement.charAt(i) == '#') statement = statement.replace("#", " ,");
            if(statement.charAt(i)=='!') statement = statement.replace("!", " ");
		 }
		
		return this;
	}
	
	
	public Perser divisionQuery() {
		 
		this.divState = new StringTokenizer(this.statement," ,");
		 String str = new String(this.divState.nextToken()); 
		 int i =0;
		 this.attr = new String[this.divState.countTokens()];
		 
		 
		 while(this.divState.hasMoreTokens()) {
			 attr[i]=divState.nextToken();
			 i++;
		 }
		 
		 
		 return this;
	}
	

	
	public Perser findAll() {
		
		 for (String col : attr) {
				if(col.equals("from")) break;
				
				        System.out.println(col);
		   }
		 return this;
	}
	
}