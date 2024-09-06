import com.cal.*;
def call () {
  def calculator = new mycal()
  def result = calculator.add(10, 1)
  echo "Sum: ${result}"
}
