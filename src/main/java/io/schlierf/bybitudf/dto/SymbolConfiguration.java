package io.schlierf.bybitudf.dto;

import java.util.ArrayList;
import java.util.List;

public class SymbolConfiguration {
    private final List<String> supported_resolutions = new ArrayList<>();
    private boolean supports_group_request;
    private boolean supports_marks;
    private boolean supports_search;
    private boolean supports_timescale_marks;

    public List<String> getSupported_resolutions() {

        return supported_resolutions;
    }

    public boolean isSupports_group_request() {

        return supports_group_request;
    }

    public void setSupports_group_request( final boolean supports_group_request ) {

        this.supports_group_request = supports_group_request;
    }

    public boolean isSupports_marks() {

        return supports_marks;
    }

    public void setSupports_marks( final boolean supports_marks ) {

        this.supports_marks = supports_marks;
    }

    public boolean isSupports_search() {

        return supports_search;
    }

    public void setSupports_search( final boolean supports_search ) {

        this.supports_search = supports_search;
    }

    public boolean isSupports_timescale_marks() {

        return supports_timescale_marks;
    }

    public void setSupports_timescale_marks( final boolean supports_timescale_marks ) {

        this.supports_timescale_marks = supports_timescale_marks;
    }
}
