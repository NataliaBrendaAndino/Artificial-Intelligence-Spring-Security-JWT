package com.brenA.demojwt.myAI.enums;

import com.brenA.demojwt.myAI.exceptions.InvalidPronounException;

public enum Pronoun {
    YO,
    TÚ,
    VOS,
    USTED,
    ÉL,
    ELLA,
    NOSOTROS,
    NOSOTRAS,
    VOSOTROS,
    VOSOTRAS,
    USTEDES,
    ELLOS,
    ELLAS;

    public static Pronoun fromString(String input) {
        for (Pronoun pronoun : Pronoun.values()) {
            if (pronoun.name().equalsIgnoreCase(input)) {
                return pronoun;
            }
        }
        throw new InvalidPronounException("Error processing '" + input + "'. Please try again.");
    }
}