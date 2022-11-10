package tn.esprit.rh.achat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.repositories.FactureRepository;
import tn.esprit.rh.achat.services.FactureServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class FactureServiceImplMock {

	@Mock
	FactureRepository factureRepository;
	
	@InjectMocks
	FactureServiceImpl factureService;
	
	Facture facture = new Facture();
	List<Facture> listFactures = new ArrayList<Facture>();
	
	@Test
	public void testRetrieveFactureMock() {
		Mockito.when(factureRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(facture));
		Facture facture2 = factureService.retrieveFacture((long) 1);
		Assertions.assertNotNull(facture2);
		
		
		
	}

}
