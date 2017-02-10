package com.house.DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.house.cars.Car;
import com.house.cars.CarList;

public class DB {

	public static CarList loadData(){
		CarList carList = new CarList();
		BufferedReader br = null;
        try {
            InputStream in = DB.class.getResourceAsStream("/res/data");
        	br = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = br.readLine()) != null) {
            	if(line.length() > 0){
                StringTokenizer tokens = new StringTokenizer(line, ",");
                carList.addCar(new Car( (tokens.hasMoreTokens())?tokens.nextToken():"", 
                						(tokens.hasMoreTokens())?tokens.nextToken():"", 
                						(tokens.hasMoreTokens())?tokens.nextToken():"", 
                						(tokens.hasMoreTokens())?tokens.nextToken():"",
                						(tokens.hasMoreTokens())?tokens.nextToken():"",
                						(tokens.hasMoreTokens())?tokens.nextToken():"",
                						(tokens.hasMoreTokens())?tokens.nextToken():"",
                						(tokens.hasMoreTokens())?tokens.nextToken():""));
            	}
            }
        } catch (IOException e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
		} finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return carList;
	}
}
