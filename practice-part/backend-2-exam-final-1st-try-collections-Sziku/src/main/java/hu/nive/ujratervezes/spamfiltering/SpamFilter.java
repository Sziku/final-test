package hu.nive.ujratervezes.spamfiltering;

import java.util.*;

public class SpamFilter {
    private HashSet<String> whitelist;
    private HashSet<String> blacklist;

    public SpamFilter(List<String> whitelist, List<String> blacklist) throws IllegalArgumentException {
        if (whitelist == null || blacklist == null) {
            throw new IllegalArgumentException();
        }
        this.whitelist = new HashSet<>(whitelist);
        this.blacklist = new HashSet<>(blacklist);
    }

    public List<List<String>> applyRules(List<List<String>> sentence) {
        List<List<String>> passedSentences = new ArrayList<>();

        for (List<String> words : sentence) {
            if (Collections.disjoint(words, blacklist) || blacklist.isEmpty()) {
                if (!Collections.disjoint(words, whitelist)) {
                    passedSentences.add(words);
                }
            }
        }

        return passedSentences;
    }
}
