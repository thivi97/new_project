/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Inheritance {

    private int lineNumber;
    private String statement;
    private int ci; //complexity inheritance
    private int di; //direct inheritance
    private int ini; //indirect inheritance

    public Inheritance(){
        this.ci = 1;
    }
    
    public int getLineNumber(){
        return lineNumber;
    }
    
    public void setLineNumber(int lineNumber){
        this.lineNumber = lineNumber;
    }
    
    public String getStatement(){
        return statement;
    }
    
    public void setStatement(String statement){
        this.statement = statement;
    }
    
    public int getCi(){
        return ci;
    }
    
    public void setCi(int ci){
        this.ci = ci;
    }
    
    public int getDi(){
        return di;
    }
    
    public void setDi(int di){
        this.di = di;
    }
    
    public int getIni(){
        return ini;
    }
    
    public void setIni(){
        this.ini = ini;
    }
    
    @Override
    public String toString(){
        return "Inheritance [lineNumber=" + lineNumber + " , statement=" + statement + " , ci=" + ci +" , di=" + di +" , ii=" + ini + "]";
    }
    
    
    
}
