package com.ocp.generic;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPipelineComponents {

  public static void main(String[] args) {
    Method[] objectMethods = Object.class.getMethods();
    Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
    Stream<String> objectMethodNames = objectMethodStream.map(
        method -> method.getName()
    );
    Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
    uniqueObjectMethodNames.forEach(System.out::println);


  }
}
