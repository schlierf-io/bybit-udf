package io.schlierf.bybitudf.dto;

import io.schlierf.bybitudf.client.symbols.SymbolsType;

import java.util.ArrayList;
import java.util.List;

public class DatafeedConfigurationDTO {

    private List<Exchange> exchanges = new ArrayList<>();

    private final List<SymbolsType> symbols_types = new ArrayList<>();

    private String[] supported_resolutions =
            new String[]{"1", "3", "5", "15", "30", "60", "120", "240", "360", "480", "720", "1D", "3D", "1W", "1M"};

    private boolean supports_group_request;
    private boolean supports_marks;
    private boolean supports_search = true;

    private boolean supports_time = true;

    public DatafeedConfigurationDTO() {

        this.exchanges.add( new Exchange( "BYBIT", "BYBIT", "Cryptocurrency" ) );
        this.symbols_types.add( new SymbolsType( "crypto", "Cryptocurrency" ) );
    }

    public List<Exchange> getExchanges() {

        return exchanges;
    }

    public String[] getSupported_resolutions() {

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

    public boolean isSupports_time() {

        return supports_time;
    }

    public void setSupports_time( final boolean supports_time ) {

        this.supports_time = supports_time;
    }

    public List<SymbolsType> getSymbols_types() {

        return symbols_types;
    }
}
