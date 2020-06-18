package com.india.covid19india.utils;

import android.content.Context;

import com.india.covid19india.model.State;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Utils {


    public static List<State> getStates() {
        Moshi moshi = new Moshi.Builder().build();
        Type listMyData = Types.newParameterizedType(List.class, State.class);
        JsonAdapter<List<State>> adapter = moshi.adapter(listMyData);
        try {
            return adapter.fromJson(states);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final String states = "[\n" +
            "{\n" +
            "\"key\": \"TT\",\n" +
            "\"name\": \"All\"    \n" +
            "},\n" +
            "{\n" +
            "\"key\": \"AN\",\n" +
            "\"name\": \"Andaman and Nicobar Islands\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"AP\",\n" +
            "\"name\": \"Andhra Pradesh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"AR\",\n" +
            "\"name\": \"Arunachal Pradesh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"AS\",\n" +
            "\"name\": \"Assam\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"BR\",\n" +
            "\"name\": \"Bihar\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"CG\",\n" +
            "\"name\": \"Chandigarh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"CH\",\n" +
            "\"name\": \"Chhattisgarh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"DL\",\n" +
            "\"name\": \"Delhi\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"GA\",\n" +
            "\"name\": \"Goa\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"GJ\",\n" +
            "\"name\": \"Gujarat\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"HR\",\n" +
            "\"name\": \"Haryana\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"HP\",\n" +
            "\"name\": \"Himachal Pradesh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"JK\",\n" +
            "\"name\": \"Jammu and Kashmir\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"JH\",\n" +
            "\"name\": \"Jharkhand\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"KA\",\n" +
            "\"name\": \"Karnataka\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"KL\",\n" +
            "\"name\": \"Kerala\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"LD\",\n" +
            "\"name\": \"Lakshadweep\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"MP\",\n" +
            "\"name\": \"Madhya Pradesh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"MH\",\n" +
            "\"name\": \"Maharashtra\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"MN\",\n" +
            "\"name\": \"Manipur\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"ML\",\n" +
            "\"name\": \"Meghalaya\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"MZ\",\n" +
            "\"name\": \"Mizoram\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"NL\",\n" +
            "\"name\": \"Nagaland\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"OR\",\n" +
            "\"name\": \"Odisha\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"PY\",\n" +
            "\"name\": \"Puducherry\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"PB\",\n" +
            "\"name\": \"Punjab\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"RJ\",\n" +
            "\"name\": \"Rajasthan\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"SK\",\n" +
            "\"name\": \"Sikkim\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"TN\",\n" +
            "\"name\": \"Tamil Nadu\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"TS\",\n" +
            "\"name\": \"Telangana\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"TR\",\n" +
            "\"name\": \"Tripura\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"UK\",\n" +
            "\"name\": \"Uttar Pradesh\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"UP\",\n" +
            "\"name\": \"Uttarakhand\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"WB\",\n" +
            "\"name\": \"West Bengal\"\n" +
            "},\n" +
            "{\n" +
            "\"key\": \"DN\",\n" +
            "\"name\": \"Dadra and Nagar Haveli and Daman and Diu\"\n" +
            "}\n" +
            "]";
}
