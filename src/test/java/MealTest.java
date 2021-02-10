import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {

        //given
        Meal newMeal = new Meal(15);

        //when
        int discountedPrice = newMeal.getDiscountedPrice(5);

        //then
        assertThat(discountedPrice).isEqualTo(10);
    }

    @Test
    void referencesToTheSameObjectShouldBeEqual() {

        //given
        Meal meal1 = new Meal(30);
        Meal meal2 = meal1;

        //when
        //them
        assertSame(meal1, meal2);

    }

    @Test
    void referencesToDifferentObjectsShouldNotBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = new Meal(15);

        //when
        //then
        assertNotSame(meal1, meal2);

    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal1 = new Meal(15, "Pizza");
        Meal meal2 = new Meal(15, "Pizza");

        //when
        //then
        assertEquals(meal1, meal2, "Checking if two meals are equal");
    }
}