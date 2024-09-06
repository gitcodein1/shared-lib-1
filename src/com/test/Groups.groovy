package com.test;

class Groups {
  int numberOfGroups
  def sre = []
  def devOps = []
  def script
  
  Groups(script) {
    this.script = script
  }
  
    void printTeams() {
    script.echo "using Groups shared library from TEST"
    script.echo "numberOfGroups: ${numberOfGroups}"      
    script.echo "SRE team members are: ${sre}"      
    script.echo "DevOps team members are:${devOps}"
    }  
  
}
