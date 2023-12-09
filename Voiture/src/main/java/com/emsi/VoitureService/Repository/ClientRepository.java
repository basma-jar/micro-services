package com.emsi.VoitureService.Repository;

import com.emsi.VoitureService.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client,Long> {
}
