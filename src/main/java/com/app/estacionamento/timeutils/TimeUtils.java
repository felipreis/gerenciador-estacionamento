package com.app.estacionamento.timeutils;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeUtils {

    public static int calculateHoursDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return (int) duration.toHours();
    }

    public static Double valorPagamento(LocalDateTime star, LocalDateTime end) {
        int duration = calculateHoursDifference(star, end);
        System.out.println("Duração em horas: " + duration);
        Double valor = 0.0;
        switch (duration) {
            case 0:
                valor = 4.00;
                break;
            case 1:
                valor = 4.00;
                break;
            case 2:
                valor = 6.00;
                break;
            case 3:
                valor = 8.00;
                break;
            case 4:
                valor =10.00;
                break;
            case 5:
                valor = 12.00;
                break;
            case 6:
                valor = 14.00;
                break;
            case 7:
                valor = 16.00;
                break;
            case 8:
                valor = 18.00;
                break;
            case 9:
                valor = 20.00;
                break;
            case 10:
                valor = 22.00;
                break;
            default:
                valor = 0.0; // Valor padrão para durações maiores que 10 horas ou negativas
                break;
        }
        return valor;
    }
}
