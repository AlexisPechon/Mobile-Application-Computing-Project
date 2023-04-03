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
    public void sendGalwayBus() throws IOException{

        URL obj = new URL(GET_GALWAY_BUS_URL);

    }

}
