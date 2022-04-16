package task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJacketTest {

    @Test
    void shouldBeEmptyByDefault() {
        //given
        MyJacket jacket = new MyJacket(10);

        //when
        boolean loaded = jacket.isLoaded();

        //then
        assertFalse(loaded);
    }

    @Test
    void shouldNotBeEmptyByDefault() {
        //given
        MyJacket jacket = new MyJacket(10);
        jacket.loadBullet("Pierwszy naboj");

        //when
        boolean loaded = jacket.isLoaded();

        //then
        assertTrue(loaded);
    }

    @Test
    void shouldShot() {
        //given
        MyJacket jacket = new MyJacket(10);
        String bullet = "Pierwszy naboj";
        jacket.loadBullet(bullet);

        //when
        String shot = jacket.shot();

        //then
        assertEquals(bullet, shot);
    }


    @Test
    void shouldNotShotIfBulletIsEmpty() {
        //given
        MyJacket jacket = new MyJacket(10);

        //when
        String shot = jacket.shot();

        //then
        assertEquals(IBullet.EMPTY, shot);
    }

    @Test
    void shouldThrowsExceptionWhenTryToLoadFullJacket() {
        int maxSize = 8;
        MyJacket jacket = new MyJacket(maxSize);

        for(int i = 0; i< maxSize; i++) {
            jacket.loadBullet(String.valueOf(i));
        }

        assertThrows(Exception.class, () -> jacket.loadBullet("8")); // trzeba zaimplementowac lambda interfejs Runnable
//         z metodą run()
    }

    @Test

    void shouldShotInFiloOrder() {
        //given
        MyJacket jacket = new MyJacket();
        String bullet1 = "Pierwszy nabój";
        jacket.loadBullet(bullet1);
        String bullet2 = "Drugi nabój";
        jacket.loadBullet(bullet2);
        String bullet3 = "Trzeci nabój";
        jacket.loadBullet(bullet3);

        //when
        //then
        assertEquals(bullet3, jacket.shot());
        assertEquals(bullet2, jacket.shot());
        assertEquals(bullet1, jacket.shot());

    }
}