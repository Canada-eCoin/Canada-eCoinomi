package com.coinomi.core.coins;

import org.bitcoinj.core.Coin;

/**
 * @author John L. Jegutanis
 */
public class NuSharesMain extends CoinType {
    private NuSharesMain() {
        id = "nushares.main";

        addressHeader = 63;
        p2shHeader = 64;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        tokenId = 0x53;

        name = "NuShares";
        symbol = "NSR";
        uriScheme = "nu";
        bip44Index = 11;
        unitExponent = 4;
        feePerKb = value(10000); // 1NSR, careful NuBits has 10000 units per coin
        minNonDust = value(10000); // 1NSR
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
    }

    private static NuSharesMain instance = new NuSharesMain();
    public static synchronized NuSharesMain get() {
        return instance;
    }
}
