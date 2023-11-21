package com.reservation.hotelsJuan.mgnreservation.entity;



import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "Suites")
public class Suite {

        @Id
        @Column(name = "id", length = 50)
        private String id;

        @Column(name = "name", length = 255, nullable = false)
        private String name;

        @Column(name = "number")
        private int number;

        @Column(name = "status", length = 255)
        private String status;

        @ManyToOne
        @JoinColumn(name = "hotel", referencedColumnName = "id", insertable = false, updatable = false)
        private Hotel hotel;

        @Column(name = "price")
        private int price;

        @Column(name = "date_status")
        private LocalDate dateStatus;


}

