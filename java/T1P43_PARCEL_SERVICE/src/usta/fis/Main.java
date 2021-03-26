package usta.fis;
//AUTHOR: JESUS ESTEBAN BLANCO SANDOVAL
//DATE:25/03/2021
//DESCRIPTION:this software calculate de shiping cost

import java.util.Scanner;

public class Main {
    public static final double NORTHAMERICAWEIGHT = 11;
    public static final double CENTRALAMERICAWEIGHT = 10;
    public static final double SOUTHAMERICAWEIGHT = 12;
    public static final double EUROPEWEIGHT = 24;
    public static final double ASIAWEIGHT = 27;

    public static final int NORTHAMERICA = 1;
    public static final int CENTRALAMERICA = 2;
    public static final int SOUTHAMERICA = 3;
    public static final int EUROPE = 4;
    public static final int ASIA = 5;

    public static void main(String[] args) {


        p_show_info_program();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the continent of destination(1-5)1=nort america,2=central america,3=south america,4=europe,5=asia");
        int v_country = keyboard.nextInt();
        if(validate_country(v_country)){
            System.out.println("input the weight of service");
            double v_weight = keyboard.nextDouble();

            double v_total_cost = calculate_weight(v_country,v_weight);

            System.out.println("the total cost of the packages is $"+v_total_cost+" for " + get_name_country(v_country));
        }else{
           System.err.println("continent not valid");
        }


    }
    public static void p_show_info_program() {

        //DESCRIPTION:this method show info program (software)
        System.out.println("------------------------------");
        System.out.println("!    parcel_service    V1.0  !");
        System.out.println("! Maker:jesus esteban blanco !");
        System.out.println("! Date: 2021-march-25        !");
        System.out.println("------------------------------");
    }

    public static boolean validate_country(int v_country){
        return v_country == NORTHAMERICA || v_country == CENTRALAMERICA || v_country == SOUTHAMERICA || v_country == EUROPE || v_country == ASIA;
    }

    public static String get_name_country(int v_country){

        switch (v_country){
            case NORTHAMERICA:
                return "North America";
            case CENTRALAMERICA:
                return "Central America";
            case SOUTHAMERICA:
                return "South America";
            case EUROPE:
                return "Europe";
            case ASIA:
                return "Asia";
        }
        return "";
    }
    public static double calculate_weight(int v_country, double v_weight) {
        //DESCRIPTIO: this method return the cost of the country of the packages

        switch (v_country){
            case NORTHAMERICA:
                return NORTHAMERICAWEIGHT * v_weight;
            case CENTRALAMERICA:
                return CENTRALAMERICAWEIGHT * v_weight;
            case SOUTHAMERICA:
                return SOUTHAMERICAWEIGHT * v_weight;
            case EUROPE:
                return EUROPEWEIGHT * v_weight;
            case ASIA:
                return ASIAWEIGHT * v_weight;
        }
        return 0;
    }

}

