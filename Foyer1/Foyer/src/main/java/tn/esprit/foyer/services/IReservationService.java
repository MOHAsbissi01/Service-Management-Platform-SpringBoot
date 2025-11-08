package tn.esprit.foyer.services;


import tn.esprit.foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public Reservation UpdateReservation(Reservation reservation);
    public void DeleteReservation(Long idReservation);
    public Reservation getReservation(Long idReservation);
    public List<Reservation> getAllReservations();
    public List<Reservation>addAllReservations(List<Reservation> reservations);

}
