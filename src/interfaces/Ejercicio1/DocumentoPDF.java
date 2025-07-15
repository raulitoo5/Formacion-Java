package interfaces.Ejercicio1;

public class DocumentoPDF extends Documento{

    public DocumentoPDF(int size){
        super(size);
    }

    @Override
    public boolean isValid() {
        // 1024 = 2^10. 1 MegaByte = 2^10 bytes
        return tamBytes > 0 && tamBytes < 1024*1024;
    }
}
