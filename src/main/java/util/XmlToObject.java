package util;

import model.InputData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToObject {

    public InputData inputData () {
        try {
            File file = new File("src/test/resources/inputData.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(InputData.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (InputData) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
