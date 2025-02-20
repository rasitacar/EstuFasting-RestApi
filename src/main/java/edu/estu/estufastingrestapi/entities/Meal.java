package edu.estu.estufastingrestapi.entities;

import edu.estu.estufastingrestapi.core.model.constants.validation.SizeOf;
import edu.estu.estufastingrestapi.core.model.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_meal")
public class Meal extends BaseEntity<Integer> {

    @Id
    @Column(name = "id_meal", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "uq_name", nullable = false, length = SizeOf.Text.Max.CUSTOMER_TYPE_NAME)
    private String name;

    @Column(name = "dt_start", nullable = false)
    private LocalTime start;

    @Column(name = "dt_end", nullable = false)
    private LocalTime end;
}
