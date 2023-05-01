package io.schlierf.bybitudf;

import io.schlierf.bybitudf.client.search.SearchResponse;
import io.schlierf.bybitudf.dto.DatafeedConfigurationDTO;
import io.schlierf.bybitudf.dto.ErrorResponseDTO;
import io.schlierf.bybitudf.dto.LibrarySymbolInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UdfController {

    private final RestClient restClient;

    public UdfController( final RestClient restClient ) {

        this.restClient = restClient;
    }

    @GetMapping( path = "/config", produces = "application/json" )
    public ResponseEntity<DatafeedConfigurationDTO> getSymbolConfiguration() {

        return ResponseEntity.ok(new DatafeedConfigurationDTO());
    }

    @GetMapping( path = "/symbol_info", produces = "application/json" )
    public ResponseEntity<? extends ErrorResponseDTO> getSymbolInfo() {

        final LibrarySymbolInfo librarySymbolInfo = this.restClient.getLibrarySymbolInfo();
        if (librarySymbolInfo != null) {
            return ResponseEntity.ok(librarySymbolInfo);
        }
        else {
            final ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
            errorResponseDTO.setS( "error" );
            errorResponseDTO.setErrmsg( "No symbols found!" );
            return ResponseEntity.of( Optional.of( errorResponseDTO ) ).notFound().build();
        }
    }

    @GetMapping( path = "/search", produces = "application/json" )
    public ResponseEntity<SearchResponse[]> search( final @RequestParam String symbol ) {
        return null;
        /*
        final LibrarySymbolInfo librarySymbolInfo = this.restClient.getLibrarySymbolInfo();
        if (librarySymbolInfo != null) {
            return ResponseEntity.ok(symbolInfo);
        }*/
    }

    @GetMapping( path = "/search",produces = "application/json" )
    public String search( ) {

        return String.valueOf( System.currentTimeMillis() / 1000L);
    }

    @GetMapping( path = "/time", produces = "text/plain" )
    public String getTime( ) {

        return String.valueOf( System.currentTimeMillis() / 1000L);
    }
}
