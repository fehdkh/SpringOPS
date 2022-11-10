package tn.esprit.rh.achat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

import java.util.List;

import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.services.IFactureService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class FactureServiceImplTest {

	
	@Autowired
	IFactureService fc;
	
	@Test
	@Order(1)
	public void testRetrieveAllFactures() {
		List<Facture> listFactures = fc.retrieveAllFactures();
		Assertions.assertEquals(0, listFactures.size());
	}
}
