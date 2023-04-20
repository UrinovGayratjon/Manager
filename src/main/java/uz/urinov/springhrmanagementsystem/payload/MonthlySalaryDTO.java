package uz.urinov.springhrmanagementsystem.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class MonthlySalaryDTO {
    @NotNull
    private UUID ownerId;
    @NotNull
    private Double amount;
    @NotNull
    private Integer monthId;
}
