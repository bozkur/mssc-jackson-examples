package guru.springframework.msscjacksonexamples.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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
}
