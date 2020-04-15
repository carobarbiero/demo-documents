package com.carob.demodocuments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipo")
@Data
public class DocumentType {

    @Id
    @Column(name = "id_tipo")
    private Long typeId;
    
    @Column(name = "codigo")
    private String typeCode;
    
    @Column(name = "descripcion")
    private String typeDescripcion;

}
