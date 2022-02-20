package com.teachMeSkills.an15.DergachevPavel.hw1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//Задание 1

        int a = -545;
        int b = -544;
        int c = 67;

        if (a > b && a > c) {
            System.out.println(" a максимальное чисто ");}
        if(b > a && b > c) {
            System.out.println(" b максимальное число");}
        if (c > a && c > b){
            System.out.println(" с максимальное число");}
        if (a < b && a < c){
            System.out.println(" a минимальное число");}
        if( b < c && b < a){
            System.out.println(" b минимальное число");}
        if (c < a && c < b){
            System.out.println(" c минимальное число");}
        if (a == b && a == c){
            System.out.println("все числа равны");}
        if (a == b || a == c || b == c){
            System.out.println("остальные числа равны");}



//Задание 2

        System.out.println("Какую цифру я загадал?");
        System.out.print("Попытайтесь угадать цифру:");

        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();

        if (ch == 5 || ch == 10 || ch == 17 || ch == 47 || ch == 77 || ch == 93 || ch == 99) {
            System.out.println("Поздравлю, вы выиграли!!!");}
        else if (ch > 100 || ch < 1) {
            System.out.println("Число не входит в диапазон");}
        else {
            System.out.println("Вы проиграли");}}}



// почему нет через Math?