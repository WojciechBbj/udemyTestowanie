import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    void testAssertArrayEquals() {

        //given
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {1, 2, 3};

        //when


        //then
        assertArrayEquals(ints1, ints2);
    }

    @Test
    void mealListShouldBeEmptyAfterCreationOfOrder () {

        //given
        Order order = new Order();

        //when
        //then
        assertThat(order.getMeals()).isEmpty();
        assertThat(order.getMeals().size()).isEqualTo(0);
        assertThat(order.getMeals()).hasSize(0);

        //then
    }

    @Test
    void addingMealToOrderShouldIncreaseOrderSize() {

        //given
        Meal meal = new Meal(20, "Pizza");
        Meal meal2 = new Meal(15, "Burger");
        Order order = new Order();

        //when
        order.addMealToOrder(meal);

        //given
        assertThat(order.getMeals().size()).isEqualTo(1);
        assertThat(order.getMeals()).contains(meal);
        assertThat(order.getMeals().get(0).getPrice()).isEqualTo(20);

        //then
    }

    @Test
    void removeFromOrderShouldDecreaseOrderSize () {

        //given
        Meal meal = new Meal(20, "Pizza");
        Order order = new Order();

        //when
        order.addMealToOrder(meal);
        order.removeMealFromOrder(meal);

        //then
        assertThat(order.getMeals().size()).isEqualTo(0);
        assertThat(order.getMeals()).doesNotContain(meal);
    }

    @Test
    void mealsShouldBeInCorrectOrderAfterAddingThemToOrder() {

        //given
        Meal meal = new Meal(20, "Pizza");
        Meal meal2 = new Meal(15, "Burger");
        Order order = new Order();

        //when
        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);

        //then
        assertThat(order.getMeals()).containsExactly(meal, meal2);
    }

    @Test
    void testIfMealListsAreTheSame() {

        //given
        Meal meal = new Meal(20, "Pizza");
        Meal meal2 = new Meal(15, "Burger");
        Meal meal3 = new Meal(11, "Sandwich");

        List<Meal> meals1= Arrays.asList(meal, meal2);
        List<Meal> meals2= Arrays.asList(meal, meal2);

        //when

        //then
        assertThat(meals1).isEqualTo(meals2);


    }

}