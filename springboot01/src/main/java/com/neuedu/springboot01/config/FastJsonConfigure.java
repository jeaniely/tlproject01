package com.neuedu.springboot01.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class FastJsonConfigure {

    @Bean
    public HttpMessageConverters fastJsonMessageConverter(){
        //1、创建FastJson信息转换对象
        FastJsonHttpMessageConverter fastJsonHttpMessage=new FastJsonHttpMessageConverter();
        //2、创建FastJsonConfig对象并设定序列化规则  序列化规则详见SerializerFeature类中，后面会讲
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        //时间
        fastJsonConfig.setDateFormat("yyyy-MM-dd");

        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat,
                SerializerFeature.QuoteFieldNames,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.DisableCircularReferenceDetect
        );
        //fastJsonConfig.setCharset(Charset.forName("UTF-8"));

        //3、中文乱码解决方案        fastJsonHttpMessage.setFastJsonConfig(fastJsonConfig);
        List<MediaType> mediaTypeList=new ArrayList<>();
        mediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonHttpMessage.setSupportedMediaTypes(mediaTypeList);
        //4、将转换规则应用于转换对象
        fastJsonHttpMessage.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters(fastJsonHttpMessage);
    }
}
