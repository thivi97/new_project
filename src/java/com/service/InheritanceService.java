/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.util.CommonConstants;
import java.util.List;

/**
 *
 * @author User
 */
public class InheritanceService {
   
    public static int calculateCi(String line){
        int complexityInheritanceValue = 0;
        line.trim();
        
        if(line.contains("class") || line.contains("inherface")){
            complexityInheritanceValue += 2;
            if(line.contains("extends")){
                complexityInheritanceValue += 1;
            }
            if(line.contains("implements")){
                String[] splitted = line.split("implements");
                
                String keyWordAfterString = splitted[CommonConstants.ARRAY_SECOND_ELEMENT];
                String[] beforCurly = keyWordAfterString.split("\\{");
                if(beforCurly.length > 0){
                    String[] implementedSuper = beforCurly[CommonConstants.ARRAY_FIRST_ELEMENT].split(",");
                    for(int i = 0; i < implementedSuper.length;i++){
                        complexityInheritanceValue += 1;
                        System.out.println("This class implemented interface " + (i + 1) + "by" + implementedSuper[i].trim());
                    }
                }
            }
        }
        return complexityInheritanceValue;
    }
    
    
}
