package wiss.m165;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import wiss.m165.dataaccess.GameRepository;
import wiss.m165.model.Game;

public class GameRepositoryTest {

    GameRepository repository = new GameRepository();

    @Test
    public void WhenFindById_WithID1_ReturnsGame() {
        Optional<Game> game = repository.findById(1);

        assertFalse(game.isEmpty());
        assertEquals("Frostpunk", game.get().getName());
    }

    @Test
    public void WhenFindByName_WithFrostpunk_ReturnsGame() {
        Optional<Game> game = repository.findByName("Frostpunk");

        assertFalse(game.isEmpty());
        assertEquals("Frostpunk", game.get().getName());
    }

    @Test
    public void WhenInsert_WithGame_NoException() throws ParseException {
        // Arrange
        Game newGame = new Game(
                6,
                "Bioshock Infinite",
                "Ego-Shooter",
                "The latest game from the *Shock series. ",
                new SimpleDateFormat("dd.MM.yyyy").parse("13.11.2013"),
                "2k");

        // Action
        repository.insert(newGame);

        // Assert
        Optional<Game> foundGame = repository.findByName("Bioshock Infinite");
        assertFalse(foundGame.isEmpty());
        assertEquals(newGame.getName(), foundGame.get().getName());
        assertEquals(newGame.getType(), foundGame.get().getType());
        assertEquals(newGame.getDescription(), foundGame.get().getDescription());
        assertEquals(newGame.getReleaseDate(), foundGame.get().getReleaseDate());
        assertEquals(newGame.getPublisher(), foundGame.get().getPublisher());
    }

    @Test
    public void WhenUpdate_WithGame_NoException() throws ParseException {
        // Arrange
        Game updatedGame = new Game(
                6,
                "Bioshock Infinite 2",
                "Ego-Shooter Storydriven",
                "The latest game from the *Shock series. ",
                new SimpleDateFormat("dd.MM.yyyy").parse("13.10.2013"),
                "2k");

        // Act
        repository.update(updatedGame);

        // Assert
        Optional<Game> foundGame = repository.findByName("Bioshock Infinite 2");
        assertFalse(foundGame.isEmpty());
        assertEquals(updatedGame.getName(), foundGame.get().getName());
        assertEquals(updatedGame.getType(), foundGame.get().getType());
        assertEquals(updatedGame.getDescription(), foundGame.get().getDescription());
        assertEquals(updatedGame.getReleaseDate(), foundGame.get().getReleaseDate());
        assertEquals(updatedGame.getPublisher(), foundGame.get().getPublisher());
    }

    @Test
    public void WhenDelete_WithGame_NoException() {
        // Arrange

        // Act
        repository.delete(6);
        Optional<Game> game = repository.findById(6);

        // Assert
        assertTrue(game.isEmpty());
    }
}
