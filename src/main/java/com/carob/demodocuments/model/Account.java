package com.carob.demodocuments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

//@Entity
//@Table(name = "cuenta")
@Data
public class Account {

    @Id
    @Column(name = "id_cuenta")
    private Long accountId;
    
    @Column(name = "id_estado_cuenta")
    private String accountStatus;
    
}
