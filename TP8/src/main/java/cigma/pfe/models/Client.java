package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String name;

    public Client(String name) {
        this.name = name;
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client() {
    }
}
