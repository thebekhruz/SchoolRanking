package uz.schoolrank.schoolrank.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import uz.schoolrank.schoolrank.entity.template.AbsUUIDNoUser;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@Entity(name = "subject")
@Where(clause = "deleted=false")
@SQLDelete(sql = "UPDATE subject SET deleted=true WHERE id=?")
public class Subject extends AbsUUIDNoUser {

    @Column(nullable = false, name = "name", unique = true)
    private String name;

    @Column(nullable = false, name = "is_science")
    private boolean science;

}
