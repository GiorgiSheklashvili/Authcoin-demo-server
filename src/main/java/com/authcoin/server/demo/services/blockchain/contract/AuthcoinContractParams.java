package com.authcoin.server.demo.services.blockchain.contract;

import java.math.BigDecimal;

class AuthcoinContractParams {

    static final String AUTHCOIN_CONTRACT_ADDRESS = "80adeaeed6dc75be151ba23f7fed1c9d012b4b17";

    static final int FUNCTION_GAS_LIMIT = 6721975;
    static final int GAS_LIMIT = 25000;
    static final int GAS_PRICE = 40;
    static final BigDecimal FEE_PER_KB = BigDecimal.valueOf(0.004);
    static final BigDecimal FEE = BigDecimal.valueOf(1.2);
}
