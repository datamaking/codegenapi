package com.rfds.codegenapi.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Data
@Builder
@Document(collection = "request")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestModel {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String requestId;
    private String sourceSystem;
    private String targetSystem;
    private String sourceDatabase;
    private String targetDatabase;
    private String type;
    private List<TableMappingModel> tableMappingModel;
    private boolean ddlFlag;
}
