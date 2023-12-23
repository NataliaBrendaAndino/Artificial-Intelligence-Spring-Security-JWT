package com.brenA.demojwt.myAI.entities;

import com.brenA.demojwt.myAI.enums.Pronoun;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PronounAndVerb {
    private Pronoun pronoun;
    private ConjugatedVerb conjugatedVerb;
}
