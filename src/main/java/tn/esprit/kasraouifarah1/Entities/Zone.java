package tn.esprit.kasraouifarah1.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity

public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
   private String  ref;
   private Float dimension;
   @OneToMany()
    List<Personnel> personnels;
   @OneToOne(mappedBy = "zone1")
    private Personnel personnel;
   @ManyToOne
    private Parking parking;

}
