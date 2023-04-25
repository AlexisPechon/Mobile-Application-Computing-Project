package com.example.a4th_year_mobile_timetable_application.ui.main;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            APIConnections myConn = new APIConnections();

            if(input == 1){

                //return "Hello World from section: " + input;
                //return myConn.sendGalwayBus();

                try{
                    return "https://cdn-icons-png.flaticon.com/512/194/194279.png";
                    //String response = myConn.sendGalwayBus();
                    //return response;


                }catch(Exception e){
                    System.out.println("A problem has occurred: " + e);
                }
                //return "-> Update: 15/02/2023" +
                        //"\nWelcome to the homepage of the mobile application!" +
                        //"\nThis is where you can find the latest news and updates " +
                        //"\nall related to the development of this mobile application." +
                        //"\nStay in tune for further updates made to this application!" +
                        //"\nWe are currently working hard to deliver you the complete and" +
                        //"\nseamless user experience.";

            }
            else if (input == 2){
                //return "Hello World from section: " + input;
                return "-> Update: 15/02/2023" +
                        "\nWelcome to the timetables page of the mobile application!" +
                        "\nCurrently this page is under construction, so please be patient" +
                        "\nas we work hard to deliver you the complete mobile app experience" +
                        "\nwhere you could view all the different timetables that this application currently supports!" ;
            }
            return "Hello world!";
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}