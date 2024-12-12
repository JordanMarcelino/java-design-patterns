package jordan.marcelino.design.patterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void testBuilder() {
        Bar barFromScratch = Bar.builder()
                .build();

        Bar barFromScratchFilled = Bar.builder()
                .baz("baz")
                .build();

        Bar barFromBuilder = barFromScratchFilled.toBuilder()
                .build();

        Bar barFromBuilderModified = barFromScratchFilled.toBuilder()
                .baz("modified baz")
                .build();

        // Verify that initialized builder always have null values
        Assertions.assertNull(barFromScratch.getBaz());

        // Verify that builder that built has the correct properties
        Assertions.assertEquals("baz", barFromScratchFilled.getBaz());

        // Verify that toBuilder makes a new object
        Assertions.assertNotSame(barFromScratch, barFromBuilder);
        Assertions.assertNotSame(barFromScratchFilled, barFromBuilderModified);

        // Verify that toBuilder retains property value from old object
        Assertions.assertEquals("baz", barFromBuilder.getBaz());
        Assertions.assertEquals("modified baz", barFromBuilderModified.getBaz());
    }

    @Test
    void testBuilderScenario() {
        Bar bar = new Bar("baz");
        Bar barToUpdate = bar.toBuilder().build();

        barToUpdate.setBaz("");

        Assertions.assertEquals("baz", bar.getBaz());
        Assertions.assertEquals("", barToUpdate.getBaz());
        Assertions.assertNotSame(bar, barToUpdate);
    }
}
