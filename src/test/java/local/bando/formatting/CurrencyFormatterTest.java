package local.bando.formatting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyFormatterTest {
    @Test
    void testUSDFormat() {
        Assertions.assertEquals( "$12,324.13", CurrencyFormatter.formattedCcy(12324.13, "en", "us"));
    }

    @Test
    void testINRFormat() {
        Assertions.assertEquals( "Rs.12,324.13", CurrencyFormatter.formattedCcy(12324.13, "en", "in"));
    }

    @Test
    void testCHNFormat() {
        Assertions.assertEquals( "￥12,324.13", CurrencyFormatter.formattedCcy(12324.13, Locale.CHINA));
    }

    @Test
    void testFRANCEFormat() {
        Assertions.assertEquals( "12 324,13 €", CurrencyFormatter.formattedCcy(12324.13, Locale.FRANCE));
    }

}