/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author User
 */
public class InheritanceDTO {
    
    private String className;
    private int directInheritance;
    private int indirectInheritance;
    private int total;
    private int ci;

    public String getClassName() {
        return className;
    }

    public int getDirectInheritance() {
        return directInheritance;
    }

    public int getIndirectInheritance() {
        return indirectInheritance;
    }

    public int getTotal() {
        return total;
    }

    public int getCi() {
        return ci;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setDirectInheritance(int directInheritance) {
        this.directInheritance = directInheritance;
    }

    public void setIndirectInheritance(int indirectInheritance) {
        this.indirectInheritance = indirectInheritance;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    
    public void setCodeLine(String line){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
