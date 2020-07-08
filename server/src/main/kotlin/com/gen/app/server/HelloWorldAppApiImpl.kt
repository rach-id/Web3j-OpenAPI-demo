package com.gen.app.server

import com.gen.app.core.HelloWorldAppApi
import javax.annotation.processing.Generated
import javax.inject.Inject
import javax.ws.rs.core.Context
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.crypto.Credentials
import org.web3j.protocol.Web3j
import org.web3j.tx.RawTransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
class HelloWorldAppApiImpl @Inject constructor(
    web3j: Web3j,
    credentials: Credentials,
    gasProvider: ContractGasProvider,
    @Context uriInfo: ExtendedUriInfo
) : HelloWorldAppApi {

    override val contracts = HelloWorldAppResourceImpl(
        web3j, RawTransactionManager(web3j, credentials), gasProvider, uriInfo
    )
}
