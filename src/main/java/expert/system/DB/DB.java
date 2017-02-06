package expert.system.DB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import expert.system.cars.Car;
import expert.system.cars.CarList;
import java.util.StringTokenizer;

public class DB {
	private static final String API_URL ="https://api.edmunds.com/api/vehicle/v2/";
	private static final String API_KEY = "?view=basic&fmt=json&api_key=qmvnkhczqv85z76sxjugd7av";
	//styles/200731949
	

	public static String get(String query) throws Exception {

		URL obj = new URL(API_URL+query+API_KEY);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		//int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
	}

	public static CarList loadData(){
		CarList carList = new CarList();
		BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("res\\data"));
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
            e.printStackTrace();
            carList = null;
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
