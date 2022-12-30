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

### Changes to the MetaModel
The existing Metamodel is similar to the previous one. The only diference is on the connections between items and the fields. Instead of being simple references, now they are aggregates of 1..1. This was made in order to improve the usability of the Sirius creation tools.

### Sirius

We used Sirius in order to create a tool to read and create our CV models. This sections details how each part of our models is graphically displayed and how they can be created.

#### Generic Sections

Generic Sections and Fields can be created in our model, and there can be any number and type of items in them. Here, the Generic Sections are represented by a rounded corner rectangular container with a background gradient from white to light gray. Their headers are displayed at the top center of it. Fields are in the same style, except their background gradient is green to light green.

> ![CustomSections](https://user-images.githubusercontent.com/32908423/210108216-e5cccb15-cee5-4d49-bf0f-95b9f0be34ac.png)

#### Items

Each type of Item has a distinct graphical representation:
 - Text: light gray rectangle, with the label being its value
 - Date: light orange rectangle, with the label displaying both the start and end dates
 - URL: light blue rectangle, with the label displaying both the name and the link
 - Image: light chocolate square, with the label displaying its size (width, height) and the link to the image
 - SkillEntry: light purple rectangle, with the label displaying both the title and the value (from 1 to 5)
 - BibliographicEntry: light red rounded corner rectangle, with the label displaying its title, author, year and description, and containing its URL
 - JobEntry: light yellow rounded corner rectangle, with the label displaying its title, employer and description, and containing its Date
 - EducationEntry: white rounded corner rectangle, with the label displaying its title, level and school, and containing its Date
 
> ![AllItems](https://user-images.githubusercontent.com/32908423/210109844-13787f21-c8d9-4a29-a26d-14fb26b60f40.png)

#### Personal Data

PersonalData Sections are represented by a rounded corner rectangular container with a background colour of blue. They have their obligatory Text Items in Name, Address and About Me, each with their labels slightly altered to specify which is which. The obligatory Image Item of Photo is also there, as well as the obligatory Birthdate Date Item, which will only display its Start Date.

> ![PersonalData](https://user-images.githubusercontent.com/32908423/210109991-93be7e3c-9d4c-43f5-bf35-d24ab883036a.png)

#### Contacts

Contacts Sections are represented by a rounded corner rectangular container with a background colour of orange. They have their obligatory Text Items in Phone and Email, each with their labels slightly altered to specify which is which. The obligatory URL Items of Links are also displayed.

> ![Contacts](https://user-images.githubusercontent.com/32908423/210110151-8579e5a6-79ae-4ab6-87d7-aa17ed06e6b8.png)

#### Education

Education Sections are represented by a rounded corner rectangular container with a background colour of red. They have their obligatory EducationEntry Items.

> ![Education](https://user-images.githubusercontent.com/32908423/210110212-6a65aece-9c32-4352-aa27-5f261d494ac0.png)

#### Work Experience

WorkExperience Sections are represented by a rounded corner rectangular container with a background colour of yellow. They have their obligatory JobEntry Items.

> ![WorkExperience](https://user-images.githubusercontent.com/32908423/210110298-e4d0b9e8-d632-4717-a88e-c989e42913bc.png)

#### Skills

Skills Sections are represented by a rounded corner rectangular container with a background colour of purple. They have their obligatory SkillEntry Items.

> ![Skills](https://user-images.githubusercontent.com/32908423/210110373-a345e21f-c27a-49e8-b74f-9c75f4931ada.png)

#### Creation Tools

In order to create these model elements, there are several groups of tools on the Palette Menu, each one corresponding to a Section above. All the user has to do is click the desired element on the Palette (they can navigate the groups by clicking the arrows in front of the elements shown) and click on the diagram inside the desired parent element. Any Section can contain any number of Fields. The user will not be able to add elements to containers that they don't belong to.

> ![CreationTools](https://user-images.githubusercontent.com/32908423/210110648-27361f18-4ca9-458a-b00f-18f8d219a44a.png)


### Acceleo
The CV.acceleo module contains the Acceleo project. To run, you need to configure as a java application like in the [tutorial](https://wiki.eclipse.org/Acceleo/Getting_Started), choose the instance of the **Model** you want to run for and choose the LatexModel folder (inside CV.acceleo module) as the **Target**.

> ![image](https://user-images.githubusercontent.com/50016564/210088399-7008f634-bb1f-4afe-acf7-e4f4d4929f68.png)

After running, the LatexModel directory should look like this:

> ![image](https://user-images.githubusercontent.com/50016564/210090383-1e9f52c8-0015-4d08-bfd0-386c3fa6203c.png)

**Note that** any images used, must be inside this folder.

After that, you just need to use you preferred LaTeX editing/publishing tool (we used Overleaf), upload this folder as a project and compile to generate a pdf file.

We chose to output our instance into LaTeX because, using a premade model we can get a lot of structure and a clean output without much hassle. We decided to use [this](https://www.overleaf.com/latex/templates/lean-latex-resume/sjbtgfrzjkdw) template as a starting point because it provides the simple generic structures that we had envisioned for our model.
Of course, we needed to make a few changes to the LaTeX model because of the abstraction level in our model. This proved rather complicated due to little understanding we have of the software.

The whole model could be translated to LaTeX with a few exceptions:
- Tables were not translated. The model did not contain any template for tables and although we could introduce it ourselves, it would completely break the structure of the document. Nevertheless, tables were present in our model as tool to have structure in the CV, and since LaTeX itself provides plenty of structure (especially with the template chosen) there was no real need to introduce this tool.
- Generic sections and fields both must have titles
- Generic fields can only have a maximum of 4 items. The generic field function in the LaTeX template can only accept 4 optional elements (besides the title which is mandatory), and we could not change it. Either way, for must use cases, 4 items of any type should be enough to represent any kind of information on a single field.

![image](https://user-images.githubusercontent.com/50016564/210089436-a1ddf3f2-2add-454a-9f80-0f030023290d.png)

In order to be able to use the File generated by Sirius, there is the need to append ```xsi:schemaLocation="http://www.example.org/cV cV.ecore"``` in the generated file. This file should be under the directory ``CV/model/``
![imagem](https://user-images.githubusercontent.com/28635230/210102517-285b7fb9-8d56-4bb8-967a-d41bad2732f2.png)

