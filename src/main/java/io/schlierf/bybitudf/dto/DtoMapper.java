package io.schlierf.bybitudf.dto;

import io.schlierf.bybitudf.client.search.SearchResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DtoMapper {
    public SearchResponse[] getSearchResults(final String symbol) {
        final List<SearchResponse> result = new ArrayList<>();

        return result.toArray(SearchResponse[]::new);
    }
}
