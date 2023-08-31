package com.gezilecek_yerler.gezilecek_yerler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig
{
    private ApiInfo apiInfo()
    {
        Contact contact = new Contact("Nurcan Yardımcı", "", "nurcann.yrdmc@gmail.com");
        String descr = "Rest gezilecekYerler endpoints...";
        List<VendorExtension> extensions = new ArrayList<>();
        extensions.add(new StringVendorExtension("vendor name", "vendor value"));
        String version = "V1.0";
        String title = "Gezilecek Yerler Rest api";
        ApiInfo apiInfo = new ApiInfoBuilder().contact(contact).description(descr).extensions(extensions).title(title).version(version).build();
        return apiInfo;
    }
    @Bean
    public Docket api()
    {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo());
        docket.host("localhost:8080");
        docket = docket.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
        return docket;
    }
    @Bean public UiConfiguration uiConfig()
    {
        return UiConfigurationBuilder.builder().deepLinking(true).displayOperationId(false).defaultModelsExpandDepth(1).defaultModelExpandDepth(1).defaultModelRendering(ModelRendering.EXAMPLE).displayRequestDuration(false).docExpansion(DocExpansion.NONE).filter(false).maxDisplayedTags(null).operationsSorter(OperationsSorter.ALPHA).showExtensions(false).tagsSorter(TagsSorter.ALPHA).supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS).validatorUrl(null).build();
    }
}