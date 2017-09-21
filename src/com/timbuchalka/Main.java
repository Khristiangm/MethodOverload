package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
       /* int newScore = calculateScore("Khristian", 500);
        System.out.println("New Score Is: " + newScore + " Points");
        calculateScore(75);
        calculateScore();/*

    }

   /* public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player Unnamed scored " + score + " Points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No Player named and no Player scored");

    }*/
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(157);


    }
    //Primeiro Metodo Criado Para realizar as conversoes de Feet e Inches
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //If que verificar se o feet e menor que 0 ou inches e menor que 0 ou maior que 12.
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            //se atender a essas condicoes os parametros sao invalidados
            System.out.println("Invalid Feet or Inches parameters");
            //Retornando apenas -1 pois precisa ter algum retorno por ser um "Double"
            return -1;
          //Caso nao caia na primeira condição, entra no Else e Realiza todas as conversoes que o exercicio pede.
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " Feet, " + inches + " Inches = " + centimeters + " Cm ");
            return centimeters;

        }

    }
    //Segundo metodo de overloading, com 1 parametro a menos por via de regra.
    public static double calcFeetAndInchesToCentimeters(double inches) {
        //verificação de condicao dos valores dos parametros.
        if (inches < 0) {
            System.out.println("Invalid Parameters");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches is equal to " + feet + " Feet and " + remainingInches + " Inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

