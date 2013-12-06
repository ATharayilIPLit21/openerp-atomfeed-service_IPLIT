package org.bahmni.feed.openerp.testhelper;

import java.io.InputStream;
import java.util.Scanner;

public class SampleEncounter {

    public static String json(String jsonFileName) {
        InputStream resourceAsStream = SampleEncounter.class.getClassLoader().getResourceAsStream(jsonFileName);
        return new Scanner(resourceAsStream).useDelimiter("\\Z").next();
    }

//    public static OpenMRSEncounter encounter() throws IOException {
//        return new OpenMRSEncounterParser(ObjectMapperRepository.objectMapper).parse(encounterEventContent, productService, event.getId(), event.getFeedUri(), SampleEncounter.json());
//    }
//
//    public static String requestParams(){
//    return    "{\"id\":\"f18b7270-0085-4196-a6e9-367ebcbfc890F\",\"openERPOrders\":[{\"id\":\"26141644-468c-4e71-8d1c-8c17fd3b6df0A\",\"productIds\":[\"d5aa4078-ce50-46f5-a233-fd195ce28665\"],\"visitId\":\"294f02b4-78d4-4b3a-831b-40b667efe3b8A\",\"type\":\"REG\",\"startDate\":null,\"description\":\"REG 29/05/2013 05:59:23\"},{\"id\":\"3f9960ef-f141-4131-a4b5-23835d69671dA\",\"productIds\":[\"8fabd64a-ff9e-4fd6-8392-678a17779ffd\"],\"visitId\":\"294f02b4-78d4-4b3a-831b-40b667efe3b8A\",\"type\":\"REG\",\"startDate\":null,\"description\":\"REG 29/05/2013 05:59:23\"},{\"id\":\"f81749c4-4827-4374-be64-28e5f52513f5A\",\"productIds\":[\"2461e8c0-ef23-475f-934d-b8d8366d5e90\"],\"visitId\":\"294f02b4-78d4-4b3a-831b-40b667efe3b8A\",\"type\":\"REG\",\"startDate\":null,\"description\":\"REG 29/05/2013 05:59:23\"}]}";
//    }

}
