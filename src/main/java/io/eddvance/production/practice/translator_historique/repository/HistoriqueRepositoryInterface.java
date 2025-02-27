package io.eddvance.production.practice.translator_historique.repository;

import io.eddvance.production.practice.translator_historique.entity.historique.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueRepositoryInterface extends JpaRepository<Historique, Long> {
}
