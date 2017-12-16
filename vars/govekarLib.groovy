def call(body) {
  
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  
  def maild = config.emailid;
  venkatLib(config);
  mail  body: 'Building URL ${env.BUILD_URL}',  to: maild , subject: 'JOB ${env.JOB_NAME}'

}
