package org.demo;
class testClass {
        def script
        testClass(script) {
            this.script = script
        }
    
        void printClass() {
        script.echo "using Groups shared library from TEST"
        }  
}
