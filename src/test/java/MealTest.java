import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;


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
        assertThat(meal2).isSameAs(meal1);

    }

    @Test
    void referencesToDifferentObjectsShouldNotBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = new Meal(15);

        //when
        //then
        assertThat(meal2).isNotSameAs(meal1);

    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal1 = new Meal(15, "Pizza");
        Meal meal2 = new Meal(15, "Pizza");

        //when
        //then
        assertThat(meal2).isEqualTo(meal1);
    }
}