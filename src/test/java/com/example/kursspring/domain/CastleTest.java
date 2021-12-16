package com.example.kursspring.domain;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Dark souls");

        String except = "Znajduje sie tu zamek o naziwe Dark souls zamieszkaly przez rycerza Rycerz o imieniu: Lancelot" +
                " w wieku: 29 ma zadanie Zadanie: Uratuj ksiezniczke";
        assertEquals(except, castle.toString());
    }
}
