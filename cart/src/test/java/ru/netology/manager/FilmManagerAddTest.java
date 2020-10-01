package test.java.ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerAddTest {
    private ru.netology.manager.FilmManager filmManager = new ru.netology.manager.FilmManager();
        private PurchaseItem first = new PurchaseItem(1, 1, "url1", "name1", "genre1");
        private PurchaseItem second = new PurchaseItem(2, 2, "url2", "name2", "genre2");
        private PurchaseItem third = new PurchaseItem(3, 3, "url3", "name3", "genre3");
        private PurchaseItem fourth = new PurchaseItem(4, 4, "url4", "name4", "genre4");
        private PurchaseItem fifth = new PurchaseItem(5, 5, "url5", "name5", "genre5");
        private PurchaseItem sixth = new PurchaseItem(6, 6, "url6", "name6", "genre6");
        private PurchaseItem seventh = new PurchaseItem(7, 7, "url7", "name7", "genre7");
        private PurchaseItem eighth = new PurchaseItem(8, 8, "url8", "name8", "genre8");
        private PurchaseItem ninth = new PurchaseItem(9, 9, "url9", "name9", "genre9");
        private PurchaseItem tenth = new PurchaseItem(10, 10, "url10", "name10", "genre10");
        private PurchaseItem eleventh = new PurchaseItem(11, 11, "url11", "name11", "genre11");


    @BeforeEach
    public void setUp() {
        filmManager.add(first);
        filmManager.add(second);
        filmManager.add(third);
    }

    @Test
    public void shouldAddFilm() {
        PurchaseItem[] actual = filmManager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreFilm(){
        filmManager.add(fourth);

        PurchaseItem[] actual = filmManager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreTenFilm(){
        filmManager.add(fifth);
        filmManager.add(sixth);
        filmManager.add(seventh);
        filmManager.add(eighth);
        filmManager.add(ninth);
        filmManager.add(tenth);
        filmManager.add(eleventh);

        PurchaseItem[] actual = filmManager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

}