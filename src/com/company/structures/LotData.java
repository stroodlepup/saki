package com.company.structures;

import com.company.lib.SurveyConstants;
import com.company.models.Line;

import java.util.LinkedList;

/**
 * Created by stroodlepup on 10/5/17.
 */
public class LotData extends LinkedList<Line>{
    String lotName="";

    public LotData(){

    }

    public LotData(Line tieLine){
        tieLine.setTieLine(SurveyConstants.IS_TIE_LINE);
        this.add(tieLine);

    }

    public void setLotName(String lotName){
        this.lotName=lotName;
    }

    public LotData getLot(){
        //fucking lotdata!!!
        return this;
    }


}
