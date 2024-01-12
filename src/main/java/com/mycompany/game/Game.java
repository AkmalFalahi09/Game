/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

public class Game {
    public static void main(String[] args) {
    
        //objek hero
        Player Hero = new Player();
        Hero.name = "akmal";
        Hero.speed = 300;
        Hero.healthP = 500;
        Hero.damage = 250;
        Hero.shield = 100;
        //objek enemy
        Player Enemy = new Player();
        Enemy.nameM = "davito";
        Enemy.speedM = 200;
        Enemy.healthPM =700;
        Enemy.damageM = 150;
        Enemy.shieldM = 80;
        
        Enemy.runM();
        Hero.run();
        Hero.attack(Enemy.nameM);
        Enemy.deffends(Enemy.shieldM,Hero.damage,Enemy.healthPM);
        if(Enemy.isDead()){
            System.out.println("Game over");
        }
    }
}
