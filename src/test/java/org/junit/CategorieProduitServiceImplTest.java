package org.junit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.repositories.CategorieProduitRepository;
import tn.esprit.rh.achat.services.ICategorieProduitService;


import static org.junit.Assert.assertNotNull;

import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategorieProduitServiceImplTest {

    @Autowired
    CategorieProduitRepository cp;
    @Autowired
    ICategorieProduitService rs;


    @Test
    public void testAddCategorieProduit() {
        CategorieProduit produitCateg = new CategorieProduit("test", "test" );
        CategorieProduit savedSecteurActivite = rs.addCategorieProduit(produitCateg);
        assertNotNull(savedSecteurActivite.getIdCategorieProduit());
        rs.deleteCategorieProduit(savedSecteurActivite.getIdCategorieProduit());

    }







}
