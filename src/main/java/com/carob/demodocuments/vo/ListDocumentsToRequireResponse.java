package com.carob.demodocuments.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class ListDocumentsToRequireResponse {

    private ResultResponse result;

    @JsonProperty("account_documents")
    private List<DocumentToRequireDTO> accountDocuments;

}
