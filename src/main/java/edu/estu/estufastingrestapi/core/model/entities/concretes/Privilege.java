package edu.estu.estufastingrestapi.core.model.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.estu.estufastingrestapi.core.model.constants.validation.SizeOf;
import edu.estu.estufastingrestapi.core.model.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_privilege", uniqueConstraints = @UniqueConstraint(columnNames = "uq_name", name = "uk_privilege_name"))
@SQLDelete(sql = "UPDATE tb_privilege SET is_deleted = '1' WHERE id_privilege=?")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Privilege extends BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_privilege", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "uq_name", nullable = false, length = SizeOf.Text.Max.PRIVILEGE_NAME)
    private String name;

    @Column(name = "tx_description", nullable = false, length = SizeOf.Text.Max.PRIVILEGE_DESC)
    private String description;

}
