package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.CompleteConjugation;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;

public interface CompleteConjugationInterface {
    public CompleteConjugation conjugate(OnlyInfinitiveVerb onlyInfinitiveVerb);
}
