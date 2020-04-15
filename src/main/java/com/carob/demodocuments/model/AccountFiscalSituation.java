package com.carob.demodocuments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

//@Entity
//@Table(name = "doc_situacion_fiscal_cuenta")
@Data
public class AccountFiscalSituation extends Auditable<String> {

    @Id
    @Column(name = "id_situacion_fiscal")
    private Long accountFiscalSituation;

    @Column(name = "id_documento")
    private Long documentId;

    @Column(name = "id_estado_documento")
    private String documentStateId;

}
