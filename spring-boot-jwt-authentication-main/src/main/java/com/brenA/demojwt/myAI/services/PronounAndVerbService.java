package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

public class PronounAndVerbService implements PronounAndVerbInterface, ConjugationsInterface {

    @Override
    public PronounAndVerbInterface conjugateWithPronoun(Pronoun pronoun, OnlyInfinitiveVerb onlyInfinitiveVerb) {
        throw new UnsupportedOperationException("Unimplemented method 'conjugateWiyhPronoun'");
    }

    @Override
    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot) {
        Pronoun pron = pronoun;
        PronounAndVerb pronounAndVerb = new PronounAndVerb();
        String pronString = pron.toString();

        if (pronString.equalsIgnoreCase("YO")) {
            pronounAndVerb.setConjugatedVerb(firstPersonSingular(verbalRoot));
            return pronounAndVerb;
        }

        if (pronString.equalsIgnoreCase("TÚ")) {
            String tu = "TÚ";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularAR(tu, verbalRoot));
            return pronounAndVerb;
        }

        // switch (pron) {
        // case VOS:
        // String vos = "VOS";
        // pronounAndVerb.setConjugatedVerb(secondPersonSingularAR(vos, verbalRoot));
        // break;
        // case USTED:
        // String usted = "USTED";
        // secondPersonSingularAR(usted, verbalRoot);
        // break;
        // case ÉL:
        // thirdPersonSingularAR(verbalRoot);
        // break;
        // case ELLA:
        // thirdPersonSingularAR(verbalRoot);
        // break;
        // case NOSOTROS:
        // firstPersonPluralAR(verbalRoot);
        // break;
        // case NOSOTRAS:
        // firstPersonPluralAR(verbalRoot);
        // break;
        // case VOSOTROS:
        // String vosotros = "VOSOTROS";
        // secondPersonPluralAR(vosotros, verbalRoot);
        // break;
        // case VOSOTRAS:
        // String vosotras = "VOSOTRAS";
        // secondPersonPluralAR(vosotras, verbalRoot);
        // break;
        // case USTEDES:
        // String ustedes = "USTEDES";
        // secondPersonPluralAR(ustedes, verbalRoot);
        // break;
        // case ELLOS:
        // thirdPersonPluralAR(verbalRoot);
        // break;
        // case ELLAS:
        // thirdPersonPluralAR(verbalRoot);
        // break;
        // }

        return null;
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
        OnlyInfinitiveVerb infinitiveVerb = onlyInfinitiveVerb;
        String verb = infinitiveVerb.getInfinitive();
        String root = verb.substring(0, verb.length() - 2);
        return root;
    }

    @Override
    public String separateEnding(OnlyInfinitiveVerb onlyInfinitiveVerb) {

        OnlyInfinitiveVerb infinitiveVerb = onlyInfinitiveVerb;

        if (infinitiveVerb.getInfinitive().length() >= 2) {
            String lastTwoLetters = infinitiveVerb.getInfinitive()
                    .substring(infinitiveVerb.getInfinitive().length() - 2);
            if (lastTwoLetters.equalsIgnoreCase("ar") || lastTwoLetters.equalsIgnoreCase("er") ||
                    lastTwoLetters.equalsIgnoreCase("ir")) {
                return lastTwoLetters;
            } else {
                throw new InvalidWordException("Error processing '" + infinitiveVerb.getInfinitive() + "'");
            }

        } else {
            throw new ShortStringException("Error processing '" + infinitiveVerb.getInfinitive() + "'");
        }
    }

    @Override
    public ConjugatedVerb firstPersonSingular(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("o"));
        return verb;
    }

    @Override
    public ConjugatedVerb secondPersonSingularAR(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("TÚ")) {
            verb.setConjugatedVerb(rootVerb.concat("as"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("VOS")) {
            verb.setConjugatedVerb(rootVerb.concat("ás"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTED")) {
            verb.setConjugatedVerb(rootVerb.concat("a"));
            return verb;
        } else {
            throw new InvalidWordException("Error processing '" + pronoun + "'");
        }
    }

    @Override
    public ConjugatedVerb thirdPersonSingularAR(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("a"));
        return verb;
    }

    @Override
    public ConjugatedVerb firstPersonPluralAR(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("amos"));
        return verb;
    }

    @Override
    public ConjugatedVerb secondPersonPluralAR(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("VOSOTROS") || pronoun.equalsIgnoreCase("VOSOTRAS")) {
            verb.setConjugatedVerb(rootVerb.concat("áis"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTEDES")) {
            return thirdPersonPluralAR(rootVerb);
        } else {
            throw new InvalidWordException("Error processing '" + pronoun + "'");
        }
    }

    @Override
    public ConjugatedVerb thirdPersonPluralAR(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("an"));
        return verb;
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
