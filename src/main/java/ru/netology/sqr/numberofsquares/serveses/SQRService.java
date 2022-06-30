package ru.netology.sqr.numberofsquares.serveses;

public class SQRService {

    public int searchSquares(int lowLimit, int highLimit) {
        int numberSquares = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowLimit <= i * i && i * i <= highLimit) {
                numberSquares++;
            }
        }
        return numberSquares;
    }
}