package cloud.example.java.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.OffsetDateTime;


@Entity
@Table(name = "users", schema = "users")
@Data
public class User {
    @Id
    Long id;
    String userName;
    OffsetDateTime createdAt;
}
