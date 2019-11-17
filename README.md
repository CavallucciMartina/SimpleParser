# SimpleParser - TopDown 
Simple parser that generates AST.

An abstract syntax tree (AST), or just syntax tree, is a tree representation of the abstract syntactic structure of source code written in a programming language. Each node of the tree denotes a construct occurring in the source code. 


### Phases
The project evolves in phases, in particular:
1 - Creation of nodes by sum of integers, printing of them.
2 - Extension with nodes of the "if then else" construct
In these two phases, as output, the AST tree was generated which, through a top-down parsing, translated the tokens.
3 - Management of the symbol table for the search of the variable declaration, performed during the parsing phase to optimize.
4 - Realization with list Hashmaps, in the front there are the variables declared in the local scope, up to level zero where there are the declarations of the global variables




### Todos

 -Parameter declaration management within a function
