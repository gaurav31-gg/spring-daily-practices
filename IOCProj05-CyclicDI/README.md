# Spring Cyclic Dependecy problem - Day 5

Cyclic Dependency is not possible through the constructor injection due to the unresolve circular reference
because target class and dependent class depends on each other...

Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'b1' defined in file :: ->  Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'a1': Requested bean is currently in creation: Is there an unresolvable circular reference or an asynchronous initialization dependency?

but cyclic dependecncy issue can solve by field injection, method injection and arbitary method injection