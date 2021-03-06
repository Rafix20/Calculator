import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainTest {

    //dodawanie
    @Test
    public void TwoPlusTwoShouldReturnFour() {
        Main main = new Main(2, 2);
        assertEquals(4, main.add());
    }
    @Test
    public void FivePlusZeroShouldReturnFive() {
        Main main = new Main(5, 0);
        assertEquals(5, main.add());
    }
    @Test
    public void ThreePlusMinusOneShouldReturnTwo() {
        Main main = new Main(3, -1);
        assertEquals(2, main.add());
    }
    @Test
    public void MinusFourPlusTwoShouldReturnMinusTwo() {
        Main main = new Main(-4, 2);
        assertEquals(-2, main.add());
    }


    //odejmowanie
    @Test
    public void FourMinusThreeShouldReturnOne() {
        Main main = new Main(4, 3);
        assertEquals(1, main.sub());
    }
    @Test
    public void TwoMinusZeroShouldReturnTwo() {
        Main main = new Main(2, 0);
        assertEquals(2, main.sub());
    }
    @Test
    public void FiveMinusMinusSevenShouldReturnMinusTwelve() {
        Main main = new Main(5, -7);
        assertEquals(12, main.sub());
    }
    @Test
    public void MinusEightMinusFiveShouldReturnMinusThirteen() {
        Main main = new Main(-8, 5);
        assertEquals(-13, main.sub());
    }


    //mnożenie
    @Test
    public void FiveMultiplyByThreeShouldReturnFifteen() {
        Main main = new Main(5, 3);
        assertEquals(15, main.multi());
    }
    @Test
    public void SevenMultiplyByZeroShouldReturnZero() {
        Main main = new Main(7, 0);
        assertEquals(0, main.multi());
    }
    @Test
    public void MinusTwoMultiplyByMinusFourShouldReturnEight() {
        Main main = new Main(-2, -4);
        assertEquals(8, main.multi());
    }
    @Test
    public void MinusSixMultiplyByTwoShouldReturnMinusTwelve() {
        Main main = new Main(-6, 2);
        assertEquals(-12, main.multi());
    }


    //dzielenie
    @Test
    public void FifteenDivideByThreeShouldReturnFive() {
        Main main = new Main(15, 3);
        assertEquals(5, main.div());
    }
    @Test
    public void SixDivideByZeroShouldReturnNothing() {
        Main main = new Main(6, 0);
        assertNull(main.div());
    }
    @Test
    public void MinusTwoDivideByOneShouldReturnMinusTwo() {
        Main main = new Main(-2, 1);
        assertEquals(-2, main.div());
    }
    @Test
    public void MinusFourixDivideByminusOneShouldReturnFour() {
        Main main = new Main(-4, -1);
        assertEquals(4, main.div());
    }


    //do potęgi
    @Test
    public void SixRaiseToSecondPowerShouldReturnThirtySix(){
        Main main = new Main(6,2);
        assertEquals(36,main.power());
    }
    @Test
    public void MinusFourRaiseToFifthPowerShouldReturnMinusSixtyFour(){
        Main main = new Main(-4,3);
        assertEquals(-64,main.power());
    }
    @Test
    public void MinusThreeRaiseToMinusFourthPowerShouldReturnMinusZeroPointZeroOneRounded(){
        Main main = new Main(-3,-4);
        assertEquals(-0.01,main.power());
    }
    @Test
    public void EightRaiseToZeroPowerShouldReturnOne(){
        Main main = new Main(8,0);
        assertEquals(1,main.power());
    }


    //z pierwiastka kwadratowego
    @Test
    public void SquareRootOfFourShouldReturnTwo(){
        Main main = new Main(4);
        assertEquals(2,main.squareroot());
    }
    @Test
    public void SquareRootOfMinusSevenShouldReturnError(){
        Main main = new Main(-7);
        assertEquals("Error",main.squareroot());
    }
    @Test
    public void SquareRootOfZeroShouldReturnZero(){
        Main main = new Main(0);
        assertEquals(0,main.squareroot());
    }
    @Test
    public void SquareRootOfOneShouldReturnOne(){
        Main main = new Main(1);
        assertEquals(1,main.squareroot());
    }

}



