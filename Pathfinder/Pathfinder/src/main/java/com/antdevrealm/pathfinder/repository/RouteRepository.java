package com.antdevrealm.pathfinder.repository;

import com.antdevrealm.pathfinder.model.enitty.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
