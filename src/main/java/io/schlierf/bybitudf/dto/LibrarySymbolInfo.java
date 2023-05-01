package io.schlierf.bybitudf.dto;

import java.util.ArrayList;
import java.util.List;

public class LibrarySymbolInfo extends ErrorResponseDTO {

    private final List<String> symbol = new ArrayList<>();

    private final List<String> ticker = new ArrayList<>();

    private final List<String> name = new ArrayList<>();

    private final List<String> full_name = new ArrayList<>();

    private final List<String> description = new ArrayList<>();

    private String exchange;

    private String listed_exchange;

    private String type;

    private final List<String> currency_code = new ArrayList<>();

    private String session;

    private String timezone;

    private int minmovement;

    private int minmov;

    private int minmovement2;

    private int minmov2;

    private final List<Long> pricescale = new ArrayList<>();

    private final String[] supported_resolutions =
            new String[]{"1", "3", "5", "15", "30", "60", "120", "240", "360", "480", "720", "1D", "3D", "1W", "1M"};

    private boolean has_intraday = true;

    private boolean has_daily = true;

    private boolean has_weekly_and_monthly = true;

    private String data_status = "streaming";

    public List<String> getSymbol() {

        return symbol;
    }

    public List<String> getTicker() {

        return ticker;
    }

    public List<String> getFull_name() {

        return full_name;
    }

    public List<String> getDescription() {

        return description;
    }

    public List<String> getName() {

        return name;
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

    public List<String> getCurrency_code() {

        return currency_code;
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

    public List<Long> getPricescale() {

        return pricescale;
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
