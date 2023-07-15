package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
class BeerDtoSnakeTest extends BaseTest {

    @Test
    void shouldSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void shouldDeserializeDto() throws JsonProcessingException {
        String json = "{\"created_date\":\"2023-07-10T23:48:28.1611186+03:00\",\"last_modified_date\":\"2023-07-10T23:48:28.1611186+03:00\",\"beerId\":\"552c42e4-b15b-4107-b7a3-d43d4a16fb0d\",\"beer_name\":\"Efes Dark\",\"beer_style\":\"Lager\",\"upc\":123,\"price\":9.99}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}
