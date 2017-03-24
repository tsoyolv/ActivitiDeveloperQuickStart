package com.olts.registration.api;

import java.util.UUID;

/**
 * o.tsoy
 * 23.03.2017
 */
public class GlobalIdGenerator {

    // todo fix to normal unique generation
    public static int generateId() {
        return Math.abs(UUID.randomUUID().hashCode());
    }
}
