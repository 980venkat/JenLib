def call(body) {
  
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  
  def maild = config.emailid;
  println "This is from GOVEKAR LIBRARY  >>"+maild

}
