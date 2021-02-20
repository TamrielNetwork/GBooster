package com.tamrielnetwork.gbooster.gbooster.boosters;

import org.bukkit.configuration.ConfigurationSection;

import java.util.Objects;

public class Booster {

    private final String id;
    private final BoosterType boosterType;
    private final double multiplier;
    private final int duration;

    public Booster(String id, ConfigurationSection section){
        this.id = id;
        this.boosterType = BoosterType.valueOf(Objects.requireNonNull(section.getString("type")).toUpperCase());
        this.multiplier = section.getDouble("multiplier");
        this.duration = section.getInt("duration");
    }

    public String getId() {
        return id;
    }

    public BoosterType getBoosterType() {
        return boosterType;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public int getDuration() {
        return duration;
    }
}