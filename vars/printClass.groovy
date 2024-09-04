/*import org.demo.testClass
def call() { 
 t = new testClass()
 t.hello()
}*/

def call(){
 import static org.demo.testClass.hello as hi
 hi()
}
