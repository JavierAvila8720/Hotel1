package com.reservation.hotelsJuan.mgnreservation.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Data
@Entity
@Table(name = "Hotels")
public class Hotel implements Serializable {

    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "number_suits")
    private Integer numberSuits;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "date_init",  updatable = false, nullable = false)
    private Date dateInit;

}







