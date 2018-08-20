package com.chenqiguang.springboot.spec.api;

import com.chenqiguang.springboot.Response;
import com.chenqiguang.springboot.spec.model.Hello;

import com.chenqiguang.springboot.fixture.FixtureService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;


@Api(value = "Hello", description = "the Hello API")
public interface HelloApi {

    @ApiOperation(value = "hello", notes = "hello", response = Response.class, authorizations = {
        @Authorization(value = "X-Access-Token"),
        @Authorization(value = "X-Operation-Token")
    }, tags={ "helloSwaggerCodegen", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "统一返回", response = Response.class) })
    @RequestMapping(value = "/Hello/getHello",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default Response getHello( @NotNull @ApiParam(value = "金钱", required = true) @RequestParam(value = "money", required = true) String money,@ApiParam(value = "hello" ,required=true ) @RequestBody Hello hello) {
        Object[] params = new Object[] { money, hello };
        return FixtureService.getInstance().get(Response.class, HelloApi.class, "getHello", params);
    }

}
