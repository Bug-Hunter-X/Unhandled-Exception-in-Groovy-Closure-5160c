```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught in the method: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong")
}
println "This line will be reached now" 
```