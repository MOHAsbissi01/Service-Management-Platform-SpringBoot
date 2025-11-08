package tn.esprit.foyer.services;

import tn.esprit.foyer.entities.Reservation;
import tn.esprit.foyer.repositories.ReservationRepository;

import java.util.List;

public class ReservationServiceImpl implements IReservationService{

    ReservationRepository Resrep;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public void DeleteReservation(Long idReservation) {

    }

    @Override
    public Reservation getReservation(Long idReservation) {
        return null;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return List.of();
    }

    @Override
    public List<Reservation> addAllReservations(List<Reservation> reservations) {
        return List.of();
    }
}
