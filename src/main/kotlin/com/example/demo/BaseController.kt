package com.example.demo

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Frank Wang
 */
@Api(tags = ["Test Controller"])
@RestController
class BaseController {

  @ApiOperation("test")
  @GetMapping("/api/public/test")
  fun test(): AppResponse<String> {
    return AppResponse()
  }
}
