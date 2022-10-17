package university;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void test() {
		University u = UniversityFactory.eINSTANCE.createUniversity();
		Faculty f = UniversityFactory.eINSTANCE.createFaculty();

	}

}
