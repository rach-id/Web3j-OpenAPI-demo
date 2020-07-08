package com.gen.app.server

import com.gen.app.core.HelloWorldAppResource
import com.gen.app.server.helloworld.HelloWorldLifecycleImpl
import javax.annotation.processing.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.ContractResourceImpl
import org.web3j.protocol.Web3j
import org.web3j.tx.TransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
class HelloWorldAppResourceImpl(
    web3j: Web3j,
    transactionManager: TransactionManager,
    defaultGasProvider: ContractGasProvider,
    uriInfo: ExtendedUriInfo
) : HelloWorldAppResource, ContractResourceImpl(uriInfo) {

    override val helloWorld = HelloWorldLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider
    )
}
