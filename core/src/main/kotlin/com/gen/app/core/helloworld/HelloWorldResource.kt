package com.gen.app.core.helloworld

import com.gen.app.core.helloworld.model.SayItParameters
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.processing.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface HelloWorldResource {
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Hello")
    @Operation(tags = ["HelloWorld"], summary = "Execute the Hello method")
    @GET
    fun hello(): org.web3j.openapi.core.models.PrimitivesModel<kotlin.String>

    @Produces(MediaType.APPLICATION_JSON)
    @Path("SayIt")
    @Operation(tags = ["HelloWorld"], summary = "Execute the SayIt method")
    @POST
    fun sayIt(sayItParameters: SayItParameters): org.web3j.openapi.core.models.PrimitivesModel<kotlin.String>
}
