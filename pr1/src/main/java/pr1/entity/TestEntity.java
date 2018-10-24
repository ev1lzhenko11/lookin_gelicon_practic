package pr1.entity;


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TEST")
public class TestEntity {

    @Id
    @Column(name = "TEST_ID", nullable = false)

    @GeneratedValue(strategy = IDENTITY)

    private Integer id;


    @Column(name = "TEST_NAME", nullable = false, length = 50)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
