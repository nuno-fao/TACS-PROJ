# TACS-PROJ

GitHub repository for TACS' (22/23) project

|Name|Uni ID|
|----|------|
|Nuno Oliveira|up201806525|
|Daniel Garcia Silva|up201806524|
|Luís Miguel Pinto|up201806206|

# Metamodel for CVs

Concepts|Intrisic Properties|Extrinsic Properties
-|-|-
CV | | An arbirtray number of *Sections* <br> One *PersonalData* <br> One *Contacts* <br> At most one *Education* <br> At most one *WorkExperience* 
Section | header: String | An arbitrary number of *Fields*
Field | title: String | An arbitrary number of *Items*
PersonalData | | A **name** and an **about me**, two *Texts* <br> A **photo**, one *Image* <br> A **birthdate**, one *Date*
Contacts | | An **address**, a **phone** number and an **email**, three *Texts* <br> An arbitrary number of *URLs*
Education | | An arbitrary number of *EducationEntries*
WorkExperience | | An arbitrary number of *JobEntries*
Skills | title: String | An arbitrary number of *SkillEntries*
Table | header: list of Strings | One *Field* <br> An arbitrary number of *TableRows*
TableRow | | An arbitrary number of *Items*
Text | value: String |
Date | start_date: Date <br> ending_date: Date |
URL | value: String
Image | value: String <br> width: Integer <br> height: Integer |
BibliographicEntry | author: String <br> year: Integer <br> title: String |
JobEntry | title: String <br> employer: String <br> description: String | One *Date*
EducationEntry | level: String <br> school: String | One *Date*
SkillEntry | title: String <br> skillValue: Integer |