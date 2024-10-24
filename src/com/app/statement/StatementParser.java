package com.app.statement;

import java.util.StringTokenizer;


public class StatementParser {
	
	 private String statement;
	 private StringTokenizer divState;
	 private String attr[];
	 
	 
	 
	 
	public StatementParser() {}
	
	public StatementParser(String statement) {
		
		setStatement(statement);
		Molding();
		

	}
	
	public String getStatement() { return this.statement;}
	
	private void setStatement(String statement) { this.statement = statement;}
	
	//ブラウザから受け取ったクエリをアンエスケープする
	private void Molding() {
		 
		for(int i =0; i < this.statement.length();i++) {
			 if(this.statement.charAt(i) == '#') this.statement = statement.replace("#", " ,");
            if(this.statement.charAt(i)=='!') this.statement = statement.replace("!", " ");
		 }
	}
	
	public String []getAttrName() {
		
		return attr;
	}
	public String []divisionQuery(StatementParser sp) {
		 this.divState = new StringTokenizer(sp.getStatement()," ,");
		 String str = new String(this.divState.nextToken());
		 
		 
		 int i =0;
		 this.attr = new String[sp.getTokenlength().countTokens()];
		 while(sp.getTokenlength().hasMoreTokens()) {
			 attr[i]=sp.getTokenlength().nextToken();
			 i++;
		 }
		 
		 
		 return getAttrName() ;
	}
	

	
	public String []ForHandOverGetColumnName() {
		
		 for (String col : attr) {
				if(col.equals("from")) break;
				
				        System.out.println(col);
		   }
		 
		 return attr;
	}
	
	public void extractionAttribute(StatementParser sp,Object []obj) {
		
		obj = new String[sp.getTokenlength().countTokens()];
		 int i =0;
		 
		 while(sp.getTokenlength().hasMoreTokens()) {
			 obj[i]=sp.getTokenlength().nextToken();
			 i++;
		 }
		 
		 
	}
	
	
	public StringTokenizer getTokenlength() {
		
		return   this.divState;
	}
		
	

}

