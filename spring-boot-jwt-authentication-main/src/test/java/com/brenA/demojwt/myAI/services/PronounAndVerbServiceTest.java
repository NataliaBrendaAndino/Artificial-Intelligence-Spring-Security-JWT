package com.brenA.demojwt.myAI.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.Assertions;
import static org.mockito.Mockito.when;

public class PronounAndVerbServiceTest {
    @InjectMocks
    private PronounAndVerbService pronounAndVerbService;

    @Mock
    private OnlyInfinitiveVerb onlyInfinitiveVerb;

    @BeforeEach
    public void setUp() {
        // Inicializar mocks antes de cada prueba
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSeparateEndingValidInfinitive() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("sobrevivir");

        String result = pronounAndVerbService.separateEnding(onlyInfinitiveVerb);

        assertThat(result).isEqualTo("ir");
    }

    @Test
    public void testSeparateEndingShortString() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("r");

        Assertions.assertThatThrownBy(() -> pronounAndVerbService.separateEnding(onlyInfinitiveVerb))
                .isInstanceOf(ShortStringException.class)
                .hasMessage("Error processing 'r'. The verb must have two or more letters");
    }

    @Test
    public void testSeparateEndingInvalidInfinitive() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("incorrecto");

        Assertions.assertThatThrownBy(() -> pronounAndVerbService.separateEnding(onlyInfinitiveVerb))
                .isInstanceOf(InvalidWordException.class)
                .hasMessage("Error processing 'incorrecto'. The word is not a verb");
    }

    @Test
    public void testSeparateRoot() {
        when(onlyInfinitiveVerb.getInfinitive()).thenReturn("estudiar");
        String result = pronounAndVerbService.separateRoot(onlyInfinitiveVerb);
        assertThat(result).isEqualTo("estudi");
    }
}
