package com.brenA.demojwt.myAI.services;

import org.springframework.stereotype.Service;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.FatalException;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;

@Service
public class PronounAndVerbService implements PronounAndVerbInterface {

    private final ConjugationsService conjugationsService;

    public PronounAndVerbService(ConjugationsService conjugationsService) {
        this.conjugationsService = new ConjugationsService();
    }

    @Override
    public PronounAndVerb conjugateWithPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb) {

        PronounAndVerb pronounAndVerb = new PronounAndVerb();

        if (conjugationsService.separateEnding(onlyInfinitiveVerb).equalsIgnoreCase("ar")) {
            String root = conjugationsService.separateRoot(onlyInfinitiveVerb);
            pronounAndVerb = conjugationsService.verbsAR(pronoun, root);
            return pronounAndVerb;
        } else if (conjugationsService.separateEnding(onlyInfinitiveVerb).equalsIgnoreCase("er")) {
            String root = conjugationsService.separateRoot(onlyInfinitiveVerb);
            pronounAndVerb = conjugationsService.verbsER(pronoun, root);
            return pronounAndVerb;
        } else if (conjugationsService.separateEnding(onlyInfinitiveVerb).equalsIgnoreCase("ir")) {
            String root = conjugationsService.separateRoot(onlyInfinitiveVerb);
            pronounAndVerb = conjugationsService.verbsIR(pronoun, root);
            return pronounAndVerb;
        } else {
            throw new FatalException("Error processing pronoun '" + pronoun.toString() + "' and verb' "
                    + onlyInfinitiveVerb.getInfinitive() + "'");
        }
    }
}
