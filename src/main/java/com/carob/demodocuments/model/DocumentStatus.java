package com.carob.demodocuments.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

//@Entity
//@Table(name = "estado_documento")
@Data
public class DocumentStatus {

    @Id
    @Column(name = "id_estado")
    private Long statusId;

    @Column(name = "id_documento")
    private Long documentId;
}
