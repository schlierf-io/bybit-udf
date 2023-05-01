package io.schlierf.bybitudf.client.symbols;

public class SymbolsType {
    private String value;
    private String name;

    public SymbolsType( final String value, final String name ) {

        this.value = value;
        this.name = name;
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
}
