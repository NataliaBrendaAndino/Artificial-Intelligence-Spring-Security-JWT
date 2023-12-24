package com.brenA.demojwt.myAI.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompleteConjugation {

    private List<PronounAndVerb> pronounAndVerbs;

}
