/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

public class Player {
        //atribut
        String name,nameM;
        int speed,healthP,damage,shield,speedM,healthPM,damageM,shieldM;
        //method run
        void run(){
            System.out.println(name+" is running...");
            System.out.println("speed : "+speed);
        }
        void runM(){
            System.out.println(nameM+" is running...");
            System.out.println("speed : "+speedM);
        }
        //method attack
        void attack(String nameM){
            System.out.println(name+" is attacking " + nameM);
            System.out.println("damage : "+damage);
        }
        //method deffends
        void deffends(int shieldM,int damage,int healthPM){
            System.out.println(nameM+" is deffending...");
            System.out.println("damage reduction : "+shieldM);
            System.out.println("damage masuk : "+(damage-shieldM));
            System.out.println("Sisa Healthpoin : "+(healthPM-(damage-shieldM)));
        }
        //method isDead
        boolean isDead(){
            if(healthPM <= 0) return true;
            return false;   
    }
}
