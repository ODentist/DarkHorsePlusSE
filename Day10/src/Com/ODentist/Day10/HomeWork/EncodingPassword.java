package Com.ODentist.Day10.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncodingPassword {
    public static void main(String[] args) throws IOException {
        String Encode="D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\Encode.txt";
        String Origin="D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\Origin.txt";
        String Decode="D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\Decode.txt";
        Encrypt(Origin,Encode);
        deEncrypt(Encode,Decode);

    }
    public static void Encrypt(String inName,String outName) throws IOException {

        FileInputStream input = new FileInputStream(inName);
        FileOutputStream output = new FileOutputStream(outName);
        int content = 0 ;
        while((content=input.read())!=-1){
            output.write(content^2);
        }
        input.close();
        output.close();
    }
    public static void deEncrypt(String inName,String outName) throws IOException {

        FileInputStream input = new FileInputStream(inName);
        FileOutputStream output = new FileOutputStream(outName);
        int content = 0 ;
        while((content=input.read())!=-1){
            output.write(content^2);
        }
        input.close();
        output.close();
    }

}
