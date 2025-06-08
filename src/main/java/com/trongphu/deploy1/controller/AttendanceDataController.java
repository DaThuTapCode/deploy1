package com.trongphu.deploy1.controller;

import com.trongphu.deploy1.Entity.AttendanceData;
import com.trongphu.deploy1.Entity.Parent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AttendanceDataController {

    @PostMapping("/fake-attendance-data")
    public ResponseEntity<?> fakeAttendanceData() {
        List<AttendanceData> fakeList = new ArrayList<>();
        String fixedDate = "2025-06-09";
        int totalStaff = 8000;

        for (int i = 1; i <= totalStaff; i++) {
            String name = "NV" + String.format("%04d", i);
            String serial = "SN-" + (100000 + i);
            int enrollid = i;
            int mode = 1;   // ví dụ: FaceID
            int event = 1;  // ví dụ: CheckIn/Out

            // Lượt vào buổi sáng
            String timeIn = fixedDate + " 08:" + String.format("%02d", (int)(Math.random() * 30)) + ":00";
            fakeList.add(new AttendanceData(name, serial, enrollid, 0, mode, event, timeIn));

            // Lượt ra buổi chiều
            String timeOut = fixedDate + " 17:" + String.format("%02d", (int)(Math.random() * 30)) + ":00";
            fakeList.add(new AttendanceData(name, serial, enrollid, 1, mode, event, timeOut));
        }

        return ResponseEntity.ok(new Parent("SN01283714", fakeList));
    }


}
