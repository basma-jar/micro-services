package com.emsi.VoitureService.Repository;

import com.emsi.VoitureService.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
