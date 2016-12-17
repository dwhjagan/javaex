// find . -name \*.class -type f -delete  ( Note: Delete all files in the .swp extention)
//find . -name \*.class ( Note: Find any perticular file in all subdirectory)
//rm to remove files.
//chmod 777 - 4, 2, 1 read, write, execute
//sys.exit ( scala System exit)
//sh-4.3$ cp -R  /home/cg/* /home/cg/root/Archive   ( Note : Copy files and folder to another folder)
// find . -mindepth 2 -type f -print -exec mv {} . \; // Move all subfolder and files to a parent folder
// mv /home/cg/root/Archive/Help.scala  /home/cg/root  

/*  http://www.tutorialspoint.com/scala/scala_classes_objects.htm

Object − Objects have states and behaviors. An object is an instance of a class. Example − A dog has states - color, name, breed as well as behaviors - wagging, barking, and eating.

Class − A class can be defined as a template/blueprint that describes the behaviors/states that are related to the class.

Methods − A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.

Fields − Each object has its unique set of instant variables, which are called fields. An object's state is created by the values assigned to these fields.

Closure − A closure is a function, whose return value depends on the value of one or more variables declared outside this function.

Traits − A trait encapsulates method and field definitions, which can then be reused by mixing them into classes. Traits are used to define object types by specifying the signature of the supported methods.

// Hints

*******************ARRAY****************
Scala provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. 
An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

1.Variables
2.Print Range of values 
3.Print concatenate the values
4.Print Matrix of range of values
5.Print range, total, Max values in the range..
*******************COLLECTION****************
Scala has a rich set of collection library. Collections are containers of things. 
Those containers can be sequenced, linear sets of items like List, Tuple, Option, Map, etc. 
The collections may have an arbitrary number of elements or be bounded to zero or one element (e.g., Option).

1. Print Head and Tail , num is null
2, concatenating the list
3. forward, reverse, printing of the list.
4. Repeact the Print values , square, tablulate.

*******************Error Handling****************
try{...}catch{...} 
Missing file exception

injection / extraction -- Email..

*******************Regular Expression / Pattern Matching ****************
experssion are used to replace matching string in the output..( use pipe line, comma operator for delimitor)


*/
