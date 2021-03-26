package usta.fis;
//AUTHOR: JESUS ESTEBAN BLANCO SANDOVAL
//DATE:25/03/2021
//DESCRIPTION:this software calculate the total money saved in the year

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1; i<=12; i=i+1) {
            System.out.println("----month " + i + "-----");
            v_total_saved = v_total_saved + p_user_saved_money();
        }
         System.out.println("tho total saved money in year is$"+v_total_saved);
    }
    public static void p_show_info_program(){

            //DESCRIPTION:this method show info program (software)
              System.out.println("------------------------------");
              System.out.println("!    softsavedmoney    V1.0  !");
              System.out.println("! Maker:jesus esteban blanco !");
              System.out.println("! Date: 2021-march-25        !");
              System.out.println("------------------------------");
    }
    public static int p_user_saved_money(){
        //description:this method return teh saved money in the moth
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the saved money in the month (CO)$:");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money<0){
                System.err.println("ERR: you saved money cannot be lees to zero, input again the saved money (CO)$:");
                v_saved_money= keyboard.nextInt();
        }
        return v_saved_money;
    }



}
