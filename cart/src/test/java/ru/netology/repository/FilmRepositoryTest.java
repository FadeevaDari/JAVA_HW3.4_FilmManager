package test.java.ru.netology.repository;

import main.java.ru.netology.repository.FilmRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class FilmRepositoryTest {
    private FilmRepository filmRepository = new FilmRepository();

    private PurchaseItem first = new PurchaseItem(1, 1, "url1", "name1", "genre1");
    private PurchaseItem second = new PurchaseItem(2, 2, "url2", "name2", "genre2");
    private PurchaseItem third = new PurchaseItem(3, 3, "url3", "name3", "genre3");

    @BeforeEach
    public void setUp() {

        filmRepository.save(first);
        filmRepository.save(second);
        filmRepository.save(third);
    }

    @Test
    public void shouldAdd() {
        PurchaseItem[] actual = filmRepository.findAll();
        PurchaseItem[] expected = new PurchaseItem[]{first, second, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        int idToRemove = 3;
        filmRepository.removeById(idToRemove);
        PurchaseItem[] actual = filmRepository.findAll();
        PurchaseItem[] expected = new PurchaseItem[]{first, second};

        assertArrayEquals(expected, actual);
    }

    

    @Test
    public void shouldRemoveAll() {
        filmRepository.removeAll();
        PurchaseItem[] actual = filmRepository.findAll();
        PurchaseItem[] expected = new PurchaseItem[0];

        assertArrayEquals(expected, actual);
    }

}
