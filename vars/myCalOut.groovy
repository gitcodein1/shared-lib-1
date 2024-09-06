import com.cal.*;
def addfunc (a,b) {
  def calculator = new mycal()
  def result = calculator.add(a,b)
  echo "${a} + ${b} = ${result}"
}
def mulfunc (a,b) {
  def calculator = new mycal()
  def result = calculator.mul(a,b)
  echo "${a} X ${b} = ${result}"
}
