package org.example.strategy;

public final class KayakStrategy implements Strategy {
    public Hotel convert(Hotel hotel) {
        return new Hotel(hotel.getName(), hotel.getCost());
    }
}
