package com.cydercode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@Import(ExampleApp.class)
public class ExampleServiceTest {

    @Autowired
    private ExampleService service;

    @Test
    public void shouldConvertText() {
        // given
        String text = "my text";

        // when
        String result = service.convertText(text);

        // then
        assertThat(result).isEqualTo(text.toUpperCase());
    }
}