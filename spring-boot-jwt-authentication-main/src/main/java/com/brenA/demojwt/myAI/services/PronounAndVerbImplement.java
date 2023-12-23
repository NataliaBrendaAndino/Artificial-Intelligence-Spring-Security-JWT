package com.brenA.demojwt.myAI.services.Implements;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.services.ConjugationsService;
import com.brenA.demojwt.myAI.services.PronounAndVerbService;

public class PronounAndVerbImplements implements PronounAndVerbService, ConjugationsService {

    @Override
    public PronounAndVerbService conjugateWiyhPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb) {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'separateEnding'");
    }

}
