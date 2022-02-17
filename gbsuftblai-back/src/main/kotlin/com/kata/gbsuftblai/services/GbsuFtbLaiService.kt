package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    companion object {
        const val divTrois = 3
        const val divCinq = 5
        const val Gbsu = "Gbsu"
        const val Ftb = "Ftb"
        const val Lai = "Lai"

        const val trois = '3'
        const val cinq = '5'
        const val sept = '7'
    }

    fun convertNumber(inputNumber: Int): String {

        var value: StringBuilder = StringBuilder();
        var isMatch: Boolean = false
        var stringNumbur = inputNumber.toString();

        //If the number is divisible by 3
        (inputNumber % divTrois == 0)
        if (inputNumber % divTrois == 0) {
            value.append(Gbsu);
            isMatch = true;
        }
        //If the number is divisible by 5
        if (inputNumber % divCinq == 0) {
            value.append(Ftb);
            isMatch = true;
        }

        //if the number contains 3, 5, 7
        if (stringNumbur.contains(trois) || stringNumbur.contains(cinq) || stringNumbur.contains(sept)) {

            value = containsNumber(stringNumbur, value)
            isMatch = true;
        }

        if (isMatch) {
            return value.toString();
        } else {
            return stringNumbur
        }
    }

    fun containsNumber(stringNumbur: String, valeur: StringBuilder): StringBuilder {

        val stringLength = (stringNumbur.length - 1)
        for (i in 0..stringLength) {
            when (stringNumbur[i]) {
                trois -> valeur.append(Gbsu)
                cinq -> valeur.append(Ftb)
                sept -> valeur.append(Lai)
            }
        }
        return valeur;
    }

}