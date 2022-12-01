package ticket;

import data.ParkingSpot;
import data.Ticket;
import data.Vehicle;

public class TicketGenerator {

    public synchronized Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {

        String ticketNum = getUniqueTicketNum();

        // logic to check if isFree & then park & persist in DB
        return new Ticket(ticketNum, vehicle, parkingSpot);
    }

    private String getUniqueTicketNum(){
        return "";
    }
}
