package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;
    @JsonProperty("beerId")
    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String beerName;
    @NotNull
    private String beerStyle;
    @NotNull
    @Positive
    private Long upc;
    @NotNull
    @Positive
    private BigDecimal price;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate myLocalDate;
}
