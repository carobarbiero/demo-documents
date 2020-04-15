package com.carob.demodocuments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "documento")
@Data
public class Document extends Auditable<String> {

    @Id
    @Column(name = "id_documento")
    private Long documentId;

    @Column(name = "id_cuenta")
    private Long accountId;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private DocumentType documentType;

    @Column(name = "referencia_documento")
    private String documentReference;

}
