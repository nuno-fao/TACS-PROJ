# TACS-PROJ

GitHub repository for TACS' (22/23) project

|Name|Uni ID|
|----|------|
|Nuno Oliveira|up201806525|
|Daniel Garcia Silva|up201806524|
|Luís Miguel Pinto|up201806206|

#Assignment 1

## Metamodel for CVs

Concepts|Intrisic Properties|Extrinsic Properties
-|-|-
CV | name: String | An arbirtray number of *Sections*  
Section | header: String | An arbitrary number of *Fields*
Field | title: String | An arbitrary number of *Items*
PersonalData | | A **name** and an **about me**, two *Texts* <br> A **photo**, one *Image* <br> A **birthdate**, one *Date*, an **address**
Contacts | | a **phone** number and an **email**, three *Texts* <br> An arbitrary number of *URLs*
Education | | An arbitrary number of *EducationEntries*
WorkExperience | | An arbitrary number of *JobEntries*
Skills | title: String | An arbitrary number of *SkillEntries*
Table | header: list of Strings | One *Field* <br> An arbitrary number of *TableRows*
TableRow | | An arbitrary number of *Items*
Text | value: String |
Date | start_date: String <br> ending_date: String |
URL | value: String, name: String|
Image | value: String <br> width: Integer <br> height: Integer |
BibliographicEntry | author: String <br> year: Integer <br> title: String <br> description: String | An **url**|
JobEntry | title: String <br> employer: String <br> description: String | One *Date*
EducationEntry | level: String <br> school: String <br> title: String | One *Date*
SkillEntry | title: String <br> skillValue: Integer |

## OCL Restrictions

### CV

- **obligatory_personal_data_section** - every ``CV`` must have one ``PersonalData``
- **obligatory_contacts_section** - every ``CV`` must have one ``Contacts``
- **at_most_one_education_section** - every ``CV`` can have at most one ``Education``
- **at_most_one_work_experience_section** - every ``CV`` can have at most one ``WorkExperience``

### BibliographicEntry

- **check_year** - each ``year`` should be a positive Integer

### Table

- **rows_same_length_as_header** - each ``TableRow`` should have the same amount of columns as there are in ``header``, if defined

### SkillEntry

- **limit_value** - ``value`` is an Integer between 1 and 5

## Metamodel UML
![metamodel](img/metamodel_a1.jpg)

## Notes on the first assignment

To develop our metamodel we took a sort of reverse engineering aproach. 

After gathering CV's from multiple sources and from people in different working areas we viewed CV's as a bunch of sections. Some of these sections have a somewhat regular structure while others not so much. Despite that, all sections are composed by some basic structured text elements and we started to plan our model from that. The basic structured elements we identified are subclasses of ``Item``.

A ``Field`` should be thought of as a subsection. It can have a title and have multiple ``Item`` or have a ``Table``. A ``Table`` has a list of strings that represents the headers and a bunch of ``TableRow``, where each has ``Items`` for each column.

Furthermore, a ``Section`` is self-explanatory and is composed by ``Field`` while ``CV`` is composed by ``Section``. 

With this, a user has all the tools to make almost anything. Regardless, there is too much freedom and very little structure and thats why we introduced to the metamodel subclasses of ``Section`` (PersonalData,Contacts,Education,WorkExperience,Skills). Each subclass represents a section that is present in almost every CV in a very similar structure across all of them. Each subclass has a defined set of attributes to use.

## Notes on the seconde assignment

### Acceleo
The CV.acceleo module contains the Acceleo project. To run, you need to configure as a java application like in the ![tutorial](https://wiki.eclipse.org/Acceleo/Getting_Started), choose the instance of the **Model** you want to run for and choose the LatexModel folder (inside CV.acceleo module) as the **Target**.

> ![image](https://user-images.githubusercontent.com/50016564/210088399-7008f634-bb1f-4afe-acf7-e4f4d4929f68.png)

After running, the LatexModel directory should look like this:

> ![image](https://user-images.githubusercontent.com/50016564/210090383-1e9f52c8-0015-4d08-bfd0-386c3fa6203c.png)

**Note that** any images used, must be inside this folder.

After that, you just need to use you preferred LaTeX editing/publishing tool (we used Overleaf), upload this folder as a project and compile to generate a pdf file.

We chose to output our instance into LaTeX because, using a premade model we can get a lot of structure and a clean output without much hassle. We decided to use ![this](https://www.overleaf.com/latex/templates/lean-latex-resume/sjbtgfrzjkdw) template as a starting point because it provides the simple generic structures that we had envisioned for our model.
Of course, we needed to make a few changes to the LaTeX model because of the abstraction level in our model. This proved rather complicated due to little understanding we have of the software.

The whole model could be translated to LaTeX with a few exceptions:
- Tables were not translated. The model did not contain any template for tables and although we could introduce it ourselves, it would completely break the structure of the document. Nevertheless, tables were present in our model as tool to have structure in the CV, and since LaTeX itself provides plenty of structure (especially with the template chosen) there was no real need to introduce this tool.
- Generic sections and fields both must have titles
- Generic fields can only have a maximum of 4 items. The generic field function in the LaTeX template can only accept 4 optional elements (besides the title which is mandatory), and we could not change it. Either way, for must use cases, 4 items of any type should be enough to represent any kind of information on a single field.

![image](https://user-images.githubusercontent.com/50016564/210089436-a1ddf3f2-2add-454a-9f80-0f030023290d.png)

In order to be able to use the File generated by Sirius, there is the need to append ```xsi:schemaLocation="http://www.example.org/cV cV.ecore"``` in the generated file. 
![imagem](https://user-images.githubusercontent.com/28635230/210102517-285b7fb9-8d56-4bb8-967a-d41bad2732f2.png)

