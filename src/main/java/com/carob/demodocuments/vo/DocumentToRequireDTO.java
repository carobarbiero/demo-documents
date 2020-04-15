package com.carob.demodocuments.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentToRequireDTO {

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("document_type_id")
    private Long documentTypeId;

    @JsonProperty("document_type_code")
    private String documentTypeCode;

    @JsonProperty("document_type_description")
    private String documentTypeDescription;

    @JsonProperty("document_id")
    private Long documentId;

    @JsonProperty("is_mandatory")
    private boolean isMandatory;

    @JsonProperty("document_status_description")
    private String documentStatusDescription;

}
