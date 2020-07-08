package com.gen.app.server

import org.web3j.openapi.server.spi.OpenApiResourceProvider

class HelloWorldAppResourceProvider : OpenApiResourceProvider {
    override fun get() = HelloWorldAppApiImpl::class.java
}
