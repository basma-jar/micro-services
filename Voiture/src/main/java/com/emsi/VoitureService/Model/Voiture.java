package com.emsi.VoitureService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {



    @Id
    @GeneratedValue
    private Long Id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;
    @Transient
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;




}

