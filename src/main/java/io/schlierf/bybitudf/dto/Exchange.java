package io.schlierf.bybitudf.dto;

public class Exchange {
    private String value;
    private String name;
    private String desc;

    public Exchange( final String value, final String name, final String desc ) {

        this.value = value;
        this.name = name;
        this.desc = desc;
    }

    public String getValue() {

        return value;
    }

    public void setValue( final String value ) {

        this.value = value;
    }

    public String getName() {

        return name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc( final String desc ) {

        this.desc = desc;
    }
}
