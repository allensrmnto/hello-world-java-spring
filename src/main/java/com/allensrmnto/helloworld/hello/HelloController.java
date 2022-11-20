package com.allensrmnto.helloworld.hello;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }

  @GetMapping("/hello-param-name-specified")
  public String helloParamNameSpecified(@RequestParam(name = "name") String userName) {
    return "Hello " + userName + "!";
  }

  @GetMapping("/hello-not-required")
  public String helloNotRequired(@RequestParam(required = false) String name) {
    if (name != null) {
      return "Hello " + name + "!";
    }
    return "Hello!";
  }

  @GetMapping("/hello-not-required-optional")
  public String helloNotRequiredOptional(@RequestParam Optional<String> name) {
    if (name.isPresent()) {
      return "Hello " + name.get() + "!";
    }
    return "Hello!";
  }

  @GetMapping("/hello-default")
  public String helloDefault(@RequestParam(defaultValue = "test") String name) {
    return "Hello " + name + "!";
  }

  @GetMapping("/hello-with-path/{name}")
  public String helloWithPath(@PathVariable String name) {
    return "Hello " + name + "!";
  }
}
