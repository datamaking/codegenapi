package com.rfds.codegenapi.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "datatypemapping")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTypeMappingModel {

    private Long id;
    private String sqlDataType;
    private String hiveDataType;
}
