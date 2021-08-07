package thiago.example.cloud.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author thiagop
 * @date 2021-08-07
 */
@Document
@Data
@Builder
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;
}
