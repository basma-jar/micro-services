package org.EMSI.ClientService.Repository;

import org.EMSI.ClientService.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface clientRepository extends JpaRepository<Client,Long > {
}
