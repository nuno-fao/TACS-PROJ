/**
 */
package cV.impl;

import cV.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CVFactoryImpl extends EFactoryImpl implements CVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CVFactory init() {
		try {
			CVFactory theCVFactory = (CVFactory)EPackage.Registry.INSTANCE.getEFactory(CVPackage.eNS_URI);
			if (theCVFactory != null) {
				return theCVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CVPackage.CV: return createCV();
			case CVPackage.SECTION: return createSection();
			case CVPackage.FIELD: return createField();
			case CVPackage.ITEM: return createItem();
			case CVPackage.TEXT: return createText();
			case CVPackage.DATE: return createDate();
			case CVPackage.URL: return createURL();
			case CVPackage.IMAGE: return createImage();
			case CVPackage.BIBLIOGRAPHIC_ENTRY: return createBibliographicEntry();
			case CVPackage.TABLE: return createTable();
			case CVPackage.TABLE_ROW: return createTableRow();
			case CVPackage.PERSONAL_DATA: return createPersonalData();
			case CVPackage.CONTACTS: return createContacts();
			case CVPackage.EDUCATION: return createEducation();
			case CVPackage.JOB_ENTRY: return createJobEntry();
			case CVPackage.EDUCATION_ENTRY: return createEducationEntry();
			case CVPackage.WORK_EXPERIENCE: return createWorkExperience();
			case CVPackage.SKILLS: return createSkills();
			case CVPackage.SKILL_ENTRY: return createSkillEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV createCV() {
		CVImpl cv = new CVImpl();
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURL() {
		URLImpl url = new URLImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographicEntry createBibliographicEntry() {
		BibliographicEntryImpl bibliographicEntry = new BibliographicEntryImpl();
		return bibliographicEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalData createPersonalData() {
		PersonalDataImpl personalData = new PersonalDataImpl();
		return personalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacts createContacts() {
		ContactsImpl contacts = new ContactsImpl();
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Education createEducation() {
		EducationImpl education = new EducationImpl();
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEntry createJobEntry() {
		JobEntryImpl jobEntry = new JobEntryImpl();
		return jobEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationEntry createEducationEntry() {
		EducationEntryImpl educationEntry = new EducationEntryImpl();
		return educationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkExperience createWorkExperience() {
		WorkExperienceImpl workExperience = new WorkExperienceImpl();
		return workExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skills createSkills() {
		SkillsImpl skills = new SkillsImpl();
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillEntry createSkillEntry() {
		SkillEntryImpl skillEntry = new SkillEntryImpl();
		return skillEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVPackage getCVPackage() {
		return (CVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CVPackage getPackage() {
		return CVPackage.eINSTANCE;
	}

} //CVFactoryImpl
