package io.schlierf.bybitudf.client.symbols;

import io.schlierf.bybitudf.dto.ErrorResponseDTO;

public class SymbolInfo  extends ErrorResponseDTO {

    private String symbol;

    private String ticker;

    private String name;

    private String full_name;

    private String description;

    private String exchange;

    private String listed_exchange;

    private String type;

    private String currency_code;

    private String session;

    private String timezone;

    private int minmovement;

    private int minmov;

    private int minmovement2;

    private int minmov2;

    private long pricescale;

    private final String[] supported_resolutions =
            new String[]{"1", "3", "5", "15", "30", "60", "120", "240", "360", "480", "720", "1D", "3D", "1W", "1M"};

    private boolean has_intraday;

    private boolean has_daily;

    private boolean has_weekly_and_monthly;

    private String data_status;

    public String getSymbol() {

        return symbol;
    }

    public void setSymbol( final String symbol ) {

        this.symbol = symbol;
    }

    public String getTicker() {

        return ticker;
    }

    public void setTicker( final String ticker ) {

        this.ticker = ticker;
    }

    public String getName() {

        return name;
    }

    public void setName( final String name ) {

        this.name = name;
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

    public String getListed_exchange() {

        return listed_exchange;
    }

    public void setListed_exchange( final String listed_exchange ) {

        this.listed_exchange = listed_exchange;
    }

    public String getType() {

        return type;
    }

    public void setType( final String type ) {

        this.type = type;
    }

    public String getCurrency_code() {

        return currency_code;
    }

    public void setCurrency_code( final String currency_code ) {

        this.currency_code = currency_code;
    }

    public String getSession() {

        return session;
    }

    public void setSession( final String session ) {

        this.session = session;
    }

    public String getTimezone() {

        return timezone;
    }

    public void setTimezone( final String timezone ) {

        this.timezone = timezone;
    }

    public int getMinmovement() {

        return minmovement;
    }

    public void setMinmovement( final int minmovement ) {

        this.minmovement = minmovement;
    }

    public int getMinmov() {

        return minmov;
    }

    public void setMinmov( final int minmov ) {

        this.minmov = minmov;
    }

    public int getMinmovement2() {

        return minmovement2;
    }

    public void setMinmovement2( final int minmovement2 ) {

        this.minmovement2 = minmovement2;
    }

    public int getMinmov2() {

        return minmov2;
    }

    public void setMinmov2( final int minmov2 ) {

        this.minmov2 = minmov2;
    }

    public long getPricescale() {

        return pricescale;
    }

    public void setPricescale( final long pricescale ) {

        this.pricescale = pricescale;
    }

    public String[] getSupported_resolutions() {

        return supported_resolutions;
    }

    public boolean isHas_intraday() {

        return has_intraday;
    }

    public void setHas_intraday( final boolean has_intraday ) {

        this.has_intraday = has_intraday;
    }

    public boolean isHas_daily() {

        return has_daily;
    }

    public void setHas_daily( final boolean has_daily ) {

        this.has_daily = has_daily;
    }

    public boolean isHas_weekly_and_monthly() {

        return has_weekly_and_monthly;
    }

    public void setHas_weekly_and_monthly( final boolean has_weekly_and_monthly ) {

        this.has_weekly_and_monthly = has_weekly_and_monthly;
    }

    public String getData_status() {

        return data_status;
    }

    public void setData_status( final String data_status ) {

        this.data_status = data_status;
    }
}
