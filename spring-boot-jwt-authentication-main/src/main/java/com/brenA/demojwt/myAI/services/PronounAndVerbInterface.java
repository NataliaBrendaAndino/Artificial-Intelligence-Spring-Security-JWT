package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public interface PronounAndVerbInterface {

    public PronounAndVerbInterface conjugateWithPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb);

}
