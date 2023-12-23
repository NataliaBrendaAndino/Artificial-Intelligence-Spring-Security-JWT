package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public interface PronounAndVerbService {

    public PronounAndVerbService conjugateWiyhPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb);

    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot);
}
