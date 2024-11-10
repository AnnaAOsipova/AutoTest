

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.max.home.Game;
import org.max.home.GameTest;
import org.max.home.PlayGame;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@Nested
class negativeTest {

    @Test
    void testBoundaryConditions() {
        Game game = new Game("player", GameTest.doors);
        int userGuess = -1;
        for (int i = 0; i < 1000; i++) {
            // Генерация трёх дверей
            int door1 = game.randomGenerator.nextInt(3);
            int door2 = game.randomGenerator.nextInt(3);
            // Случайные числа от 0 до 2
            if (door1 == door2) {
                // Если двери совпадают, то генерируем новую пару
                door2 = game.randomGenerator.nextInt(3);
            }
            userGuess = door1; // Выбираем случайную дверь
            boolean isCorrect = (userGuess == door1);
            if (!isCorrect) {
                System.out.println("Некорректное условие");
                break;
            } else {
                continue;
            }
        }

    }
}
@Test
void testExceptions() {
    Game game = new Game("player", GameTest.doors);
    String invalidInput = null;
    try {
        invalidInput = game.scanner.nextLine();
        game.playGame(); // Запускаем игру с некорректным вводом
        fail("Программа должна была выдать ошибку");
    } catch (NumberFormatException e) {
        assertTrue(true); // Успешно поймали NumberFormatException
    }
}

public void main() {
}
