package com.gen.app.server.helloworld

import com.gen.app.core.helloworld.HelloWorldResource
import com.gen.app.core.helloworld.model.SayItParameters
import com.gen.app.wrappers.HelloWorld
import kotlin.String
import org.web3j.openapi.core.models.PrimitivesModel

class HelloWorldResourceImpl(
    private val helloWorld: HelloWorld
) : HelloWorldResource {
    override fun hello(): PrimitivesModel<String> =
        org.web3j.openapi.core.models.PrimitivesModel<kotlin.String>(helloWorld.hello().send())
    override fun sayIt(sayItParameters: SayItParameters): PrimitivesModel<String> =
        org.web3j.openapi.core.models.PrimitivesModel<kotlin.String>(
            helloWorld.sayIt(
                sayItParameters.greeting
            ).send()
        )
}
