package com.rfds.codegenapi.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableColumnMappingModel {

    private String sourceTableColumnId;
    private String sourceTableColumnName;
    private String sourceTableColumnDataType;
    private String targetTableColumnName;
    private String targetTableColumnDataType;
    private boolean isPrimaryKeyColumn;
}
