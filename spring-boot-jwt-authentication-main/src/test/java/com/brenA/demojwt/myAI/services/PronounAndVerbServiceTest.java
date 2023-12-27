package com.brenA.demojwt.myAI.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.FatalException;

public class PronounAndVerbServiceTest {

    PronounAndVerbService pronounAndVerbService;

    @Mock
    ConjugationsService conjugationsService;

    Pronoun pronoun;

    OnlyInfinitiveVerb onlyInfinitiveVerb;

    PronounAndVerb pronounAndVerb;

    @BeforeEach
    public void setUp() {
        onlyInfinitiveVerb = new OnlyInfinitiveVerb();
        onlyInfinitiveVerb.setInfinitive("amar");
        pronounAndVerb = new PronounAndVerb();
        pronounAndVerbService = new PronounAndVerbService(conjugationsService);

    }

    @Test
    void testConjugateWithPronoun() {

        pronounAndVerb = pronounAndVerbService.conjugateWithPronoun(pronoun.VOS, onlyInfinitiveVerb);
        assertThat(pronounAndVerb.getConjugatedVerb().getConjugatedVerb()).isEqualTo("amás");
    }

}
