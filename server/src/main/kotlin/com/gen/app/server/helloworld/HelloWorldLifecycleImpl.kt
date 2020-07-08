package com.gen.app.server.helloworld

import com.gen.app.core.helloworld.HelloWorldLifecycle
import com.gen.app.wrappers.HelloWorld
import javax.annotation.processing.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.protocol.Web3j
import org.web3j.protocol.core.methods.response.TransactionReceipt
import org.web3j.tx.TransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldLifecycleImpl(
    private val web3j: Web3j,
    private val transactionManager: TransactionManager,
    private val defaultGasProvider: ContractGasProvider
) : HelloWorldLifecycle {

    override fun deploy(): TransactionReceipt {
        val helloWorld = HelloWorld.deploy(
            web3j,
            transactionManager,
            defaultGasProvider

        ).send()

        return helloWorld.transactionReceipt.get()
    }

    override fun load(contractAddress: String) =
        HelloWorldResourceImpl(
            HelloWorld.load(contractAddress, web3j, transactionManager, defaultGasProvider)
        )
}
