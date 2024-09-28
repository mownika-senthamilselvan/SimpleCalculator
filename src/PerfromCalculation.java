public class PerfromCalculation implements Caculator{
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) throws ArithmeticException {
       if(b==0){
           throw new ArithmeticException("Division By zero is not allowed");
       }

       return a/b;
    }
}
