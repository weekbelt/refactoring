package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        return authors.stream()
            .filter(author -> author.company.equals(company))
            .map(author -> author.twitterHandle)
            .filter(Objects::isNull)
            .collect(toList());
    }
}
