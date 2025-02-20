package edu.estu.estufastingrestapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.estu.estufastingrestapi.core.model.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_reservation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reservation extends BaseEntity<UUID> {

    @Id
    @Column(name = "id_reservation", nullable = false)
    @GeneratedValue
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rf_service", nullable = false, foreignKey = @ForeignKey(name = "fk_reservation_service"))
    private Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rf_customer", nullable = false, foreignKey = @ForeignKey(name = "fk_reservation_customer"))
    private Customer customer;

}
