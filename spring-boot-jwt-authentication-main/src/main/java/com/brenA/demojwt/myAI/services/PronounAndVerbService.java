package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

public class PronounAndVerbService implements PronounAndVerbInterface, ConjugationsInterface {

    @Override
    public PronounAndVerbInterface conjugateWiyhPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'conjugateWiyhPronoun'");
    }

    @Override
    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot) {
        throw new UnsupportedOperationException("Unimplemented method 'verbsAR'");
    }

    @Override
    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot) {
        throw new UnsupportedOperationException("Unimplemented method 'verbsER'");
    }

    @Override
    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot) {
        throw new UnsupportedOperationException("Unimplemented method 'verbsIR'");
    }

    @Override
    public String separateRoot(OnlyInfinitiveVerb onlyInfinitiveVerb) {
        OnlyInfinitiveVerb infinitiveVerb = onlyInfinitiveVerb;
        String verb = infinitiveVerb.getInfinitive();
        String root = verb.substring(0, verb.length() - 2);
        return root;
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
                throw new InvalidWordException("Error processing '" + infinitiveVerb.getInfinitive() + "'");
            }

        } else {
            throw new ShortStringException("Error processing '" + infinitiveVerb.getInfinitive() + "'");
        }
    }

}
