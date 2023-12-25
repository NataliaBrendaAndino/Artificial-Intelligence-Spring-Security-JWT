package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.CompleteConjugation;
import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public class CompleteConjugationService implements CompleteConjugationInterface, ConjugationsInterface {

    @Override
    public CompleteConjugation conjugate(OnlyInfinitiveVerb onlyInfinitiveVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'conjugate'");
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
        throw new UnsupportedOperationException("Unimplemented method 'separateRoot'");
    }

    @Override
    public String separateEnding(OnlyInfinitiveVerb onlyInfinitiveVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'separateEnding'");
    }

    @Override
    public ConjugatedVerb firstPersonSingular(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'firstPersonSingular'");
    }

    @Override
    public ConjugatedVerb secondPersonSingularAR(String pronoun, String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonSingularAR'");
    }

    @Override
    public ConjugatedVerb thirdPersonSingularAR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'thirdPersonSingularAR'");
    }

    @Override
    public ConjugatedVerb firstPersonPluralAR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'firstPersonPluralAR'");
    }

    @Override
    public ConjugatedVerb secondPersonPluralAR(String pronoun, String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonPluralAR'");
    }

    @Override
    public ConjugatedVerb thirdPersonPluralAR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'thirdPersonPluralAR'");
    }

    @Override
    public ConjugatedVerb secondPersonSingularER(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonSingularER'");
    }

    @Override
    public ConjugatedVerb thirdPersonSingularErIr(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'thirdPersonSingularErIr'");
    }

    @Override
    public ConjugatedVerb firstPersonPluralER(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'firstPersonPluralER'");
    }

    @Override
    public ConjugatedVerb secondPersonPluralER(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonPluralER'");
    }

    @Override
    public ConjugatedVerb thirdPersonPluralErIr(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'thirdPersonPluralErIr'");
    }

    @Override
    public ConjugatedVerb secondPersonSingularIR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonSingularIR'");
    }

    @Override
    public ConjugatedVerb firstPersonPluralIR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'firstPersonPluralIR'");
    }

    @Override
    public ConjugatedVerb secondPersonPluralIR(String rootVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'secondPersonPluralIR'");
    }
}
