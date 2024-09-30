package com.warmup.step3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarRacingTest {
    @ParameterizedTest
    @CsvSource(value = {"1:false", "3:false", "4:true", "5:true"}, delimiter = ':')
    public void isEquals_4이상의_숫자는_TRUE_그외의_숫자는_FALSE(int number, boolean expected) {
        assertThat(CarRacing.isForward(number)).isEqualTo(expected);
    }
}
