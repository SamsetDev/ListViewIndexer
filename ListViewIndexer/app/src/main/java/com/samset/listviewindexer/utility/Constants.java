package com.samset.listviewindexer.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by weesync on 04/04/16.
 */
public class Constants {

    public static List<String> getData()
    {
        List<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("Iceland");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("France");
        countries.add("Germany");
        countries.add("United Kingdom");
        countries.add("Austria");
        countries.add("Ireland");
        countries.add("Portugal");
        countries.add("Belgium");
        countries.add("Denmark");
        countries.add("Finland");
        countries.add("Shri Lanka");
        countries.add("Norway");
        countries.add("Sweden");
        countries.add("Netherlands");
        countries.add("Greece");
        countries.add("Luxembourg");
        countries.add("Malta");
        countries.add("Nepal");
        countries.add("Latvia");
        countries.add("Slovakia");
        countries.add("Slovenia");
        countries.add("U.S.A.");
        countries.add("Poland");
        countries.add("Hungary");
        countries.add("Bhutan");
        countries.add("Romania");
        countries.add("Myanmar");
        Collections.sort(countries); // prevent duplicacy

        return countries;
    }
}
