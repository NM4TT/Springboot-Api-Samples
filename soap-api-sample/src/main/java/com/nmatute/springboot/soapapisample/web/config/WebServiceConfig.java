package com.nmatute.springboot.soapapisample.web.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter  {

    private final String[] URL_MAPPINGS = {"/api/v1/*"};

	private final String NAMESPACE_URI = "http://www.nmatute.com/soapapisample/generated";
    private String COUNTRY_NAMESPACE_URI = NAMESPACE_URI.concat("/country");

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> 
        messageDispatcherServlet(ApplicationContext context) {

		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);

		return new 
            ServletRegistrationBean<MessageDispatcherServlet>(servlet, URL_MAPPINGS);
	}

	@Bean(name = "countries")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdlDefinition = new DefaultWsdl11Definition();
		wsdlDefinition.setPortTypeName("CountriesPort");
		wsdlDefinition.setLocationUri("/api/v1");
		
		wsdlDefinition
			.setTargetNamespace(COUNTRY_NAMESPACE_URI);

		wsdlDefinition.setSchema(schema);

		wsdlDefinition.setCreateSoap12Binding(true);
		wsdlDefinition.setCreateSoap11Binding(false);

		return wsdlDefinition;
	}

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("./schema/Countries.xsd"));
    }

	@Bean
	public SaajSoapMessageFactory messageFactory() {
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		messageFactory.setSoapVersion(SoapVersion.SOAP_12);
		return messageFactory;
	}

}