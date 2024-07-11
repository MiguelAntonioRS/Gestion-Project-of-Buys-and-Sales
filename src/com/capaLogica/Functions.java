package com.capaLogica;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Miguel Antonio
 */
public class Functions {
    public static String getHourActual(){
        
        Date hour = new Date();
        SimpleDateFormat formats = new SimpleDateFormat("hh,mm,ss");
        return formats.format(hour);
    }
    
    public static String getDateActual(){
        
        Date hour = new Date();
        SimpleDateFormat formats = new SimpleDateFormat("yyyy-MM-dd");
        return formats.format(hour);
    }
}
