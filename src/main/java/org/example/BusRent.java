package org.example;

import java.util.Collections;
import java.util.List;

public class BusRent {
    public static Integer busRent(List<Integer> parsedValue) {
        // 1. Sort secara descending sebuah list collection

        Collections.sort(parsedValue, Collections.reverseOrder());

        // 2. Gunakan while karena case nilai pembatasnya tidak pasti (berubah)

        int i = 0;
        int j = parsedValue.size() - 1;

        int result = 0;

        while (i <= j) {

            if (parsedValue.get(i) + parsedValue.get(j) <= 4) { // membandingkan dari depan dan belakang
                j--; // bila memenuhi syarat, maka keluarga yang dibelakang bergabung ke dalam bus
            }

            i++; // keluarga yang di depan bergabung ke dalam bus
            result++; // jumlah bus minimal bertambah 1
        }

        return result;

    }
}
