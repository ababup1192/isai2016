# Modeling Tools with Hybrid Editors

The proposed modeling tools are designed as a graphical user interface (GUI)
application. Fig. \ref{fig:architecture_tools} shows the system architecture and the interfaces of the tools, as well as the relations between the tools and products. The tools support text editors and UML editors (viewers) for manipulating codes/models in the inner representation and the corresponding UML diagram, respectively. The text
editor is also used to edit product template codes in some programming languages, which are the final products.

\mfigure{120}{85}{src/img/architecture-vmpt.eps}{Architecture of the proposed tools}{architecture_tools}

The tools are supported by YAML for representing the corresponding UML diagrams. YAML is a human-friendly data serialization standard for all programming languages, such as XML and JSON. YAML has a hierarchical structure which is represented by indents, and so is suitable for representing both class and package diagrams, which consist of
hierarchical structures. The codes in YAML and UML diagrams are synchronized by intermediate data. The role of the intermediate data is to generate the product template codes and packages of the products in some programming languages. This mechanism has three advantages. First, it is possible to generate a UML diagram by a specification in YAML. Second, users can intuitively manipulate a visual construct in
UML. Third, users can generate product template codes and packages at the same time in the process of generating the UML diagram. The hybrid mechanism of each language makes up for the disadvantages of the other while maintaining their advantages. The advantages of editing in YAML for generating UML diagrams are as follows:

  - The learning cost is low because YAML is a lightweight markup language.
  - The users can use any text editor and benefit from library functions related to replacement, regular expression, and other language support tools, as well as from key binding.
  - Using a version control system to manage the differences between different versions of products is easy.

The advantages of the UML representation are as follows:

  - It is easy to understand the hierarchical structures and the relationship between components because of visual notations and constructs.
  - It is easy even for non-programmers to directly manipulate components through mouse operations.
  - A UML representation is easy to extend because it is a subset of UML.

One of advantages of the tools is that users from a team who have different roles, experiences, knowledge/skills as well as preferences can understand and manipulate component features in appropriate ways. In addition, the tools provide a user with interfaces where he/she can switch between the text and diagram editor depending on the situation.
