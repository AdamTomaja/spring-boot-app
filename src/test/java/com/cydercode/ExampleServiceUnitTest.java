package com.cydercode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleServiceUnitTest {

    @Test
    public void shouldUpperCase() {
        // given
        ExampleService service = new ExampleService();
        String text = "some test text";

        // when
        String result = service.convertText(text);

        // then
        assertThat(result).isEqualTo(text.toUpperCase());
    }
}
