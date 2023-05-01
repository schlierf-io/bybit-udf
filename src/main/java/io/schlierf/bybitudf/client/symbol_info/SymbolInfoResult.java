package io.schlierf.bybitudf.client.symbol_info;

public class SymbolInfoResult {
    private int retCode;
    private String retMsg;
    private Result result;
    private RetExtInfo retExtInfo;

    public int getRetCode() {

        return retCode;
    }

    public void setRetCode( final int retCode ) {

        this.retCode = retCode;
    }

    public String getRetMsg() {

        return retMsg;
    }

    public void setRetMsg( final String retMsg ) {

        this.retMsg = retMsg;
    }

    public Result getResult() {

        return result;
    }

    public void setResult( final Result result ) {

        this.result = result;
    }

    public RetExtInfo getRetExtInfo() {

        return retExtInfo;
    }

    public void setRetExtInfo( final RetExtInfo retExtInfo ) {

        this.retExtInfo = retExtInfo;
    }
}
