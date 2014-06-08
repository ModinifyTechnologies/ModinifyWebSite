package com.modinify.test;

import static org.junit.Assert.assertTrue;
import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.Test;
import com.modinify.messages.MessageBundle;


public class MyRunTest {
	// Testing in the Brazilian Bundle properties
	@Test
	public void checkingBrazilianBundle(){
		Locale locale = new Locale("pt", "BR");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		
		// Testing Index titles
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Mod! Brasil"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("SOBRE"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVIÇOS"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTATO"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Sua nova fábrica de soluções"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Desenvolvimento de sistemas, modificações e novas funcionalidades precisam ser implementadas atendendo as necessidades do cliente e não as premissas de tecnologia. Qualidade deve ser a base de tudo e não um diferencial.Mas os modelos de desenvolvimento de software tradicionais não acompanharam a evolução e as necessidades do mercado atual."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Pensando nisso, Richard Ferraresi e Aline Borges criaramuma estrutura de atendimento com fábricas e unidades fora do Brasil. Aplicaramconceitos de agilidade, com pequenas entregas e muita interação com o cliente, complementadas por testes automatizados e ferramentas de acompanhamento, trazendo mais qualidade."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("É uma fábrica diferente e moderna, que acompanha as novas tendências e, acima de tudo, o tempo dos clientes e dos negócios, com qualidade e eficiência."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Conheça nossa fábrica, atender MOD!"));
		
		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("Uma fábrica diferente."));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Especificações vivas,"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("mais objetivas e dinâmicas"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Testes automatizados e"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("acompanhamento online"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Centro de desenvolvimento no exterior"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("com atendimento brasileiro"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("solução inovadora"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("e inteligente"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("uma nova maneira"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("de pensar software"));
		
	// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Venha nos visitar ou entre em contato conosco."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Conheça nosso time e processo de desenvolvimento."));

		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("Brasil"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("Avenida Angélica, 2223 - Sala 802"));
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação - CEP 01227-200"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("São Paulo - SP"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("11 3455-7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
		
		// Testing for Indian Address parameters
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("ÍNDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Issac's Utility Point, 2nd Floor"));
		assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
		assertTrue(bundle.getString(MessageBundle.ADIN4).equals("682030, Kerala"));
		assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));
		assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));}

	// Testing in the Default Bundle properties
	@Test
	public void checkingDefaultBundle(){
		Locale locale = new Locale("", "");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		// Testing Index titles 
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Modinify"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("ABOUT"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVICES"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTACT"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Your new factory solutions"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Systems development, changes and new features need to be delivered meeting the clients needs and not technology premises. In addition, quality should be the basis of everything and not a differential.However, the traditional software development models did not follow the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with factories and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing more quality."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("It is a different and modern factory, which follows new trends and, above all, the time of marketing of our clients, with quality and efficiency"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));

		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("A Different Factory"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Alive specifications,more"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking software"));

		// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit us or contact us."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223AngelicaAvenue, Office 802"));
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200, Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
			
		// Testing for Indian Address parameters
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Bldg 10/59 D3a, Issac's Utility Point, 2nd Floor"));	
		assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
		assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Zip Code 682030, Kochi, Kerala"));
		assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));		
		assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));}

	//Testing in US property Bundle
	@Test
	public void checkingUSBundle(){
		Locale locale = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		// Testing Index titles 
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Mod!"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("ABOUT"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVICES"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTACT"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Your new factory solutions"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Systems development, changes and new features need to be delivered meeting the clients needs and not technology premises. In addition, quality should be the basis of everything and not a differential.However, the traditional software development models did not follow the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with factories and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing more quality."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("It is a different and modern factory, which follows new trends and, above all, the time of marketing of our clients, with quality and efficiency"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));		
		
		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("A Different Factory"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Alive specifications,more"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking software"));
		
		// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit us or contact us."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223AngelicaAvenue, Office 802"));										 
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200, Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));			
		
		// Testing for Indian Address parameters
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Bldg 10/59 D3a, Issac's Utility Point, 2nd Floor"));
		assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
		assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Zip Code 682030, Kochi, Kerala"));
		assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));	
		assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));}
	}

