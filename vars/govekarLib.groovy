def call(body) {
  
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  
  println "This is from GOVEKAR LIBRARY"
 
  
}
