package com.coinomi.core.coins;

/**
 * @author John L. Jegutanis
 */
public class CanadaeCoinTest extends CoinType {
    private CanadaeCoinTest() {
        id = "CanadaeCoin.test";

        addressHeader = 87;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 240; // COINBASE_MATURITY_NEW

        name = "Canada eCoin Testnet";
        symbol = "CDNt";
        uriScheme = "canadaecoin";
        bip44Index = 1;
        unitExponent = 8;
        feePerKb = value(100000000L);
        minNonDust = value(1);
        softDustLimit = value(100000000L); // 1 DOGE
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static CanadaeCoinTest instance = new CanadaeCoinTest();
    public static synchronized CanadaeCoinTest get() {
        return instance;
    }
}
