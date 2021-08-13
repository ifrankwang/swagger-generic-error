package com.example.demo

import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.schema.AlternateTypeRules
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import java.lang.reflect.WildcardType

@SpringBootApplication
class DemoApplication {

  @Bean
  fun docket(): Docket {
    return Docket(DocumentationType.SWAGGER_2)
      .useDefaultResponseMessages(false)
      .forCodeGeneration(true)
      .select()
      .apis(RequestHandlerSelectors.withClassAnnotation(Api::class.java))
      .build()
  }
}

fun main(args: Array<String>) {
  runApplication<DemoApplication>(*args)
}
