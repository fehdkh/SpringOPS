package tn.esprit.rh.achat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class FactureServiceImplMock {

	/*@Mock
	FactureRepository factureRepository;
	
	@InjectMocks
	FactureServiceImpl factureService;
	
	Facture facture = new Facture();
	List<Facture> listFactures = new ArrayList<Facture>();
	
	@Test
	public void testRetrieveFacture() {
		Mockito.when(factureRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(facture));
		Facture facture2 = factureService.retrieveFacture((long) 1);
		Assertions.assertNotNull(facture2);
	}*/

}
