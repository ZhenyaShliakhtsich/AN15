package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha1;

import java.util.Scanner;

public class Voenniy extends Vozdushniy{
   boolean systemKatapult;
   int kolRaket;

   public static void main(String[] args) {
      Voenniy voenniy = new Voenniy();
      voenniy.systemKatapult = true;
      Scanner scanner  =new Scanner(System.in);
      System.out.println("Введите количество ракет на борту: ");
      voenniy.kolRaket = scanner.nextInt();
      if (voenniy.kolRaket!=0){
         System.out.println("Ракета пошла");
      }
      else System.out.println("Боеприпасы отсутсвуют");
      if (voenniy.systemKatapult==true){
         System.out.println("Катапультирование прошло успешно");
      }
      else System.out.println("У вас нет такой системы");
   }

   public Voenniy() {
   }

   public Voenniy(int power, int maxSpeed, int weight, String brand, int razmahKriliev, int minDlinaVPP, boolean systemKatapult, int kolRaket) {
      super(power, maxSpeed, weight, brand, razmahKriliev, minDlinaVPP);
      this.systemKatapult = systemKatapult;
      this.kolRaket = kolRaket;
   }
}
