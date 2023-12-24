package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.InvalidWratingException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

public class PronounAndVerbService implements PronounAndVerbInterface, ConjugationsInterface {

    @Override
    public PronounAndVerbInterface conjugateWiyhPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conjugateWiyhPronoun'");
    }

    @Override
    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verbsAR'");
    }

    @Override
    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verbsER'");
    }

    @Override
    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verbsIR'");
    }

    @Override
    public ConjugatedVerb separateRoot(OnlyInfinitiveVerb onlyInfinitiveVerb) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'separateRoot'");
    }

    @Override
    public String separateEnding(OnlyInfinitiveVerb onlyInfinitiveVerb) {

        OnlyInfinitiveVerb infinitiveVerb = onlyInfinitiveVerb;

        if (infinitiveVerb.getInfinitive().length() >= 2) {
            String lastTwoLetters = infinitiveVerb.getInfinitive()
                    .substring(infinitiveVerb.getInfinitive().length() - 2);
            if (lastTwoLetters.equalsIgnoreCase("ar") || lastTwoLetters.equalsIgnoreCase("er") ||
                    lastTwoLetters.equalsIgnoreCase("ir")) {
                return lastTwoLetters;
            } else {
                throw new InvalidWratingException("Error al procesar '" + infinitiveVerb.getInfinitive() + "'");
            }

        } else {
            throw new ShortStringException("Error al procesar '" + infinitiveVerb.getInfinitive() + "'");
        }
    }

}
