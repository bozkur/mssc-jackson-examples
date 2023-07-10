package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@JsonTest
class BaseTest {

    @Autowired
    ObjectMapper objectMapper;
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
