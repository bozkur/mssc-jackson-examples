package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void shouldSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }
    
    @Test
    void shouldDeserializeDto() throws JsonProcessingException {
        String json = "{\"createdDate\":\"2023-07-10T23:36:08.4551524+03:00\",\"lastModifiedDate\":\"2023-07-10T23:36:08.4551524+03:00\",\"beerId\":\"e9e701d6-8776-4912-9c68-0e54585b13b9\",\"beerName\":\"Efes Dark\",\"beerStyle\":\"Lager\",\"upc\":123,\"price\":9.99}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}