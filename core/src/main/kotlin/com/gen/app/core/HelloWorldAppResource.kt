package com.gen.app.core

import com.gen.app.core.helloworld.HelloWorldLifecycle
import javax.annotation.processing.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.ContractResource

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface HelloWorldAppResource : ContractResource {

    @get:Path("helloworld")
    val helloWorld: HelloWorldLifecycle
}
