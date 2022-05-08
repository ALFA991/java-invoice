package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FuelCanister extends Product {
    private final static BigDecimal akcyza = BigDecimal.valueOf(5.56);
    private static java.time.format.DateTimeFormatter DateTimeFormatter;
    public String format(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        return formattedDateTime;
    }
    public FuelCanister(String name, BigDecimal price) {
        super(name, price, new BigDecimal("0.23"));
    }

    @Override
    public BigDecimal getPriceWithTax() {
        BigDecimal priceWithTaxAndAkcyza = price;
        String date = format();
        if (date.contains("05-08")) {
            return priceWithTaxAndAkcyza = price;
        }else {
            return priceWithTaxAndAkcyza = price.multiply(taxPercent).add(price).add(akcyza);
        }


    }
}
