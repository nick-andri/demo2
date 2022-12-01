package com.example.demo.tools;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;



/**
 * The type Dto tools.
 */
@Component
public class DtoTools {

    private static final ModelMapper myMapper = new ModelMapper();

    public static <TSource,TDestination> TDestination convert(TSource obj, Class<TDestination> clazz) {


        return myMapper.map(obj, clazz);
    }
}

