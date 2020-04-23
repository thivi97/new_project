/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class FileToAnalyze {
    
    private byte[] file;
    private String fileName;
    
    public byte[] getFile(){
        return file;
    }
    
    public void setFile(byte[] file){
        this.file = file;
    }
    
    public String getFileName(){
        return fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public String toString(){
        return "FileToAnalyze [file=" + Arrays.toString(file) + ", fileName=" + fileName +"]";
    }
    
}
