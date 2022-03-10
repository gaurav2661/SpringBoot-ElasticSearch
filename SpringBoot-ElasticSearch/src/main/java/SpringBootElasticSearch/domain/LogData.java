package SpringBootElasticSearch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "logdata")
@Data
public class LogData {
        @Id
        private String id;

        @Field(type = FieldType.Text, name = "host")
        private String host;


        @Field(type = FieldType.Text, name = "message")
        private String message;

        @Field(type = FieldType.Double, name = "size")
        private double size;

        @Field(type = FieldType.Text, name = "status")
        private String status;

        // Getters and Setters


}
