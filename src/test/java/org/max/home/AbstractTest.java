package org.max.home;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.max.home.GameTest.doors;


public abstract class AbstractTest {

    static Game game;

    @BeforeAll
    static void init() {
        game = new Game("Игрок", doors);
    }
}
