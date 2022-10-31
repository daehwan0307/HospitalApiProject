package com.springboot.hello.parser;

import com.springboot.hello.domain.Hospital;
import io.swagger.models.auth.In;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {


        String[] row = str.split("\",\"");
        System.out.println(Arrays.toString(row));

        Hospital hospital = new Hospital();
        hospital.setId(Integer.parseInt(row[0].replace("\n","")));


        hospital.setId(Integer.parseInt(row[0]));
        hospital.setOpenServiceName(row[1]);
        hospital.setOpenLocalGovernmentCode(Integer.parseInt(row[3]));
        hospital.setManagementNumber(row[4]);

        hospital.setLicenseDate(LocalTime.parse(row[5]));
        hospital.setBusinessStatus(Integer.parseInt(row[7]));
        hospital.setBusinessStatusCode(Integer.parseInt(row[9]));
        hospital.setPhone(row[15]);
        hospital.setFullAddress(row[18]);
        hospital.setRoadNameAddress(row[19]);
        hospital.setHospitalName(row[21]);
        hospital.setBusinessTypeName(row[25]);
        hospital.setHealthcareProviderCount(Integer.parseInt(row[29]));
        hospital.setPatientRoomCount(Integer.parseInt(row[30]));
        hospital.setTotalNumberOfBeds(Integer.parseInt(row[31]));
        hospital.setTotalAreaSize(Integer.parseInt(row[32]));

        return new Hospital();
    }
}
