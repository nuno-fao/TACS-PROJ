/**
 */
package cV.util;

import cV.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cV.CVPackage
 * @generated
 */
public class CVValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CVValidator INSTANCE = new CVValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cV";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CVPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CVPackage.CV:
				return validateCV((CV)value, diagnostics, context);
			case CVPackage.SECTION:
				return validateSection((Section)value, diagnostics, context);
			case CVPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case CVPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case CVPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case CVPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case CVPackage.URL:
				return validateURL((URL)value, diagnostics, context);
			case CVPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case CVPackage.BIBLIOGRAPHIC_ENTRY:
				return validateBibliographicEntry((BibliographicEntry)value, diagnostics, context);
			case CVPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case CVPackage.TABLE_ROW:
				return validateTableRow((TableRow)value, diagnostics, context);
			case CVPackage.PERSONAL_DATA:
				return validatePersonalData((PersonalData)value, diagnostics, context);
			case CVPackage.CONTACTS:
				return validateContacts((Contacts)value, diagnostics, context);
			case CVPackage.EDUCATION:
				return validateEducation((Education)value, diagnostics, context);
			case CVPackage.JOB_ENTRY:
				return validateJobEntry((JobEntry)value, diagnostics, context);
			case CVPackage.EDUCATION_ENTRY:
				return validateEducationEntry((EducationEntry)value, diagnostics, context);
			case CVPackage.WORK_EXPERIENCE:
				return validateWorkExperience((WorkExperience)value, diagnostics, context);
			case CVPackage.SKILLS:
				return validateSkills((Skills)value, diagnostics, context);
			case CVPackage.SKILL_ENTRY:
				return validateSkillEntry((SkillEntry)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cv, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_obligatory_personal_data_section(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_obligatory_contacts_section(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_at_most_one_education_section(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_at_most_one_work_experience_section(cv, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the obligatory_personal_data_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CV__OBLIGATORY_PERSONAL_DATA_SECTION__EEXPRESSION = "PersonalData.allInstances()->size() = 1";

	/**
	 * Validates the obligatory_personal_data_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV_obligatory_personal_data_section(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.CV,
				 cv,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "obligatory_personal_data_section",
				 CV__OBLIGATORY_PERSONAL_DATA_SECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the obligatory_contacts_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CV__OBLIGATORY_CONTACTS_SECTION__EEXPRESSION = "Contacts.allInstances()->size() = 1";

	/**
	 * Validates the obligatory_contacts_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV_obligatory_contacts_section(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.CV,
				 cv,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "obligatory_contacts_section",
				 CV__OBLIGATORY_CONTACTS_SECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the at_most_one_education_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CV__AT_MOST_ONE_EDUCATION_SECTION__EEXPRESSION = "Education.allInstances()->size() <= 1";

	/**
	 * Validates the at_most_one_education_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV_at_most_one_education_section(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.CV,
				 cv,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_most_one_education_section",
				 CV__AT_MOST_ONE_EDUCATION_SECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the at_most_one_work_experience_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CV__AT_MOST_ONE_WORK_EXPERIENCE_SECTION__EEXPRESSION = "WorkExperience.allInstances()->size() <= 1";

	/**
	 * Validates the at_most_one_work_experience_section constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV_at_most_one_work_experience_section(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.CV,
				 cv,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_most_one_work_experience_section",
				 CV__AT_MOST_ONE_WORK_EXPERIENCE_SECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(section, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURL(URL url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(url, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographicEntry(BibliographicEntry bibliographicEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bibliographicEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bibliographicEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateBibliographicEntry_check_year(bibliographicEntry, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the check_year constraint of '<em>Bibliographic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BIBLIOGRAPHIC_ENTRY__CHECK_YEAR__EEXPRESSION = "self.year > 0";

	/**
	 * Validates the check_year constraint of '<em>Bibliographic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographicEntry_check_year(BibliographicEntry bibliographicEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY,
				 bibliographicEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "check_year",
				 BIBLIOGRAPHIC_ENTRY__CHECK_YEAR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_rows_same_length_as_header(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the rows_same_length_as_header constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__ROWS_SAME_LENGTH_AS_HEADER__EEXPRESSION = "self.header->size() = 1 implies self.rows->forAll(r | r.items->size() = self.header->size())";

	/**
	 * Validates the rows_same_length_as_header constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_rows_same_length_as_header(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.TABLE,
				 table,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rows_same_length_as_header",
				 TABLE__ROWS_SAME_LENGTH_AS_HEADER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRow(TableRow tableRow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableRow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalData(PersonalData personalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContacts(Contacts contacts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contacts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducation(Education education, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(education, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobEntry(JobEntry jobEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jobEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducationEntry(EducationEntry educationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(educationEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkExperience(WorkExperience workExperience, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workExperience, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkills(Skills skills, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skills, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkillEntry(SkillEntry skillEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(skillEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(skillEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateSkillEntry_limit_value(skillEntry, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the limit_value constraint of '<em>Skill Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SKILL_ENTRY__LIMIT_VALUE__EEXPRESSION = "self.skillValue >= 1 and self.skillValue <= 5";

	/**
	 * Validates the limit_value constraint of '<em>Skill Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkillEntry_limit_value(SkillEntry skillEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CVPackage.Literals.SKILL_ENTRY,
				 skillEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "limit_value",
				 SKILL_ENTRY__LIMIT_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CVValidator
