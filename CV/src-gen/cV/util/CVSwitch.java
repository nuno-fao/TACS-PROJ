/**
 */
package cV.util;

import cV.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cV.CVPackage
 * @generated
 */
public class CVSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CVPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSwitch() {
		if (modelPackage == null) {
			modelPackage = CVPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CVPackage.CV: {
			CV cv = (CV) theEObject;
			T result = caseCV(cv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.SECTION: {
			Section section = (Section) theEObject;
			T result = caseSection(section);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseItem(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.DATE: {
			Date date = (Date) theEObject;
			T result = caseDate(date);
			if (result == null)
				result = caseItem(date);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.URL: {
			URL url = (URL) theEObject;
			T result = caseURL(url);
			if (result == null)
				result = caseItem(url);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseItem(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.BIBLIOGRAPHIC_ENTRY: {
			BibliographicEntry bibliographicEntry = (BibliographicEntry) theEObject;
			T result = caseBibliographicEntry(bibliographicEntry);
			if (result == null)
				result = caseItem(bibliographicEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.TABLE_ROW: {
			TableRow tableRow = (TableRow) theEObject;
			T result = caseTableRow(tableRow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.PERSONAL_DATA: {
			PersonalData personalData = (PersonalData) theEObject;
			T result = casePersonalData(personalData);
			if (result == null)
				result = caseSection(personalData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.CONTACTS: {
			Contacts contacts = (Contacts) theEObject;
			T result = caseContacts(contacts);
			if (result == null)
				result = caseSection(contacts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.EDUCATION: {
			Education education = (Education) theEObject;
			T result = caseEducation(education);
			if (result == null)
				result = caseSection(education);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.JOB_ENTRY: {
			JobEntry jobEntry = (JobEntry) theEObject;
			T result = caseJobEntry(jobEntry);
			if (result == null)
				result = caseItem(jobEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.EDUCATION_ENTRY: {
			EducationEntry educationEntry = (EducationEntry) theEObject;
			T result = caseEducationEntry(educationEntry);
			if (result == null)
				result = caseItem(educationEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.WORK_EXPERIENCE: {
			WorkExperience workExperience = (WorkExperience) theEObject;
			T result = caseWorkExperience(workExperience);
			if (result == null)
				result = caseSection(workExperience);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.SKILLS: {
			Skills skills = (Skills) theEObject;
			T result = caseSkills(skills);
			if (result == null)
				result = caseSection(skills);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CVPackage.SKILL_ENTRY: {
			SkillEntry skillEntry = (SkillEntry) theEObject;
			T result = caseSkillEntry(skillEntry);
			if (result == null)
				result = caseItem(skillEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCV(CV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURL(URL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliographic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliographic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographicEntry(BibliographicEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalData(PersonalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContacts(Contacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Education</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Education</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEducation(Education object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobEntry(JobEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Education Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Education Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEducationEntry(EducationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkExperience(WorkExperience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skills</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skills</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkills(Skills object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillEntry(SkillEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CVSwitch
