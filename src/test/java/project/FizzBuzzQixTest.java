package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }
    @Test
    public void threeAndSixReturnFizz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(3);
        String otherSpokenWord = underTest.interpret(6);
        assertThat(spokenWord).isEqualTo("Fizz");
        assertThat(otherSpokenWord).isEqualTo("Fizz");
    }
}
