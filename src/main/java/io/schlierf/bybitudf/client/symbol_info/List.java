package io.schlierf.bybitudf.client.symbol_info;

public class List{
    public String symbol;
    public String contractType;
    public String status;
    public String baseCoin;
    public String quoteCoin;
    public String launchTime;
    public String deliveryTime;
    public String deliveryFeeRate;
    public String priceScale;
    public LeverageFilter leverageFilter;
    public PriceFilter priceFilter;
    public LotSizeFilter lotSizeFilter;
    public boolean unifiedMarginTrade;
    public int fundingInterval;
    public String settleCoin;
}
