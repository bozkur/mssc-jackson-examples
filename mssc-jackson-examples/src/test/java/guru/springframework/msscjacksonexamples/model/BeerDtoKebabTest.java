package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebabTest extends BaseTest {

    @Test
    void shouldSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void shouldDeserializeDto() throws JsonProcessingException {
        String json = "{\"created-date\":\"2023-07-10T23:48:28.1611186+03:00\",\"last-modified-date\":\"2023-07-10T23:48:28.1611186+03:00\",\"id\":\"552c42e4-b15b-4107-b7a3-d43d4a16fb0d\",\"beer-name\":\"Efes Dark\",\"beer-style\":\"Lager\",\"upc\":123,\"price\":9.99}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}
