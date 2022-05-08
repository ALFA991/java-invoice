package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BottleOfWine extends Product {
    private final static BigDecimal akcyza = BigDecimal.valueOf(5.56);

    public BottleOfWine(String name, BigDecimal price) {
        super(name, price, new BigDecimal("0.23"));
    }

    @Override
    public BigDecimal getPriceWithTax() {
        BigDecimal priceWithTaxAndAkcyza = price;
        return priceWithTaxAndAkcyza = price.multiply(taxPercent).add(price).add(akcyza);
    }
}
