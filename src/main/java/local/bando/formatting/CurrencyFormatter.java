package local.bando.formatting;


import java.text.NumberFormat;
import java.util.*;

public final class CurrencyFormatter {
    private static final Map<String, Locale> availableLocales;

    static {
        availableLocales = new HashMap<>();
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale locale : locales) {
            availableLocales.put(locale.getCountry(), locale);
        }
    }


    public static String formattedCcy(final double ccyAmount, final String lang, final String country) {
        final Locale locale = getLocale(lang, country);
        return formattedCcy(ccyAmount, locale);
    }

    public static String formattedCcy(final double ccyAmount, Locale locale) {
        final NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(ccyAmount);
    }

    private static Locale getLocale(final String lang, final String country) {
        Locale locale = availableLocales.get(country);
        if(locale == null) {
            locale = new Locale(lang, country);
            availableLocales.putIfAbsent(country, locale);
        }
        return locale;
    }
}
