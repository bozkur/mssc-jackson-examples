package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

class BaseTest {
    BeerDto getDto() {
       return BeerDto.builder()
                .beerName("Efes Dark")
                .beerStyle("Lager")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("9.99"))
                .upc(123L)
                .build();
    }
}
