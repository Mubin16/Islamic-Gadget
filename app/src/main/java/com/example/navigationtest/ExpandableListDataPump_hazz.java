package com.example.navigationtest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump_hazz {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();

        List<String> Kalima = new ArrayList<>();
       Kalima.add("demo");
        List<String> sunnah = new ArrayList<>();
       sunnah.add("1. নিয়ত করা\n" +
               "2.বিসমিল্লাহ্ বলে ওযু শুরু করা।\n" +
               "3.হাতের আঙ্গুল খিলাল করা।\n" +
               "4.উভয় হাত কবজি পর্যন্ত ধৌত করা।\n" +
               "5.মিসওয়াক করা।\n" +
               "6.তিনবার কুলি করা।\n" +
               "7.তিনবার নাকে পানি দেয়া।\n" +
               "8.সম্পূর্ন মুখ মন্ডল তিনবার ধৌত করা।\n" +
               "9.উভয় হাতের কনুইসহ তিনবার ধৌত করা।\n" +
               "10.,সমস্ত মাথা একবার মাসেহ করা।\n" +
               "11.,টাখনু সহ উভয় পা তিবার ধৌত করা।\n" +
               "12.পায়ের আঙ্গুল খিলাল করা।\n" +
               "13.এক অঙ্গ শুকানোর পূর্বে অন্য অঙ্গ ধৌত করা।\n" +
               "14.ধারাবাহিকতা বজায় রেখে ওযুর কাজ গুলো সম্পূর্ন করা।\n");

        List<String> Ozudua = new ArrayList<>();

        Ozudua.add(
                "বাংলা উচ্চারণঃ\n" +
                        "\n" +
                "আলহামদুলিল্লাহি আলা দ্বীন-ই ইসলাম\n" +
                "আলইসলামু-হাক্কু, ওল কুফরে বাতীলুন\n" +
                "ওল ইসলামু নূরুন, ওল কুফরে জুল্বমাত \n");
        List<String> Others = new ArrayList<>();

        Others.add("ওযু ভঙ্গের কারণ সমূহ :\n" +
                "\n"+
                "১.পায়খানা প্রস্রাবের রাস্তা দিয়া কোন কিছু বের হওয়া\n" +
                "২. মুখ ভরে বমি হওয়া\n" +
                "৩. শরীরের কোন জায়গা হতে রক্ত, পুঁজ বা পানি বের হয়ে গড়িয়ে পড়া\n" +
                "৪. থুথুর সাথে রক্তের ভাগ সমান বা বেশি হওয়া\n" +
                "৫. চিৎ বা কাত হয়ে হেলান দিয়ে ঘুম যাওয়া\n" +
                "৬. পাগল, মাতাল, অচেতন হওয়া এবং\n" +
                "৭. নামাযে উচ্চস্বরে হাসা।\n");
        List<String> Taiamun = new ArrayList<>();

        Taiamun.add("সর্বপ্রথম তায়াম্মুমের\n" +
                "\n"+
                "(১) নিয়ত করে নেবে,তারপর\n"+
                "(২) উভয় হাত জমিনে উপর মেরে একবার সমস্ত মুখ মণ্ডল মুছে নিবে।\n" +
                "(৩) পুনরায় জমিনে হাত মেরে উভয় হাত কনুই পর্যন্ত মুছবে।\n");

        expandableListDetail.put("Four Faraz in Ozu", Kalima);
        expandableListDetail.put("Sunnah", sunnah);
        expandableListDetail.put("Taiamun", Taiamun);
        expandableListDetail.put("Ozu er Dua", Ozudua);
        expandableListDetail.put("Others", Others);



        return expandableListDetail;
    }
}
