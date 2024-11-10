package org.max.home;

import org.max.home.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для описания игрока
 */
public class Player {
    //имя игрока
    String name;
    //стратегия игрока, если true игрок меняет дверь
    private boolean risk;

    public Player(String name, boolean risk) {
        this.name = name;
        this.risk = risk;
    }


    public String getName() {
        return name;
    }

    public boolean getRisk() {
        return risk;
    }

}
