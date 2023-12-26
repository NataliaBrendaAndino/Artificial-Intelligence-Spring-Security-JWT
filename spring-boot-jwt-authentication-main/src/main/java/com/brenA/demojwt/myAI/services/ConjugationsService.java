package com.brenA.demojwt.myAI.services;

import com.brenA.demojwt.myAI.entities.ConjugatedVerb;
import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;
import com.brenA.demojwt.myAI.entities.PronounAndVerb;
import com.brenA.demojwt.myAI.enums.Pronoun;
import com.brenA.demojwt.myAI.exceptions.InvalidPronounException;
import com.brenA.demojwt.myAI.exceptions.InvalidWordException;
import com.brenA.demojwt.myAI.exceptions.ShortStringException;

public class ConjugationsService implements ConjugationsInterface {

    @Override
    public PronounAndVerb verbsAR(Pronoun pronoun, String verbalRoot) {
        Pronoun pron = pronoun;
        PronounAndVerb pronounAndVerb = new PronounAndVerb();
        String pronString = pron.toString();

        if (pronString.equalsIgnoreCase("YO")) {
            pronounAndVerb.setConjugatedVerb(firstPersonSingular(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("TÚ")) {
            String pronounX = "TÚ";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularAR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOS")) {
            String pronounX = "VOS";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularAR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTED")) {
            String pronounX = "USTED";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularAR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ÉL") || pronString.equalsIgnoreCase("ELLA")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonSingularAR(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("NOSOTROS") || pronString.equalsIgnoreCase("NOSOTRAS")) {
            pronounAndVerb.setConjugatedVerb(firstPersonPluralAR(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOSOTROS") || pronString.equalsIgnoreCase("VOSOTRAS")) {
            String pronounX = "VOSOTROS";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralAR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTEDES")) {
            String pronounX = "USTEDES";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralAR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ELLOS") || pronString.equalsIgnoreCase("ELLAS")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonPluralAR(verbalRoot));
            return pronounAndVerb;
        } else {
            throw new InvalidPronounException("Error processing '" + pronString + "'");
        }

    }

    @Override
    public PronounAndVerb verbsER(Pronoun pronoun, String verbalRoot) {
        Pronoun pron = pronoun;
        PronounAndVerb pronounAndVerb = new PronounAndVerb();
        String pronString = pron.toString();

        if (pronString.equalsIgnoreCase("YO")) {
            pronounAndVerb.setConjugatedVerb(firstPersonSingular(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("TÚ")) {
            String pronounX = "TÚ";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularER(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOS")) {
            String pronounX = "VOS";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularER(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTED")) {
            String pronounX = "USTED";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularER(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ÉL") || pronString.equalsIgnoreCase("ELLA")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonSingularErIr(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("NOSOTROS") || pronString.equalsIgnoreCase("NOSOTRAS")) {
            pronounAndVerb.setConjugatedVerb(firstPersonPluralER(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOSOTROS") || pronString.equalsIgnoreCase("VOSOTRAS")) {
            String pronounX = "VOSOTROS";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralER(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTEDES")) {
            String pronounX = "USTEDES";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralER(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ELLOS") || pronString.equalsIgnoreCase("ELLAS")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonPluralErIr(verbalRoot));
            return pronounAndVerb;
        } else {
            throw new InvalidPronounException("Error processing '" + pronString + "'");
        }
    }

    @Override
    public PronounAndVerb verbsIR(Pronoun pronoun, String verbalRoot) {
        Pronoun pron = pronoun;
        PronounAndVerb pronounAndVerb = new PronounAndVerb();
        String pronString = pron.toString();

        if (pronString.equalsIgnoreCase("YO")) {
            pronounAndVerb.setConjugatedVerb(firstPersonSingular(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("TÚ")) {
            String pronounX = "TÚ";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularIR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOS")) {
            String pronounX = "VOS";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularIR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTED")) {
            String pronounX = "USTED";
            pronounAndVerb.setConjugatedVerb(secondPersonSingularIR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ÉL") || pronString.equalsIgnoreCase("ELLA")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonSingularErIr(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("NOSOTROS") || pronString.equalsIgnoreCase("NOSOTRAS")) {
            pronounAndVerb.setConjugatedVerb(firstPersonPluralIR(verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("VOSOTROS") || pronString.equalsIgnoreCase("VOSOTRAS")) {
            String pronounX = "VOSOTROS";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralIR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("USTEDES")) {
            String pronounX = "USTEDES";
            pronounAndVerb.setConjugatedVerb(secondPersonPluralIR(pronounX, verbalRoot));
            return pronounAndVerb;
        }

        else if (pronString.equalsIgnoreCase("ELLOS") || pronString.equalsIgnoreCase("ELLAS")) {
            pronounAndVerb.setConjugatedVerb(thirdPersonPluralErIr(verbalRoot));
            return pronounAndVerb;
        } else {
            throw new InvalidPronounException("Error processing '" + pronString + "'");
        }
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
            throw new InvalidPronounException("Error processing '" + pronoun + "'");
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
    public ConjugatedVerb secondPersonSingularER(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("TÚ")) {
            verb.setConjugatedVerb(rootVerb.concat("es"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("VOS")) {
            verb.setConjugatedVerb(rootVerb.concat("és"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTED")) {
            verb.setConjugatedVerb(rootVerb.concat("e"));
            return verb;
        } else {
            throw new InvalidPronounException("Error processing '" + pronoun + "'");
        }
    }

    @Override
    public ConjugatedVerb thirdPersonSingularErIr(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("e"));
        return verb;
    }

    @Override
    public ConjugatedVerb firstPersonPluralER(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("emos"));
        return verb;
    }

    @Override
    public ConjugatedVerb secondPersonPluralER(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("VOSOTROS") || pronoun.equalsIgnoreCase("VOSOTRAS")) {
            verb.setConjugatedVerb(rootVerb.concat("éis"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTEDES")) {
            return thirdPersonPluralErIr(rootVerb);
        } else {
            throw new InvalidWordException("Error processing '" + pronoun + "'");
        }
    }

    @Override
    public ConjugatedVerb thirdPersonPluralErIr(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("en"));
        return verb;
    }

    @Override
    public ConjugatedVerb secondPersonSingularIR(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("TÚ")) {
            return secondPersonPluralER(pronoun, rootVerb);
        } else if (pronoun.equalsIgnoreCase("VOS")) {
            verb.setConjugatedVerb(rootVerb.concat("ís"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTED")) {
            return secondPersonPluralER(pronoun, rootVerb);
        } else {
            throw new InvalidPronounException("Error processing '" + pronoun + "'");
        }
    }

    @Override
    public ConjugatedVerb firstPersonPluralIR(String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();
        verb.setConjugatedVerb(rootVerb.concat("imos"));
        return verb;
    }

    @Override
    public ConjugatedVerb secondPersonPluralIR(String pronoun, String rootVerb) {
        ConjugatedVerb verb = new ConjugatedVerb();

        if (pronoun.equalsIgnoreCase("VOSOTROS") || pronoun.equalsIgnoreCase("VOSOTRAS")) {
            verb.setConjugatedVerb(rootVerb.concat("ís"));
            return verb;
        } else if (pronoun.equalsIgnoreCase("USTEDES")) {
            return secondPersonPluralER(pronoun, rootVerb);
        } else {
            throw new InvalidWordException("Error processing '" + pronoun + "'");
        }
    }

}
