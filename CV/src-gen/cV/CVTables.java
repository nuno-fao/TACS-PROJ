/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /CV/model/cV.ecore
 * using:
 *   /CV/model/cV.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package cV;

// import cV.CVPackage;
// import cV.CVTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CVTables provides the dispatch tables for the cV for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CVTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CVPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_cV = IdManager.getNsURIPackageId("http://www.example.org/cV", null, CVPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_BibliographicEntry = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("BibliographicEntry", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CV = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("CV", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = CVTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Contacts = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Contacts", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Date = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Date", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Education = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Education", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EducationEntry = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("EducationEntry", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Field = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Field", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Image = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Image", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_JobEntry = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("JobEntry", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PersonalData = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("PersonalData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Section = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Section", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SkillEntry = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("SkillEntry", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Skills = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Skills", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Table", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TableRow = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("TableRow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Text = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("Text", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_URL = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("URL", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkExperience = CVTables.PACKid_http_c_s_s_www_example_org_s_cV.getClassId("WorkExperience", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = CVTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EducationEntry = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_EducationEntry);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Field = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_Field);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Item = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_JobEntry = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_JobEntry);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Section = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_Section);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SkillEntry = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_SkillEntry);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TableRow = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_TableRow);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_URL = TypeId.ORDERED_SET.getSpecializedId(CVTables.CLSSid_URL);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Contacts = TypeId.SET.getSpecializedId(CVTables.CLSSid_Contacts);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Education = TypeId.SET.getSpecializedId(CVTables.CLSSid_Education);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PersonalData = TypeId.SET.getSpecializedId(CVTables.CLSSid_PersonalData);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_WorkExperience = TypeId.SET.getSpecializedId(CVTables.CLSSid_WorkExperience);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CVTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _BibliographicEntry = new EcoreExecutorType(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY, PACKAGE, 0);
		public static final EcoreExecutorType _CV = new EcoreExecutorType(CVPackage.Literals.CV, PACKAGE, 0);
		public static final EcoreExecutorType _Contacts = new EcoreExecutorType(CVPackage.Literals.CONTACTS, PACKAGE, 0);
		public static final EcoreExecutorType _Date = new EcoreExecutorType(CVPackage.Literals.DATE, PACKAGE, 0);
		public static final EcoreExecutorType _Education = new EcoreExecutorType(CVPackage.Literals.EDUCATION, PACKAGE, 0);
		public static final EcoreExecutorType _EducationEntry = new EcoreExecutorType(CVPackage.Literals.EDUCATION_ENTRY, PACKAGE, 0);
		public static final EcoreExecutorType _Field = new EcoreExecutorType(CVPackage.Literals.FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _Image = new EcoreExecutorType(CVPackage.Literals.IMAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(CVPackage.Literals.ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _JobEntry = new EcoreExecutorType(CVPackage.Literals.JOB_ENTRY, PACKAGE, 0);
		public static final EcoreExecutorType _PersonalData = new EcoreExecutorType(CVPackage.Literals.PERSONAL_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _Section = new EcoreExecutorType(CVPackage.Literals.SECTION, PACKAGE, 0);
		public static final EcoreExecutorType _SkillEntry = new EcoreExecutorType(CVPackage.Literals.SKILL_ENTRY, PACKAGE, 0);
		public static final EcoreExecutorType _Skills = new EcoreExecutorType(CVPackage.Literals.SKILLS, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(CVPackage.Literals.TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _TableRow = new EcoreExecutorType(CVPackage.Literals.TABLE_ROW, PACKAGE, 0);
		public static final EcoreExecutorType _Text = new EcoreExecutorType(CVPackage.Literals.TEXT, PACKAGE, 0);
		public static final EcoreExecutorType _URL = new EcoreExecutorType(CVPackage.Literals.URL, PACKAGE, 0);
		public static final EcoreExecutorType _WorkExperience = new EcoreExecutorType(CVPackage.Literals.WORK_EXPERIENCE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BibliographicEntry,
			_CV,
			_Contacts,
			_Date,
			_Education,
			_EducationEntry,
			_Field,
			_Image,
			_Item,
			_JobEntry,
			_PersonalData,
			_Section,
			_SkillEntry,
			_Skills,
			_Table,
			_TableRow,
			_Text,
			_URL,
			_WorkExperience
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _BibliographicEntry__BibliographicEntry = new ExecutorFragment(Types._BibliographicEntry, CVTables.Types._BibliographicEntry);
		private static final ExecutorFragment _BibliographicEntry__Item = new ExecutorFragment(Types._BibliographicEntry, CVTables.Types._Item);
		private static final ExecutorFragment _BibliographicEntry__OclAny = new ExecutorFragment(Types._BibliographicEntry, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BibliographicEntry__OclElement = new ExecutorFragment(Types._BibliographicEntry, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CV__CV = new ExecutorFragment(Types._CV, CVTables.Types._CV);
		private static final ExecutorFragment _CV__OclAny = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CV__OclElement = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Contacts__Contacts = new ExecutorFragment(Types._Contacts, CVTables.Types._Contacts);
		private static final ExecutorFragment _Contacts__OclAny = new ExecutorFragment(Types._Contacts, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Contacts__OclElement = new ExecutorFragment(Types._Contacts, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Contacts__Section = new ExecutorFragment(Types._Contacts, CVTables.Types._Section);

		private static final ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, CVTables.Types._Date);
		private static final ExecutorFragment _Date__Item = new ExecutorFragment(Types._Date, CVTables.Types._Item);
		private static final ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Date__OclElement = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Education__Education = new ExecutorFragment(Types._Education, CVTables.Types._Education);
		private static final ExecutorFragment _Education__OclAny = new ExecutorFragment(Types._Education, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Education__OclElement = new ExecutorFragment(Types._Education, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Education__Section = new ExecutorFragment(Types._Education, CVTables.Types._Section);

		private static final ExecutorFragment _EducationEntry__EducationEntry = new ExecutorFragment(Types._EducationEntry, CVTables.Types._EducationEntry);
		private static final ExecutorFragment _EducationEntry__Item = new ExecutorFragment(Types._EducationEntry, CVTables.Types._Item);
		private static final ExecutorFragment _EducationEntry__OclAny = new ExecutorFragment(Types._EducationEntry, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EducationEntry__OclElement = new ExecutorFragment(Types._EducationEntry, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Field__Field = new ExecutorFragment(Types._Field, CVTables.Types._Field);
		private static final ExecutorFragment _Field__OclAny = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Field__OclElement = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Image__Image = new ExecutorFragment(Types._Image, CVTables.Types._Image);
		private static final ExecutorFragment _Image__Item = new ExecutorFragment(Types._Image, CVTables.Types._Item);
		private static final ExecutorFragment _Image__OclAny = new ExecutorFragment(Types._Image, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Image__OclElement = new ExecutorFragment(Types._Image, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, CVTables.Types._Item);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _JobEntry__Item = new ExecutorFragment(Types._JobEntry, CVTables.Types._Item);
		private static final ExecutorFragment _JobEntry__JobEntry = new ExecutorFragment(Types._JobEntry, CVTables.Types._JobEntry);
		private static final ExecutorFragment _JobEntry__OclAny = new ExecutorFragment(Types._JobEntry, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _JobEntry__OclElement = new ExecutorFragment(Types._JobEntry, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PersonalData__OclAny = new ExecutorFragment(Types._PersonalData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PersonalData__OclElement = new ExecutorFragment(Types._PersonalData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PersonalData__PersonalData = new ExecutorFragment(Types._PersonalData, CVTables.Types._PersonalData);
		private static final ExecutorFragment _PersonalData__Section = new ExecutorFragment(Types._PersonalData, CVTables.Types._Section);

		private static final ExecutorFragment _Section__OclAny = new ExecutorFragment(Types._Section, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Section__OclElement = new ExecutorFragment(Types._Section, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Section__Section = new ExecutorFragment(Types._Section, CVTables.Types._Section);

		private static final ExecutorFragment _SkillEntry__Item = new ExecutorFragment(Types._SkillEntry, CVTables.Types._Item);
		private static final ExecutorFragment _SkillEntry__OclAny = new ExecutorFragment(Types._SkillEntry, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SkillEntry__OclElement = new ExecutorFragment(Types._SkillEntry, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SkillEntry__SkillEntry = new ExecutorFragment(Types._SkillEntry, CVTables.Types._SkillEntry);

		private static final ExecutorFragment _Skills__OclAny = new ExecutorFragment(Types._Skills, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Skills__OclElement = new ExecutorFragment(Types._Skills, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Skills__Section = new ExecutorFragment(Types._Skills, CVTables.Types._Section);
		private static final ExecutorFragment _Skills__Skills = new ExecutorFragment(Types._Skills, CVTables.Types._Skills);

		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, CVTables.Types._Table);

		private static final ExecutorFragment _TableRow__OclAny = new ExecutorFragment(Types._TableRow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TableRow__OclElement = new ExecutorFragment(Types._TableRow, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TableRow__TableRow = new ExecutorFragment(Types._TableRow, CVTables.Types._TableRow);

		private static final ExecutorFragment _Text__Item = new ExecutorFragment(Types._Text, CVTables.Types._Item);
		private static final ExecutorFragment _Text__OclAny = new ExecutorFragment(Types._Text, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Text__OclElement = new ExecutorFragment(Types._Text, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Text__Text = new ExecutorFragment(Types._Text, CVTables.Types._Text);

		private static final ExecutorFragment _URL__Item = new ExecutorFragment(Types._URL, CVTables.Types._Item);
		private static final ExecutorFragment _URL__OclAny = new ExecutorFragment(Types._URL, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _URL__OclElement = new ExecutorFragment(Types._URL, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _URL__URL = new ExecutorFragment(Types._URL, CVTables.Types._URL);

		private static final ExecutorFragment _WorkExperience__OclAny = new ExecutorFragment(Types._WorkExperience, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkExperience__OclElement = new ExecutorFragment(Types._WorkExperience, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkExperience__Section = new ExecutorFragment(Types._WorkExperience, CVTables.Types._Section);
		private static final ExecutorFragment _WorkExperience__WorkExperience = new ExecutorFragment(Types._WorkExperience, CVTables.Types._WorkExperience);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _BibliographicEntry__author = new EcoreExecutorProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__AUTHOR, Types._BibliographicEntry, 0);
		public static final ExecutorProperty _BibliographicEntry__description = new EcoreExecutorProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__DESCRIPTION, Types._BibliographicEntry, 1);
		public static final ExecutorProperty _BibliographicEntry__title = new EcoreExecutorProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__TITLE, Types._BibliographicEntry, 2);
		public static final ExecutorProperty _BibliographicEntry__url = new EcoreExecutorProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__URL, Types._BibliographicEntry, 3);
		public static final ExecutorProperty _BibliographicEntry__year = new EcoreExecutorProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__YEAR, Types._BibliographicEntry, 4);

		public static final ExecutorProperty _CV__name = new EcoreExecutorProperty(CVPackage.Literals.CV__NAME, Types._CV, 0);
		public static final ExecutorProperty _CV__sections = new EcoreExecutorProperty(CVPackage.Literals.CV__SECTIONS, Types._CV, 1);

		public static final ExecutorProperty _Contacts__email = new EcoreExecutorProperty(CVPackage.Literals.CONTACTS__EMAIL, Types._Contacts, 0);
		public static final ExecutorProperty _Contacts__links = new EcoreExecutorProperty(CVPackage.Literals.CONTACTS__LINKS, Types._Contacts, 1);
		public static final ExecutorProperty _Contacts__phone = new EcoreExecutorProperty(CVPackage.Literals.CONTACTS__PHONE, Types._Contacts, 2);

		public static final ExecutorProperty _Date__ending_date = new EcoreExecutorProperty(CVPackage.Literals.DATE__ENDING_DATE, Types._Date, 0);
		public static final ExecutorProperty _Date__start_date = new EcoreExecutorProperty(CVPackage.Literals.DATE__START_DATE, Types._Date, 1);
		public static final ExecutorProperty _Date__EducationEntry__date = new ExecutorPropertyWithImplementation("EducationEntry", Types._Date, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.EDUCATION_ENTRY__DATE));
		public static final ExecutorProperty _Date__JobEntry__date = new ExecutorPropertyWithImplementation("JobEntry", Types._Date, 3, new EcoreLibraryOppositeProperty(CVPackage.Literals.JOB_ENTRY__DATE));
		public static final ExecutorProperty _Date__PersonalData__birthdate = new ExecutorPropertyWithImplementation("PersonalData", Types._Date, 4, new EcoreLibraryOppositeProperty(CVPackage.Literals.PERSONAL_DATA__BIRTHDATE));

		public static final ExecutorProperty _Education__educationEntries = new EcoreExecutorProperty(CVPackage.Literals.EDUCATION__EDUCATION_ENTRIES, Types._Education, 0);

		public static final ExecutorProperty _EducationEntry__date = new EcoreExecutorProperty(CVPackage.Literals.EDUCATION_ENTRY__DATE, Types._EducationEntry, 0);
		public static final ExecutorProperty _EducationEntry__level = new EcoreExecutorProperty(CVPackage.Literals.EDUCATION_ENTRY__LEVEL, Types._EducationEntry, 1);
		public static final ExecutorProperty _EducationEntry__school = new EcoreExecutorProperty(CVPackage.Literals.EDUCATION_ENTRY__SCHOOL, Types._EducationEntry, 2);
		public static final ExecutorProperty _EducationEntry__title = new EcoreExecutorProperty(CVPackage.Literals.EDUCATION_ENTRY__TITLE, Types._EducationEntry, 3);
		public static final ExecutorProperty _EducationEntry__Education__educationEntries = new ExecutorPropertyWithImplementation("Education", Types._EducationEntry, 4, new EcoreLibraryOppositeProperty(CVPackage.Literals.EDUCATION__EDUCATION_ENTRIES));

		public static final ExecutorProperty _Field__items = new EcoreExecutorProperty(CVPackage.Literals.FIELD__ITEMS, Types._Field, 0);
		public static final ExecutorProperty _Field__title = new EcoreExecutorProperty(CVPackage.Literals.FIELD__TITLE, Types._Field, 1);
		public static final ExecutorProperty _Field__Section__fields = new ExecutorPropertyWithImplementation("Section", Types._Field, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.SECTION__FIELDS));
		public static final ExecutorProperty _Field__Table__field = new ExecutorPropertyWithImplementation("Table", Types._Field, 3, new EcoreLibraryOppositeProperty(CVPackage.Literals.TABLE__FIELD));

		public static final ExecutorProperty _Image__height = new EcoreExecutorProperty(CVPackage.Literals.IMAGE__HEIGHT, Types._Image, 0);
		public static final ExecutorProperty _Image__value = new EcoreExecutorProperty(CVPackage.Literals.IMAGE__VALUE, Types._Image, 1);
		public static final ExecutorProperty _Image__width = new EcoreExecutorProperty(CVPackage.Literals.IMAGE__WIDTH, Types._Image, 2);
		public static final ExecutorProperty _Image__PersonalData__photo = new ExecutorPropertyWithImplementation("PersonalData", Types._Image, 3, new EcoreLibraryOppositeProperty(CVPackage.Literals.PERSONAL_DATA__PHOTO));

		public static final ExecutorProperty _Item__Field__items = new ExecutorPropertyWithImplementation("Field", Types._Item, 0, new EcoreLibraryOppositeProperty(CVPackage.Literals.FIELD__ITEMS));
		public static final ExecutorProperty _Item__TableRow__items = new ExecutorPropertyWithImplementation("TableRow", Types._Item, 1, new EcoreLibraryOppositeProperty(CVPackage.Literals.TABLE_ROW__ITEMS));

		public static final ExecutorProperty _JobEntry__date = new EcoreExecutorProperty(CVPackage.Literals.JOB_ENTRY__DATE, Types._JobEntry, 0);
		public static final ExecutorProperty _JobEntry__description = new EcoreExecutorProperty(CVPackage.Literals.JOB_ENTRY__DESCRIPTION, Types._JobEntry, 1);
		public static final ExecutorProperty _JobEntry__employer = new EcoreExecutorProperty(CVPackage.Literals.JOB_ENTRY__EMPLOYER, Types._JobEntry, 2);
		public static final ExecutorProperty _JobEntry__title = new EcoreExecutorProperty(CVPackage.Literals.JOB_ENTRY__TITLE, Types._JobEntry, 3);
		public static final ExecutorProperty _JobEntry__WorkExperience__jobEntries = new ExecutorPropertyWithImplementation("WorkExperience", Types._JobEntry, 4, new EcoreLibraryOppositeProperty(CVPackage.Literals.WORK_EXPERIENCE__JOB_ENTRIES));

		public static final ExecutorProperty _PersonalData__about_me = new EcoreExecutorProperty(CVPackage.Literals.PERSONAL_DATA__ABOUT_ME, Types._PersonalData, 0);
		public static final ExecutorProperty _PersonalData__address = new EcoreExecutorProperty(CVPackage.Literals.PERSONAL_DATA__ADDRESS, Types._PersonalData, 1);
		public static final ExecutorProperty _PersonalData__birthdate = new EcoreExecutorProperty(CVPackage.Literals.PERSONAL_DATA__BIRTHDATE, Types._PersonalData, 2);
		public static final ExecutorProperty _PersonalData__name = new EcoreExecutorProperty(CVPackage.Literals.PERSONAL_DATA__NAME, Types._PersonalData, 3);
		public static final ExecutorProperty _PersonalData__photo = new EcoreExecutorProperty(CVPackage.Literals.PERSONAL_DATA__PHOTO, Types._PersonalData, 4);

		public static final ExecutorProperty _Section__fields = new EcoreExecutorProperty(CVPackage.Literals.SECTION__FIELDS, Types._Section, 0);
		public static final ExecutorProperty _Section__header = new EcoreExecutorProperty(CVPackage.Literals.SECTION__HEADER, Types._Section, 1);
		public static final ExecutorProperty _Section__CV__sections = new ExecutorPropertyWithImplementation("CV", Types._Section, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.CV__SECTIONS));

		public static final ExecutorProperty _SkillEntry__skillValue = new EcoreExecutorProperty(CVPackage.Literals.SKILL_ENTRY__SKILL_VALUE, Types._SkillEntry, 0);
		public static final ExecutorProperty _SkillEntry__title = new EcoreExecutorProperty(CVPackage.Literals.SKILL_ENTRY__TITLE, Types._SkillEntry, 1);
		public static final ExecutorProperty _SkillEntry__Skills__skills = new ExecutorPropertyWithImplementation("Skills", Types._SkillEntry, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.SKILLS__SKILLS));

		public static final ExecutorProperty _Skills__skills = new EcoreExecutorProperty(CVPackage.Literals.SKILLS__SKILLS, Types._Skills, 0);
		public static final ExecutorProperty _Skills__title = new EcoreExecutorProperty(CVPackage.Literals.SKILLS__TITLE, Types._Skills, 1);

		public static final ExecutorProperty _Table__field = new EcoreExecutorProperty(CVPackage.Literals.TABLE__FIELD, Types._Table, 0);
		public static final ExecutorProperty _Table__header = new EcoreExecutorProperty(CVPackage.Literals.TABLE__HEADER, Types._Table, 1);
		public static final ExecutorProperty _Table__rows = new EcoreExecutorProperty(CVPackage.Literals.TABLE__ROWS, Types._Table, 2);

		public static final ExecutorProperty _TableRow__items = new EcoreExecutorProperty(CVPackage.Literals.TABLE_ROW__ITEMS, Types._TableRow, 0);
		public static final ExecutorProperty _TableRow__Table__rows = new ExecutorPropertyWithImplementation("Table", Types._TableRow, 1, new EcoreLibraryOppositeProperty(CVPackage.Literals.TABLE__ROWS));

		public static final ExecutorProperty _Text__value = new EcoreExecutorProperty(CVPackage.Literals.TEXT__VALUE, Types._Text, 0);
		public static final ExecutorProperty _Text__Contacts__email = new ExecutorPropertyWithImplementation("Contacts", Types._Text, 1, new EcoreLibraryOppositeProperty(CVPackage.Literals.CONTACTS__EMAIL));
		public static final ExecutorProperty _Text__Contacts__phone = new ExecutorPropertyWithImplementation("Contacts", Types._Text, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.CONTACTS__PHONE));
		public static final ExecutorProperty _Text__PersonalData__about_me = new ExecutorPropertyWithImplementation("PersonalData", Types._Text, 3, new EcoreLibraryOppositeProperty(CVPackage.Literals.PERSONAL_DATA__ABOUT_ME));
		public static final ExecutorProperty _Text__PersonalData__address = new ExecutorPropertyWithImplementation("PersonalData", Types._Text, 4, new EcoreLibraryOppositeProperty(CVPackage.Literals.PERSONAL_DATA__ADDRESS));
		public static final ExecutorProperty _Text__PersonalData__name = new ExecutorPropertyWithImplementation("PersonalData", Types._Text, 5, new EcoreLibraryOppositeProperty(CVPackage.Literals.PERSONAL_DATA__NAME));

		public static final ExecutorProperty _URL__name = new EcoreExecutorProperty(CVPackage.Literals.URL__NAME, Types._URL, 0);
		public static final ExecutorProperty _URL__value = new EcoreExecutorProperty(CVPackage.Literals.URL__VALUE, Types._URL, 1);
		public static final ExecutorProperty _URL__BibliographicEntry__url = new ExecutorPropertyWithImplementation("BibliographicEntry", Types._URL, 2, new EcoreLibraryOppositeProperty(CVPackage.Literals.BIBLIOGRAPHIC_ENTRY__URL));
		public static final ExecutorProperty _URL__Contacts__links = new ExecutorPropertyWithImplementation("Contacts", Types._URL, 3, new EcoreLibraryOppositeProperty(CVPackage.Literals.CONTACTS__LINKS));

		public static final ExecutorProperty _WorkExperience__jobEntries = new EcoreExecutorProperty(CVPackage.Literals.WORK_EXPERIENCE__JOB_ENTRIES, Types._WorkExperience, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _BibliographicEntry =
			{
				Fragments._BibliographicEntry__OclAny /* 0 */,
				Fragments._BibliographicEntry__OclElement /* 1 */,
				Fragments._BibliographicEntry__Item /* 2 */,
				Fragments._BibliographicEntry__BibliographicEntry /* 3 */
			};
		private static final int /*@NonNull*/ [] __BibliographicEntry = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CV =
			{
				Fragments._CV__OclAny /* 0 */,
				Fragments._CV__OclElement /* 1 */,
				Fragments._CV__CV /* 2 */
			};
		private static final int /*@NonNull*/ [] __CV = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Contacts =
			{
				Fragments._Contacts__OclAny /* 0 */,
				Fragments._Contacts__OclElement /* 1 */,
				Fragments._Contacts__Section /* 2 */,
				Fragments._Contacts__Contacts /* 3 */
			};
		private static final int /*@NonNull*/ [] __Contacts = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Date =
			{
				Fragments._Date__OclAny /* 0 */,
				Fragments._Date__OclElement /* 1 */,
				Fragments._Date__Item /* 2 */,
				Fragments._Date__Date /* 3 */
			};
		private static final int /*@NonNull*/ [] __Date = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Education =
			{
				Fragments._Education__OclAny /* 0 */,
				Fragments._Education__OclElement /* 1 */,
				Fragments._Education__Section /* 2 */,
				Fragments._Education__Education /* 3 */
			};
		private static final int /*@NonNull*/ [] __Education = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EducationEntry =
			{
				Fragments._EducationEntry__OclAny /* 0 */,
				Fragments._EducationEntry__OclElement /* 1 */,
				Fragments._EducationEntry__Item /* 2 */,
				Fragments._EducationEntry__EducationEntry /* 3 */
			};
		private static final int /*@NonNull*/ [] __EducationEntry = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Field =
			{
				Fragments._Field__OclAny /* 0 */,
				Fragments._Field__OclElement /* 1 */,
				Fragments._Field__Field /* 2 */
			};
		private static final int /*@NonNull*/ [] __Field = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Image =
			{
				Fragments._Image__OclAny /* 0 */,
				Fragments._Image__OclElement /* 1 */,
				Fragments._Image__Item /* 2 */,
				Fragments._Image__Image /* 3 */
			};
		private static final int /*@NonNull*/ [] __Image = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__Item /* 2 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _JobEntry =
			{
				Fragments._JobEntry__OclAny /* 0 */,
				Fragments._JobEntry__OclElement /* 1 */,
				Fragments._JobEntry__Item /* 2 */,
				Fragments._JobEntry__JobEntry /* 3 */
			};
		private static final int /*@NonNull*/ [] __JobEntry = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PersonalData =
			{
				Fragments._PersonalData__OclAny /* 0 */,
				Fragments._PersonalData__OclElement /* 1 */,
				Fragments._PersonalData__Section /* 2 */,
				Fragments._PersonalData__PersonalData /* 3 */
			};
		private static final int /*@NonNull*/ [] __PersonalData = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Section =
			{
				Fragments._Section__OclAny /* 0 */,
				Fragments._Section__OclElement /* 1 */,
				Fragments._Section__Section /* 2 */
			};
		private static final int /*@NonNull*/ [] __Section = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SkillEntry =
			{
				Fragments._SkillEntry__OclAny /* 0 */,
				Fragments._SkillEntry__OclElement /* 1 */,
				Fragments._SkillEntry__Item /* 2 */,
				Fragments._SkillEntry__SkillEntry /* 3 */
			};
		private static final int /*@NonNull*/ [] __SkillEntry = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Skills =
			{
				Fragments._Skills__OclAny /* 0 */,
				Fragments._Skills__OclElement /* 1 */,
				Fragments._Skills__Section /* 2 */,
				Fragments._Skills__Skills /* 3 */
			};
		private static final int /*@NonNull*/ [] __Skills = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__Table /* 2 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TableRow =
			{
				Fragments._TableRow__OclAny /* 0 */,
				Fragments._TableRow__OclElement /* 1 */,
				Fragments._TableRow__TableRow /* 2 */
			};
		private static final int /*@NonNull*/ [] __TableRow = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Text =
			{
				Fragments._Text__OclAny /* 0 */,
				Fragments._Text__OclElement /* 1 */,
				Fragments._Text__Item /* 2 */,
				Fragments._Text__Text /* 3 */
			};
		private static final int /*@NonNull*/ [] __Text = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _URL =
			{
				Fragments._URL__OclAny /* 0 */,
				Fragments._URL__OclElement /* 1 */,
				Fragments._URL__Item /* 2 */,
				Fragments._URL__URL /* 3 */
			};
		private static final int /*@NonNull*/ [] __URL = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkExperience =
			{
				Fragments._WorkExperience__OclAny /* 0 */,
				Fragments._WorkExperience__OclElement /* 1 */,
				Fragments._WorkExperience__Section /* 2 */,
				Fragments._WorkExperience__WorkExperience /* 3 */
			};
		private static final int /*@NonNull*/ [] __WorkExperience = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BibliographicEntry.initFragments(_BibliographicEntry, __BibliographicEntry);
			Types._CV.initFragments(_CV, __CV);
			Types._Contacts.initFragments(_Contacts, __Contacts);
			Types._Date.initFragments(_Date, __Date);
			Types._Education.initFragments(_Education, __Education);
			Types._EducationEntry.initFragments(_EducationEntry, __EducationEntry);
			Types._Field.initFragments(_Field, __Field);
			Types._Image.initFragments(_Image, __Image);
			Types._Item.initFragments(_Item, __Item);
			Types._JobEntry.initFragments(_JobEntry, __JobEntry);
			Types._PersonalData.initFragments(_PersonalData, __PersonalData);
			Types._Section.initFragments(_Section, __Section);
			Types._SkillEntry.initFragments(_SkillEntry, __SkillEntry);
			Types._Skills.initFragments(_Skills, __Skills);
			Types._Table.initFragments(_Table, __Table);
			Types._TableRow.initFragments(_TableRow, __TableRow);
			Types._Text.initFragments(_Text, __Text);
			Types._URL.initFragments(_URL, __URL);
			Types._WorkExperience.initFragments(_WorkExperience, __WorkExperience);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _BibliographicEntry__BibliographicEntry = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BibliographicEntry__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BibliographicEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BibliographicEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CV__CV = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CV__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CV__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Contacts__Contacts = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Contacts__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Contacts__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Contacts__Section = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Date__Date = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Date__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Date__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Date__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Education__Education = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Education__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Education__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Education__Section = {};

		private static final ExecutorOperation /*@NonNull*/ [] _EducationEntry__EducationEntry = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EducationEntry__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EducationEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EducationEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Field__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Image__Image = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Image__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Image__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Image__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _JobEntry__JobEntry = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JobEntry__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JobEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JobEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PersonalData__PersonalData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersonalData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersonalData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersonalData__Section = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Section__Section = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Section__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Section__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SkillEntry__SkillEntry = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SkillEntry__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SkillEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SkillEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Skills__Skills = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Skills__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Skills__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Skills__Section = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TableRow__TableRow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TableRow__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TableRow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Text__Text = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Text__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Text__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Text__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _URL__URL = {};
		private static final ExecutorOperation /*@NonNull*/ [] _URL__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _URL__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _URL__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkExperience__WorkExperience = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkExperience__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkExperience__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkExperience__Section = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BibliographicEntry__BibliographicEntry.initOperations(_BibliographicEntry__BibliographicEntry);
			Fragments._BibliographicEntry__Item.initOperations(_BibliographicEntry__Item);
			Fragments._BibliographicEntry__OclAny.initOperations(_BibliographicEntry__OclAny);
			Fragments._BibliographicEntry__OclElement.initOperations(_BibliographicEntry__OclElement);

			Fragments._CV__CV.initOperations(_CV__CV);
			Fragments._CV__OclAny.initOperations(_CV__OclAny);
			Fragments._CV__OclElement.initOperations(_CV__OclElement);

			Fragments._Contacts__Contacts.initOperations(_Contacts__Contacts);
			Fragments._Contacts__OclAny.initOperations(_Contacts__OclAny);
			Fragments._Contacts__OclElement.initOperations(_Contacts__OclElement);
			Fragments._Contacts__Section.initOperations(_Contacts__Section);

			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__Item.initOperations(_Date__Item);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);
			Fragments._Date__OclElement.initOperations(_Date__OclElement);

			Fragments._Education__Education.initOperations(_Education__Education);
			Fragments._Education__OclAny.initOperations(_Education__OclAny);
			Fragments._Education__OclElement.initOperations(_Education__OclElement);
			Fragments._Education__Section.initOperations(_Education__Section);

			Fragments._EducationEntry__EducationEntry.initOperations(_EducationEntry__EducationEntry);
			Fragments._EducationEntry__Item.initOperations(_EducationEntry__Item);
			Fragments._EducationEntry__OclAny.initOperations(_EducationEntry__OclAny);
			Fragments._EducationEntry__OclElement.initOperations(_EducationEntry__OclElement);

			Fragments._Field__Field.initOperations(_Field__Field);
			Fragments._Field__OclAny.initOperations(_Field__OclAny);
			Fragments._Field__OclElement.initOperations(_Field__OclElement);

			Fragments._Image__Image.initOperations(_Image__Image);
			Fragments._Image__Item.initOperations(_Image__Item);
			Fragments._Image__OclAny.initOperations(_Image__OclAny);
			Fragments._Image__OclElement.initOperations(_Image__OclElement);

			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._JobEntry__Item.initOperations(_JobEntry__Item);
			Fragments._JobEntry__JobEntry.initOperations(_JobEntry__JobEntry);
			Fragments._JobEntry__OclAny.initOperations(_JobEntry__OclAny);
			Fragments._JobEntry__OclElement.initOperations(_JobEntry__OclElement);

			Fragments._PersonalData__OclAny.initOperations(_PersonalData__OclAny);
			Fragments._PersonalData__OclElement.initOperations(_PersonalData__OclElement);
			Fragments._PersonalData__PersonalData.initOperations(_PersonalData__PersonalData);
			Fragments._PersonalData__Section.initOperations(_PersonalData__Section);

			Fragments._Section__OclAny.initOperations(_Section__OclAny);
			Fragments._Section__OclElement.initOperations(_Section__OclElement);
			Fragments._Section__Section.initOperations(_Section__Section);

			Fragments._SkillEntry__Item.initOperations(_SkillEntry__Item);
			Fragments._SkillEntry__OclAny.initOperations(_SkillEntry__OclAny);
			Fragments._SkillEntry__OclElement.initOperations(_SkillEntry__OclElement);
			Fragments._SkillEntry__SkillEntry.initOperations(_SkillEntry__SkillEntry);

			Fragments._Skills__OclAny.initOperations(_Skills__OclAny);
			Fragments._Skills__OclElement.initOperations(_Skills__OclElement);
			Fragments._Skills__Section.initOperations(_Skills__Section);
			Fragments._Skills__Skills.initOperations(_Skills__Skills);

			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Fragments._TableRow__OclAny.initOperations(_TableRow__OclAny);
			Fragments._TableRow__OclElement.initOperations(_TableRow__OclElement);
			Fragments._TableRow__TableRow.initOperations(_TableRow__TableRow);

			Fragments._Text__Item.initOperations(_Text__Item);
			Fragments._Text__OclAny.initOperations(_Text__OclAny);
			Fragments._Text__OclElement.initOperations(_Text__OclElement);
			Fragments._Text__Text.initOperations(_Text__Text);

			Fragments._URL__Item.initOperations(_URL__Item);
			Fragments._URL__OclAny.initOperations(_URL__OclAny);
			Fragments._URL__OclElement.initOperations(_URL__OclElement);
			Fragments._URL__URL.initOperations(_URL__URL);

			Fragments._WorkExperience__OclAny.initOperations(_WorkExperience__OclAny);
			Fragments._WorkExperience__OclElement.initOperations(_WorkExperience__OclElement);
			Fragments._WorkExperience__Section.initOperations(_WorkExperience__Section);
			Fragments._WorkExperience__WorkExperience.initOperations(_WorkExperience__WorkExperience);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _BibliographicEntry = {
			CVTables.Properties._BibliographicEntry__author,
			CVTables.Properties._BibliographicEntry__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._BibliographicEntry__title,
			CVTables.Properties._BibliographicEntry__url,
			CVTables.Properties._BibliographicEntry__year
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CV = {
			CVTables.Properties._CV__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._CV__sections
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Contacts = {
			CVTables.Properties._Contacts__email,
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			CVTables.Properties._Contacts__links,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Contacts__phone
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Date = {
			CVTables.Properties._Date__ending_date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Date__start_date
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Education = {
			CVTables.Properties._Education__educationEntries,
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EducationEntry = {
			CVTables.Properties._EducationEntry__date,
			CVTables.Properties._EducationEntry__level,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._EducationEntry__school,
			CVTables.Properties._EducationEntry__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Field = {
			CVTables.Properties._Field__items,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Field__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Image = {
			CVTables.Properties._Image__height,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Image__value,
			CVTables.Properties._Image__width
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JobEntry = {
			CVTables.Properties._JobEntry__date,
			CVTables.Properties._JobEntry__description,
			CVTables.Properties._JobEntry__employer,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._JobEntry__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PersonalData = {
			CVTables.Properties._PersonalData__about_me,
			CVTables.Properties._PersonalData__address,
			CVTables.Properties._PersonalData__birthdate,
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			CVTables.Properties._PersonalData__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._PersonalData__photo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Section = {
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SkillEntry = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._SkillEntry__skillValue,
			CVTables.Properties._SkillEntry__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Skills = {
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Skills__skills,
			CVTables.Properties._Skills__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			CVTables.Properties._Table__field,
			CVTables.Properties._Table__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Table__rows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TableRow = {
			CVTables.Properties._TableRow__items,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Text = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._Text__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _URL = {
			CVTables.Properties._URL__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CVTables.Properties._URL__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkExperience = {
			CVTables.Properties._Section__fields,
			CVTables.Properties._Section__header,
			CVTables.Properties._WorkExperience__jobEntries,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BibliographicEntry__BibliographicEntry.initProperties(_BibliographicEntry);
			Fragments._CV__CV.initProperties(_CV);
			Fragments._Contacts__Contacts.initProperties(_Contacts);
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Education__Education.initProperties(_Education);
			Fragments._EducationEntry__EducationEntry.initProperties(_EducationEntry);
			Fragments._Field__Field.initProperties(_Field);
			Fragments._Image__Image.initProperties(_Image);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._JobEntry__JobEntry.initProperties(_JobEntry);
			Fragments._PersonalData__PersonalData.initProperties(_PersonalData);
			Fragments._Section__Section.initProperties(_Section);
			Fragments._SkillEntry__SkillEntry.initProperties(_SkillEntry);
			Fragments._Skills__Skills.initProperties(_Skills);
			Fragments._Table__Table.initProperties(_Table);
			Fragments._TableRow__TableRow.initProperties(_TableRow);
			Fragments._Text__Text.initProperties(_Text);
			Fragments._URL__URL.initProperties(_URL);
			Fragments._WorkExperience__WorkExperience.initProperties(_WorkExperience);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CVTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CVTables();
	}

	private CVTables() {
		super(CVPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		CVPackage.Literals.CONTACTS,
		CVPackage.Literals.EDUCATION,
		CVPackage.Literals.PERSONAL_DATA,
		CVPackage.Literals.WORK_EXPERIENCE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
