package com.brenA.demojwt.myAI.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;

public class PronounAndVerbServiceTest {

    PronounAndVerbService pronounAndVerbService;

    @Mock
    ConjugationsService conjugationsService;

    Pronoun pronoun;

    OnlyInfinitiveVerb onlyInfinitiveVerb;

    PronounAndVerb pronounAndVerb;

    @BeforeEach
    public void setUp() {
        pronounAndVerb = new PronounAndVerb();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConjugateWithPronoun() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("amar");

        when(conjugationsService.separateEnding(onlyInfinitiveVerb)).thenReturn("ar");
        when(conjugationsService.separateRoot(onlyInfinitiveVerb)).thenReturn("am");

        pronounAndVerb = pronounAndVerbService.conjugateWithPronoun(pronoun.VOS, onlyInfinitiveVerb);
        assertThat(pronounAndVerb.getConjugatedVerb().getConjugatedVerb()).isEqualTo("amás");
    }

}
