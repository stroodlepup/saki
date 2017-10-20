package com.company;

import com.company.gui.TestLayout;
import com.company.lib.SurveyDataParser;
import com.company.models.Line;
import com.company.structures.LotData;

import java.util.Scanner;

public class Main {
    public Scanner scanner;

    public Main(){
        this.scanner=new Scanner(System.in).useDelimiter("\\s");
//        while (true) {
//            System.out.println("bearing");
//            String bearing = scanner.nextLine();
//            System.out.println(SurveyDataParser.BearingToQuadrantConverter(bearing));
//        }

        LotData test=new LotData(new Line("0","1","13","123"));
        echo("Lot Name:");
        test.setLotName(scanner.next());
        echo("Tie Line");

        test.add(new Line("1","2","124","41"));
        test.add(new Line("2","3","234","34"));
        test.add(new Line("3","4","645","123"));
        test.add(new Line("4","5","41s","12"));

//        String cont="y";
//        int i=0;
//        do {
//            test.add(addLine(i));
//            echo("Continue?(y or n):");
//            cont=this.scanner.nextLine();
//            i++;
//        }while (cont.trim().matches("y"));

        printlines(test);

//        new TestLayout();
    }

    public Line addLine(int i){
        this.scanner=new Scanner(System.in).useDelimiter("\\s");
        String bearing, distance;
        echo("bearing:");
        bearing=scanner.nextLine();
        echo("distance");
        distance=scanner.nextLine();
        return new Line(""+i,""+(i+1),bearing,distance);
    }

    public void printlines(LotData data){
        for(int i=0;i<data.size();i++){
            echo("("+data.get(i).getPointFrom()+"-"+data.get(i).getPointTo()+")"+data.get(i).getBearing()+"|"+data.get(i).getDistance());
        }
    }

    public void echo(String string){
        System.out.println(string);
    }
    public static void main(String[] args) {
	    new Main();
    }
}
