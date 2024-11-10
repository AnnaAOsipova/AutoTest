package org.max.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;


/**
 * Класс для реализации игры
 */
public class Game {

    public Scanner randomGenerator;
    public Scanner scanner;
    private final String player;
    private List<Door> doors = new ArrayList<>();

    public Game(String player, List<Door> doors) {
        this.player = player;
        this.doors = doors;
    }

    public Door round (int door) {
        if (!player.getRisk()) return doors.get(door);
        else {
            doors.remove(doors.get(door));
            return doors.get(0).isPrize() ? doors.get(0) : doors.get(1);
        }
    }


    public void playGame() {

    }
}


