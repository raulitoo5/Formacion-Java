package interfaces;

public class ConsoleLoggerInverse extends ConsoleLogger {

    @Override
    public void logArray(String[] array) {
        for(int i = array.length-1; i>=0; i--){
            this.log(array[i]);
        }
    }
}
