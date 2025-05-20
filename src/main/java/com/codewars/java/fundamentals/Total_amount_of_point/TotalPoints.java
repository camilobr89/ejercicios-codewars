package com.codewars.java.fundamentals.Total_amount_of_point;

public class TotalPoints {

    public static int points(String[] games) {
        int totalPoints = 0;

        for (String game : games) {
            // Dividimos el string "x:y" en dos partes
            String[] scores = game.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            // Verificamos quién ganó o si hubo empate
            if (x > y) {
                totalPoints += 3; // Gana el equipo
            } else if (x == y) {
                totalPoints += 1; // Empate
            }
            // Si x < y no se suman puntos, queda en 0
        }

        return totalPoints;
    }
}
