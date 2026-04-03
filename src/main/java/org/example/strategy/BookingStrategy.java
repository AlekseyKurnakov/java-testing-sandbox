package org.example.strategy;

public final class BookingStrategy implements Strategy {
    public Hotel convert(Hotel hotel) {
        double bookingConvertRate = 75; // Booking exchange rate

        return new Hotel(
                hotel.getName(),
                hotel.getCost() * 75
        );
    }
}
