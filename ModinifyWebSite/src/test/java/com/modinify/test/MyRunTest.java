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
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("Home"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("Sobre"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("Serviços"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("Contato"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Mais que tecnologia, nossa paixão"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Novos sistemas e customizações precisam ser desenvolvidos atendendo as necessidades do cliente e não as premissas de tecnologia. Qualidade deve ser a base de tudo e não um diferencial. Mas os modelos de desenvolvimento de software tradicionais não acompanharam a evolução das empresas, que necessitam de mais agilidade e qualidade."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Pensando nisso, Richard Ferraresi e Aline Borges criaram uma estrutura de atendimento com fábricas e unidades fora do Brasil. Aplicaram conceitos de agilidade, com pequenas entregas e muita interação com o cliente, complementadas por testes automatizados e ferramentas de acompanhamento, trazendo mais qualidade em nossas soluções."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("É uma fábrica diferente e moderna, que acompanha as novas tendências e, acima de tudo, o tempo dos clientes e dos negócios, com qualidade e eficiência."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Conheça nossa fábrica, conheça a MOD!"));
		
		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("Um processo ágil e seguro"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Especificações atualizadas,"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objetivas e dinâmicas"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Testes automatizados e"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("acompanhamento online"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Centro de desenvolvimento no exterior"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("com atendimento brasileiro"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("solução inovadora"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("e inteligente"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("uma nova maneira"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("de pensar"));
		
		// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Entre em contato conosco"));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Conheça nosso time e processo de desenvolvimento"));

		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("Brasil"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("Avenida Angélica, 2223 - Sala 802"));
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação - CEP 01227-200"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("São Paulo - SP"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455-7547"));
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
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Mod!"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("Home"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("About"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("Services"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("Contact"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("More than technology, our passion"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("New solutions, changes and features need to be delivered filling clients needs instead of technology requirements. In addition, quality should be basis of everything and not an asset. However, the traditional software development models is not following the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with development centers and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing better results on our solutions."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("Our development process is different and modern. Above all, we believe our passion for technology will make your experience outstanding."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our team, meet MOD!"));

		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("An agile and safe process"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Living documentations,"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking"));

		// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit or contact us."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223 Angelica Avenue, Office 802"));
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação São Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
			
		// Testing for Indian Address parameters
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Issac's Utility Point, 2nd Floor"));	
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
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("Home"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("About"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("Services"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("Contact"));
		
		//Testing for the display messages inside the About Page
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("More than technology, our passion"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("New solutions, changes and features need to be delivered filling clients needs instead of technology requirements. In addition, quality should be basis of everything and not an asset. However, the traditional software development models is not following the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with development centers and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing better results on our solutions."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("Our development process is different and modern. Above all, we believe our passion for technology will make your experience outstanding."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our team, meet MOD!"));		
		
		// Testing for the Figure Messages in Service Page
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("An agile and safe process"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Living documentations,"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking"));
		
		// Testing for contact page Display
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit or contact us."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
		
		// Testing for The Brazil Address parameters
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223 Angelica Avenue, Office 802"));										 
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação São Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));			
		
		// Testing for Indian Address parameters
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Issac's Utility Point, 2nd Floor"));
		assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
		assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Zip Code 682030, Kochi, Kerala"));
		assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));	
		assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));}
	}

