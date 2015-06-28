package com.coinomi.core.coins;

/**
 * @author John L. Jegutanis
 */
public class CanadaeCoinMain extends CoinType {
    private CanadaeCoinMain() {
        id = "CanadaeCoin.main";

        addressHeader = 28;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 240; // COINBASE_MATURITY_NEW

        name = "Canada eCoin";
        symbol = "CDN";
        uriScheme = "canadaecoin";
// TODO: Register Canada eCoin with BIP44 registry, update this value when done.
        bip44Index = 119;
        unitExponent = 8;
        feePerKb = value(1000000);
        minNonDust = value(1);
        softDustLimit = value(100000000L); // 1 DOGE
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static CanadaeCoinMain instance = new CanadaeCoinMain();
    public static synchronized CanadaeCoinMain get() {
        return instance;
    }
}
