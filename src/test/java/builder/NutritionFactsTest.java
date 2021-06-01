package builder;

import org.junit.Assert;
import org.junit.Test;

public class NutritionFactsTest {
	@Test
	public void testNutritionBuilder() {
		NutritionFacts facts = new NutritionFacts.Builder(1, 2)
				.carbohydrates(100)
				.calories(500)
				.sodium(10)
				.fat(2)
				.build();

		Assert.assertEquals(facts.getServings(), 2);
		Assert.assertEquals(facts.getServingSize(), 1);
		Assert.assertEquals(facts.getCarbohydrates(), 100);
		Assert.assertEquals(facts.getCalories(), 500);
		Assert.assertEquals(facts.getSodium(), 10);
		Assert.assertEquals(facts.getFat(), 2);
	}
}
