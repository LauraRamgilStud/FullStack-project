package day1.day1demo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
//------------------------
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "player_name", nullable = false, length = 50)
    private String name;
    @Column(name = "player_country", nullable = false, length = 50)
    String country;
    @Column(name = "player_position", nullable = false, length = 50)
    String position;
    public  Player(String name, String country, String position) {
        this.name = name;
        this.country = country;
        this.position = position;
    }
}
