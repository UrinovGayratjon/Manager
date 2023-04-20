package uz.urinov.springhrmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import uz.urinov.springhrmanagementsystem.entity.enums.InOutStatus;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InputOutput {
    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private InOutStatus status;

    @ManyToOne
    private User user;

    @CreatedDate
    private Timestamp createAt;

    public InputOutput(InOutStatus status, User user) {
        this.status = status;
        this.user = user;
    }
}
