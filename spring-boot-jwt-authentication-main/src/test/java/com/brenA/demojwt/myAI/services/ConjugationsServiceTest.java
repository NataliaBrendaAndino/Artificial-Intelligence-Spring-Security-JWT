package com.brenA.demojwt.myAI.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.Assertions;
import static org.mockito.Mockito.when;

public class ConjugationsServiceTest {

    @InjectMocks
    private ConjugationsService conjugationsService;

    @Mock
    private OnlyInfinitiveVerb onlyInfinitiveVerb;

    @Mock
    private ConjugatedVerb conjugatedVerb;

    @Mock
    private Pronoun pronoun;

    @Mock
    private PronounAndVerb pronounAndVerb;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSeparateEndingValidInfinitive() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("sobrevivir");

        String result = conjugationsService.separateEnding(onlyInfinitiveVerb);

        assertThat(result).isEqualTo("ir");
    }

    @Test
    public void testSeparateEndingShortString() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("r");

        Assertions.assertThatThrownBy(() -> conjugationsService.separateEnding(onlyInfinitiveVerb))
                .isInstanceOf(ShortStringException.class)
                .hasMessage("Error processing 'r'. The verb must have two or more letters");
    }

    @Test
    public void testSeparateEndingInvalidInfinitive() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("incorrecto");

        Assertions.assertThatThrownBy(() -> conjugationsService.separateEnding(onlyInfinitiveVerb))
                .isInstanceOf(InvalidWordException.class)
                .hasMessage("Error processing 'incorrecto'. The word is not a verb");
    }

    @Test
    public void testSeparateRoot() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("estudiar");
        String result = conjugationsService.separateRoot(onlyInfinitiveVerb);
        assertThat(result).isEqualTo("estudi");
    }

    @Test
    public void testFirstPersonSingular() {
        conjugatedVerb = conjugationsService.firstPersonPluralAR("estudi");
        assertThat(conjugatedVerb.getConjugatedVerb()).isEqualTo("estudiamos");
    }

    @Test
    public void testSecondPersonSingularAR() {
        conjugatedVerb = conjugationsService.secondPersonSingularAR("vos", "estudi");
        assertThat(conjugatedVerb.getConjugatedVerb()).isEqualTo("estudiás");
    }

    @Test
    public void testVerbsAR() {

        PronounAndVerb resultYO = conjugationsService.verbsAR(pronoun.YO, "estudi");
        assertThat(resultYO.getConjugatedVerb().getConjugatedVerb()).isEqualTo("estudio");

        PronounAndVerb resultTU = conjugationsService.verbsAR(pronoun.TÚ, "estudi");
        assertThat(resultTU.getConjugatedVerb().getConjugatedVerb()).isEqualTo("estudias");

        PronounAndVerb resultNOS = conjugationsService.verbsAR(pronoun.NOSOTRAS, "estudi");
        assertThat(resultNOS.getConjugatedVerb().getConjugatedVerb()).isEqualTo("estudiamos");
    }

    @Test
    public void testVerbsER() {

        PronounAndVerb resultVOS = conjugationsService.verbsER(pronoun.VOS, "tem");
        assertThat(resultVOS.getConjugatedVerb().getConjugatedVerb()).isEqualTo("temés");

        PronounAndVerb resultVOSOT = conjugationsService.verbsER(pronoun.VOSOTRAS, "tem");
        assertThat(resultVOSOT.getConjugatedVerb().getConjugatedVerb()).isEqualTo("teméis");

    }

    @Test
    public void testVerbsIR() {

        PronounAndVerb resultVos = conjugationsService.verbsIR(pronoun.VOSOTRAS, "part");
        assertThat(resultVos.getConjugatedVerb().getConjugatedVerb()).isEqualTo("partís");

        PronounAndVerb resultUts = conjugationsService.verbsIR(pronoun.USTEDES, "part");
        assertThat(resultUts.getConjugatedVerb().getConjugatedVerb()).isEqualTo("parten");

    }
}
