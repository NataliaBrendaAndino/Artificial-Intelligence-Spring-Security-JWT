package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public interface ConjugationsInterface {

    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot);

    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot);

    public String separateRoot(OnlyInfinitiveVerb onlyInfinitiveVerb);

    public String separateEnding(OnlyInfinitiveVerb onlyInfinitiveVerb);

    public ConjugatedVerb firstPersonSingular(String rootVerb);

    public ConjugatedVerb secondPersonSingularAR(String pronoun, String rootVerb);

    public ConjugatedVerb thirdPersonSingularAR(String rootVerb);

    public ConjugatedVerb firstPersonPluralAR(String rootVerb);

    public ConjugatedVerb secondPersonPluralAR(String pronoun, String rootVerb);

    public ConjugatedVerb thirdPersonPluralAR(String rootVerb);

    public ConjugatedVerb secondPersonSingularER(String pronoun, String rootVerb);

    public ConjugatedVerb thirdPersonSingularErIr(String rootVerb);

    public ConjugatedVerb firstPersonPluralER(String rootVerb);

    public ConjugatedVerb secondPersonPluralER(String pronoun, String rootVerb);

    public ConjugatedVerb thirdPersonPluralErIr(String rootVerb);

    public ConjugatedVerb secondPersonSingularIR(String pronoun, String rootVerb);

    public ConjugatedVerb firstPersonPluralIR(String rootVerb);

    public ConjugatedVerb secondPersonPluralIR(String pronoun, String rootVerb);

}
