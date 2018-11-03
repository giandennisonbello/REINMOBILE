package com.example.lorrainegarcia.rein.Network;


import android.content.Context;
import android.content.SharedPreferences;

import com.example.lorrainegarcia.rein.R;


/**
 * Created by Mendel on 5/14/2018.
 */

public class Preconfig {
    private SharedPreferences sharedPreferences;
    private Context context;

    public Preconfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences
                (context.getString(R.string.pref_file), Context.MODE_PRIVATE);
    }

//    public void writeLoginStatus(boolean status) {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putBoolean(context.getString(R.string.pref_login_status), status);
//        editor.commit();
//    }
//
//    public boolean readLoginStatus() {
//        return sharedPreferences.getBoolean
//                (context.getString(R.string.pref_login_status), false);
//    }

    public void saveToken(String token) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.token), token);
        editor.commit();
    }

    public String getToken() {
        return sharedPreferences.getString
                (context.getString(R.string.token), "token");
    }
//
//    public void saveLat(String Latitude) {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(context.getString(R.string.pref_Lat), Latitude);
//        editor.commit();
//    }
//
//    public String getLat() {
//        return sharedPreferences.getString
//                (context.getString(R.string.pref_Lat), "Latitude");
//    }
//    public void saveLong(String Longtitude) {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(context.getString(R.string.pref_Long), Longtitude);
//        editor.commit();
//    }
//
//    public String getLong() {
//        return sharedPreferences.getString
//                (context.getString(R.string.pref_Long), "Longtitude");
//    }
//
//    public void logout() {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.clear();
//        editor.commit();
//    }
//

//
//    public void savereportID(int ID) {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt(context.getString(R.string.pref_reportID), ID);
//        editor.commit();
//    }
//
//    public int getreportID() {
//        return sharedPreferences.getInt(context.getString(R.string.pref_reportID), 1);
//    }
//
//    public void savevolunteerID(int ID) {
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt(context.getString(R.string.pref_volunteerID), ID);
//        editor.commit();
//    }
//
//    public int getvolunteerID() {
//        return sharedPreferences.getInt(context.getString(R.string.pref_volunteerID), 1);
//    }

    public void saveID(String ID) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.pref_id), ID);
        editor.commit();
    }

    public String getID() {
        return sharedPreferences.getString(context.getString(R.string.pref_id), "1");
    }
}
