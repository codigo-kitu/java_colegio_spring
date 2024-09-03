package com.bydan.colegio.base.client.util;

import java.util.Date;

//import {constantes} from './constantes';

public class FuncionGeneralClient {
    
	public static String GetLabelBoolean(String value){
        String label="NO";

        if(value=="true") {
            label="SI";
        }

        return label;
    }

    public static String GetLabelDate(Date value){
        String label="";

        /*
        Date date=new Date(value);

        String month=date.getMonth().toString();
        String day=date.getDay().toString();

        if(date.getMonth()<10) {
            month = "0"+date.getMonth();
        }

        if(date.getDay()<10) {
            day = "0"+date.getDay();
        }

        label=date.getFullYear() + "-"+ month + "-"+day;
        */

        return label;
    }

    public static String GetLabelTime(Date value){
        String label="";

        /*
        Date date=new Date(value);

        String hour=date.getHours().toString();
        String minute=date.getMinutes().toString();
        String second=date.getSeconds().toString();

        if(date.getHours()<10) {
            hour = "0"+date.getHours();
        }

        if(date.getMinutes()<10) {
            minute = "0"+date.getMinutes();
        }

        if(date.getSeconds()<10) {
            second = "0"+date.getSeconds();
        }

        label=hour + ":"+ minute + ":"+second;
        */

        return label;
    }
}

//Funcion_General funcion_general1 = new Funcion_General();
