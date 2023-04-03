package com.example.a4th_year_mobile_timetable_application.ui.main;

//Java Imports
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIConnections {

    //Assigning variables
    private final String USER_AGENT = "Mozilla/5.0";
    private final String GET_GALWAY_BUS_URL = "https://galway-bus.apis.ie/api/groute/404/0";
    private final String GET_IRISH_TRAIN_URL = "http://api.irishrail.ie/realtime/realtime.asmx/getAllStationsXML";

    //Methods
    public void sendGalwayBus() throws IOException{ //Start of Galways Bus Method

        URL obj = new URL(GET_GALWAY_BUS_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request did not work.");
        }
    } //End of Galway Bus Method

}
