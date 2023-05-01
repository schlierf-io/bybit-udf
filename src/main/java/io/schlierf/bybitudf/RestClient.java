package io.schlierf.bybitudf;

import io.schlierf.bybitudf.client.symbol_info.SymbolInfoResult;
import io.schlierf.bybitudf.client.symbol_info.List;
import io.schlierf.bybitudf.client.symbols.SymbolInfo;
import io.schlierf.bybitudf.dto.LibrarySymbolInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {

    private final static String BASE_URL = "https://api.bybit.com/v5";

    private final static String INSTRUMENTS = "/market/instruments-info?category=inverse";

    private final RestTemplate restTemplate;

    public RestClient( final RestTemplate restTemplate ) {

        this.restTemplate = restTemplate;
    }

    public LibrarySymbolInfo getLibrarySymbolInfo() {

        final ResponseEntity<SymbolInfoResult> response =
                this.restTemplate.getForEntity( BASE_URL + INSTRUMENTS, SymbolInfoResult.class );
        if ( response.getStatusCode() == HttpStatus.OK ) {
            final SymbolInfoResult instrumentInfo = response.getBody();
            if ( instrumentInfo != null ) {
                final LibrarySymbolInfo librarySymbolInfo = new LibrarySymbolInfo();
                for ( final List listEntry : instrumentInfo.getResult().list ) {
                    librarySymbolInfo.getSymbol().add( listEntry.symbol );
                    librarySymbolInfo.getTicker().add( listEntry.symbol );
                    librarySymbolInfo.getName().add( listEntry.symbol );
                    librarySymbolInfo.getFull_name().add( listEntry.symbol );
                    librarySymbolInfo.getDescription().add( listEntry.baseCoin + " / " + listEntry.quoteCoin );
                    librarySymbolInfo.setExchange( "BYBIT" );
                    librarySymbolInfo.setListed_exchange( "BYBIT" );
                    librarySymbolInfo.setType( "Crypto" );
                    librarySymbolInfo.getCurrency_code().add( listEntry.quoteCoin );
                    librarySymbolInfo.setSession( "24x7" );
                    librarySymbolInfo.setTimezone( "UTC" );
                    librarySymbolInfo.setMinmovement( 1 );
                    librarySymbolInfo.setMinmov( 1 );
                    librarySymbolInfo.setMinmovement2( 0 );
                    librarySymbolInfo.setMinmov2( 0 );
                    librarySymbolInfo.getPricescale()
                            .add( Double.valueOf( Math.pow( 10.0, Double.parseDouble( listEntry.priceScale ) ) )
                                    .longValue() );
                }

                return librarySymbolInfo;
            }
        }

        return null;
    }

    public SymbolInfo getSymbolInfo( final String symbol ) {

        final ResponseEntity<SymbolInfoResult> response =
                this.restTemplate.getForEntity( BASE_URL + INSTRUMENTS, SymbolInfoResult.class );
        if ( response.getStatusCode() == HttpStatus.OK ) {
            final SymbolInfo symbolInfo = new SymbolInfo();
            final SymbolInfoResult instrumentInfo = response.getBody();
            if ( instrumentInfo != null ) {
                final String exchange = symbol.substring( 0, symbol.indexOf( ":" ) );
                final String pair = symbol.substring( symbol.indexOf( ":" ) + 1);
                for ( final List listEntry : instrumentInfo.getResult().list ) {
                    if ( listEntry.symbol.equalsIgnoreCase( pair ) ) {
                        symbolInfo.setSymbol( listEntry.symbol );
                        symbolInfo.setTicker( listEntry.symbol );
                        symbolInfo.setName( listEntry.symbol );
                        symbolInfo.setFull_name( listEntry.symbol );
                        symbolInfo.setDescription( listEntry.baseCoin + " / " + listEntry.quoteCoin );
                        symbolInfo.setExchange( "BYBIT" );
                        symbolInfo.setListed_exchange( "BYBIT" );
                        symbolInfo.setType( "Crypto" );
                        symbolInfo.setCurrency_code( listEntry.quoteCoin );
                        symbolInfo.setSession( "24x7" );
                        symbolInfo.setTimezone( "UTC" );
                        symbolInfo.setMinmovement( 1 );
                        symbolInfo.setMinmov( 1 );
                        symbolInfo.setMinmovement2( 0 );
                        symbolInfo.setMinmov2( 0 );
                        symbolInfo.setPricescale(
                                Double.valueOf( Math.pow( 10.0, Double.parseDouble( listEntry.priceScale ) ) )
                                        .longValue() );

                        return symbolInfo;
                    }
                }
            }

        }

        return null;
    }
}
