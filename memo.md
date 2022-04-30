#4 
use recursion instead of loops
#6
use @tailrec with TAIL RECURSION approach for recursive functions, without storing intermediate information. see example

#7
use def calledByName(x: => Long): Unit = { to lazy call passed function, see example 

#9
S-interpolator - default s"$name some text ${1+2}"
F- to apply some formatting - f"$name $speed%2.2f" - see example
F- also works as a format validator at compile time
RAW - ignores literals and prints it as is

#12
infix notation (ex. val1 method "string"), only allowed if method has only one parameter

#18
* to support covariance of generics use [+A], otherwise just [A], means support more Generic type for +A, A is strict
* to implement generic **producer (extends)** use type [A <: SomeGeneralClass]
* to implement generic **consumer (super)** use type [A >: SomeGeneralClass]

#21
* case class - with FP, classes are stateless, 
* mark class as case class to use in pattern matching

#26
when you need FP approach use Lambda...see example

#27 & #28 SKIPPED 

#29
* if you need to concat string and number use map("" + number + string)
* use for{}yield instead on inliners flatmap.map and etc.. see example


#33
watch it - very nice social network expl

#34
Null or Not null values // Option[...]
when design API or work with API, use Option() with handlers like  orElse
to process results of options use map, flatMap... see example

#35
Exception or not Exception// Try[...]
when design API or work with API, use Try() with handlers like  orElse instead of try{}catch(){}





