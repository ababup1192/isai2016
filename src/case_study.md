# Case Study and Evaluation
In this section, we present a case study and its evaluation. The purpose of the case study is to develop a package related to fundamental data structures which consist of several types and their relations. We evaluate the usability of the modeling tools to create a package based on a certain scenario.

For evaluation and case study we  selected a class diagram that can be considered as a medium level complexity. As shown in Fig. \ref{fig:case-stack-queue}, the package includes the fundamental constructions  of stack and queue (Fig. \ref{fig:stack-queue}) as well as their generalization, realization, and related objects. In order to evaluate the proposed approach, we count the number of operations needed to create the diagram based on a certain scenario. We define an operation in an YAML text as any of the following:

\mfigure{120}{90}{src/img/case-StackQueue}{Class diagram for stack and queue and related objects}{case-stack-queue}

\mfigure{80}{60}{src/img/StackQueueJava}{Parts of the template code of the stack and queue program}{stack-queue}

- Add, change or delete a word.
- Replace words.
- Replace words based on a regular expression.
- Reset the state of document based on a version control system.

On the other hand, we also define an operation in a UML diagram as any of the following:

- Add or delete a construct.
- Add, change, or delete a parameter.
- Add or delete a relation of constructs.
- Switch the input device from keyboard to mouse within the UML diagram, or vice versa.

Table 1 shows the scenario and costs (accumulated amount of the
operations) of each step in the scenario in terms of YAML, UML diagrams,
and hybrid editors.

Table: Scenario and the number of operations.

|No.| Steps in the scenario | YAML | UML | Hybrid |
|-|--------|:---:|:---:|:---:|
|1|Create classes *DataStructure*, *Data*, *Stack*, *Queue* | 69 | 28 | 28 |
|2|Create an abstract class *Container*| 10 | 5 | 5 |
|3|Create an interface *List*| 27 | 8 | 8 |
|4|Define aggregations in all classes| 8 | 3 | 3 |
|5|Define relalizations and generalizations in all classes| 10 | 5 | 5 |
|6|Change all types *int* to *double*| 1 | 14 | 1 |
|7|Replace *public* with *private*| 2 | 22 | 2 |
|8|Go back to Scenario 5| 1 | 36 | 1 |
||Total| 128 | 121 | 53 |

<!--
 SMK(マウス・キーボード入れ替え)
 内訳
 1. wc class_create.yml, 4*1(クラスBox)+2*12(パラメタ数+SMK)=28
 2. wc abstract_create.yml,1(クラスBox)+2*2(パラメタ数+SMK)+1(ステレオタイプ)=5
 3. wc interface_create.yml, 1(クラスBox)+3*2(パラメタ数+SMK)+1(ステレオタイプ)=8
 4. wc class_aggre.yml, 1(線引き)+2*1(多重度+SMK)=3
 5. wc class_relation.yml + abstract_relation, 1*5(線引き)=5
-->

The results reveal that it takes 128 and 121 operations to create the diagram through the scenario using YAML and UML, respectively. Although, the costs are almost the same, the two conventional methods have advantages and disadvantages. In the editor for YAML, users can use functionality related to version control systems, including primitive operations such as undo and redo, as well as tracers. The utilities of
conventional text editors, which facilitate searching, replacing, and copying based on regular expressions as well as cursor movement, are also available. The important thing is that all such operations can be performed by only a keyboard with the key binding setting. On the other hand, in the editor for diagrams, users can manipulate the codes much more intuitively through visual objects, based on visual editors, where drag and drop operations and other functions which are available in conventional drawing tools can be used.

In contrast, 53 operations are required in order to create the same diagram and
the scenario using hybrid editors. The important thing is that the users can switch editors according to their preference and to roles in the team. Thus, the operation cost can be decreased further based on optimum usage. The proposed modeling tools are aimed at  supporting documentation in the short term development based on agile methods. Since the modeling tools generate both the documents and the corresponding product template codes, the project team can decrease the cost for documentation. Besides, the approach facilitates communication within the agile team because both programmers and non-programmers can involve in documentation through the manipulation in both texts and diagrams. The proposed modeling tools can support social coding combining advantages of the MDA approaches and the agile software development.

\clearpage
