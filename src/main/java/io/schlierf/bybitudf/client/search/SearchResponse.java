package io.schlierf.bybitudf.client.search;

public class SearchResponse {
    private String symbol;
    private String full_name;
    private String description;
    private String exchange;
    private String ticker;
    private String type;

    public String getSymbol() {

        return symbol;
    }

    public void setSymbol( final String symbol ) {

        this.symbol = symbol;
    }

    public String getFull_name() {

        return full_name;
    }

    public void setFull_name( final String full_name ) {

        this.full_name = full_name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription( final String description ) {

        this.description = description;
    }

    public String getExchange() {

        return exchange;
    }

    public void setExchange( final String exchange ) {

        this.exchange = exchange;
    }

    public String getTicker() {

        return ticker;
    }

    public void setTicker( final String ticker ) {

        this.ticker = ticker;
    }

    public String getType() {

        return type;
    }

    public void setType( final String type ) {

        this.type = type;
    }
}
