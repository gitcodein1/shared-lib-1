import com.cal.*;
def call (a,b) {
  def calculator = new mycal()
  def result = calculator.add(a, b)
  echo "${a} + ${b} = ${result}"
}
