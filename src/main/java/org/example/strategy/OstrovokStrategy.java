package org.example.strategy;

public final class OstrovokStrategy implements Strategy {
    public Hotel convert(Hotel hotel) {
        var ostrovokFee = 0.12; // Plus 12 percents
        var baseCost = hotel.getCost();

        return new Hotel(
                hotel.getName(),
                baseCost + baseCost * ostrovokFee
        );
    }
}
