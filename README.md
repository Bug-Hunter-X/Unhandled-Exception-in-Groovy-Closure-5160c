# Unhandled Exception in Groovy Closure

This example demonstrates a common issue when working with closures in Groovy: unhandled exceptions.  The `methodWithClosure` function executes a provided closure. If the closure throws an exception, the exception isn't caught by the surrounding method, and the code execution stops abruptly. 

The `bug.groovy` file shows this problem. The `bugSolution.groovy` file provides a solution by adding a `try-catch` block.