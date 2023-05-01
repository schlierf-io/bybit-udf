package io.schlierf.bybitudf.dto;

public class CurrencyItemDTO {
    private String id;

    private String code;

    private String logUrl;

    private String description;

    public String getId() {

        return id;
    }

    public void setId( final String id ) {

        this.id = id;
    }

    public String getCode() {

        return code;
    }

    public void setCode( final String code ) {

        this.code = code;
    }

    public String getLogUrl() {

        return logUrl;
    }

    public void setLogUrl( final String logUrl ) {

        this.logUrl = logUrl;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription( final String description ) {

        this.description = description;
    }
}
