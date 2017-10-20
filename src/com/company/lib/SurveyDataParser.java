package com.company.lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by stroodlepup on 9/6/17.
 */
public class SurveyDataParser {
    public static String BearingToQuadrantConverter(String bearing){
        bearing=bearing.replace(" ", "").toUpperCase();
        String regex="(SN)\\d*\\.\\d|\\d+\\.\\d*(EW)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(bearing);
        String[] temp=bearing.split(regex);
        temp=bearing.split("(SN)");
        System.out.println(temp.length);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        if(bearing.matches(regex)){
            String verticalDirection, horizontalDirection, angle;

//            for (String a:temp) {
//                System.out.println(a);
//            }

            return bearing;
        }
        else{
            return null;
        }
//        return bearing;
    }

//    public static 
}
