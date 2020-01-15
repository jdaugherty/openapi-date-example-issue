package date.issue.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@JsonView
@NoArgsConstructor
@Entity
@Table(name = "pet")
@Schema(description = "describes a pet")
@EqualsAndHashCode(of= {"id"} )
@ToString(of= {"id"} )
@Introspected
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    Long id;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX", timezone = "Z")
    @Schema(description = "birthdate field description here", example = "2020-07-21T17:32:28Z", type = "string", format = "date-time")
    @Column(name = "birthdate")
    ZonedDateTime birthdate;
}
