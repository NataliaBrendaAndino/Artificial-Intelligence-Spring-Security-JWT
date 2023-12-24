package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public interface ConjugationsInterface {

    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot);

    public String separateRoot(OnlyInfinitiveVerb onlyInfinitiveVerb);

    public String separateEnding(OnlyInfinitiveVerb onlyInfinitiveVerb);
}
