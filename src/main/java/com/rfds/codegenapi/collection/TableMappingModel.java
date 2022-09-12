package com.rfds.codegenapi.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableMappingModel {

    private String sourceTableId;
    private String sourceTableName;
    private String targetRawTableName;
    private List<TableColumnMappingModel> rawTableColumnMappingModel;
    private String targetSanitizedTableName;
    private List<TableColumnMappingModel> sanitizedTableColumnMappingModel;
    private String targetConformedTableName;
    private List<TableColumnMappingModel> conformedTableColumnMappingModel;
    private String targetFfpViewName;
    private List<TableColumnMappingModel> ffpTableColumnMappingModel;
    private String dependencyBoxName;
    private String ddlStatus;
    private String RawJsonFileStatus;
    private String RawConfFileStatus;
    private String RawJilFileStatus;
    private String SanitizedJsonFileStatus;
    private String SanitizedConfFileStatus;
    private String SanitizedJilFileStatus;
    private String ConformedJsonFileStatus;
    private String ConformedConfFileStatus;
    private String ConformedJilFileStatus;
    private String FfpJsonFileStatus;
    private String FfpConfFileStatus;
    private String FfpJilFileStatus;
    private String TcJsonFileStatus;
    private String TcJilFileStatus;
}
