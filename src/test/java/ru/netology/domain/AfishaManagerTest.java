package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();

    @Test
    void shouldShowTenthMovies() {
        Movie first = new Movie(1, "Бладшот", "Боевик", false);
        Movie second = new Movie(2,"Вперед", "Мультфильм",false);
        Movie third = new Movie(3,"Отель Белгард","Комедия",false);
        Movie fourth = new Movie(4,"Джентельмены", "Боевик",false);
        Movie fifth = new Movie(5,"Человек-невидимка", "Ужасы",false);
        Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм",true);
        Movie seventh = new Movie(7, "Номер Один", "Комедия",true);
        Movie eighth = new Movie (8, "Бэтмен" , "Боевик", true);
        Movie ninth = new Movie (9, "Человек-паук" , "Бевик", true);
        Movie tenth = new Movie(10, "Интерстеллар","Фантастика", false);
        Movie eleventh = new Movie(11, "Звездные войны","Фантастика", false);
        Movie twelve = new Movie(12, "Игра престолов","Фэнтези", false);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);
        afisha.add(eleventh);
        afisha.add(twelve);

        Movie[] expected = new Movie[]{twelve ,eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowAllMoves() {
        Movie first = new Movie(1, "Бладшот", "Боевик", false);
        Movie second = new Movie(2,"Вперед", "Мультфильм",false);
        Movie third = new Movie(3,"Отель Белгард","Комедия",false);
        Movie fourth = new Movie(4,"Джентельмены", "Боевик",false);
        Movie fifth = new Movie(5,"Человек-невидимка", "Ужасы",false);
        Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм",true);
        Movie seventh = new Movie(7, "Номер Один", "Комедия",true);
        Movie eighth = new Movie (8, "Бэтмен" , "Боевик", true);
        Movie ninth = new Movie (9, "Человек-паук" , "Бевик", true);
        Movie tenth = new Movie(10, "Интерстеллар","Фантастика", false);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowMoviesUnderTenth(){
        Movie first = new Movie(1, "Бладшот", "Боевик", false);
        Movie second = new Movie(2,"Вперед", "Мультфильм",false);
        Movie third = new Movie(3,"Отель Белгард","Комедия",false);
        Movie fourth = new Movie(4,"Джентельмены", "Боевик",false);
        Movie fifth = new Movie(5,"Человек-невидимка", "Ужасы",false);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);

        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    public void shouldShowMoviesUnderTenthCurrentMoviesLenght(){

        AfishaManager afisha = new AfishaManager(5);

        Movie first = new Movie(1, "Бладшот", "Боевик", false);
        Movie second = new Movie(2,"Вперед", "Мультфильм",false);
        Movie third = new Movie(3,"Отель Белгард","Комедия",false);
        Movie fourth = new Movie(4,"Джентельмены", "Боевик",false);
        Movie fifth = new Movie(5,"Человек-невидимка", "Ужасы",false);
        Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм",true);
        Movie seventh = new Movie(7, "Номер Один", "Комедия",true);
        Movie eighth = new Movie (8, "Бэтмен" , "Боевик", true);
        Movie ninth = new Movie (9, "Человек-паук" , "Бевик", true);
        Movie tenth = new Movie(10, "Интерстеллар","Фантастика", false);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, afisha.showMovies());
    }
}