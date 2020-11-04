package com.example.navigationtest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump_dua {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();

        List<String> ihram = new ArrayList<>();
       ihram.add("A man in the state of ihram must not tie any knots or wear any stitched items.\n" +
               "\n"+
               " Sandals and flip flops must not be stitched either and should allow the ankle and\n " +
               "\n"+
               "back of foot to be exposed (some other schools of thought also agree that the front of \n" +
               "\n"+
               "the foot must be shown as well). Whilst in the state of ihram, a Muslim must not use any \n" +
               "\n"+
               "scents on the body or on the robes. If the robe has been fouled by najas (نَجَس dirty) material\n" +
               "\n"+
               " or has been wiped, rubbed or touched by scented liquids (intentionally), then a new iḥrām \n" +
               "\n"+
               "clothing must be worn, or the Umrah or Hajj will be invalid. During ihram, women must have their\n" +
               "\n"+
               " faces uncovered; they are forbidden to wear the Burqa or Niqab. However, the Hijab or Dupatta is \n" +
               "\n"+
               "obligatory.[1] There is also no gender segregation during the Hajj. Unlike in mosques, men and women\n" +
               "\n"+
               " pray together, not just in the same area but also on the same prayer line. This is to remind everyone\n" +
               "\n"+
               " that on the Day of Judgment, both men and women will be standing together, side by side, in the same rows.[2]");
        List<String> mina1 = new ArrayList<>();
       mina1.add("");

        List<String> arafat= new ArrayList<>();

       arafat.add(
                "বাংলা উচ্চারণঃ\n" +
                        "\n" +
                "আলহামদুলিল্লাহি আলা দ্বীন-ই ইসলাম\n" +
                "আলইসলামু-হাক্কু, ওল কুফরে বাতীলুন\n" +
                "ওল ইসলামু নূরুন, ওল কুফরে জুল্বমাত \n");
        List<String> Muzdalifa = new ArrayList<>();

       Muzdalifa.add("ওযু ভঙ্গের কারণ সমূহ :\n" +
                "\n"+
                "১.পায়খানা প্রস্রাবের রাস্তা দিয়া কোন কিছু বের হওয়া\n" +
                "২. মুখ ভরে বমি হওয়া\n" +
                "৩. শরীরের কোন জায়গা হতে রক্ত, পুঁজ বা পানি বের হয়ে গড়িয়ে পড়া\n" +
                "৪. থুথুর সাথে রক্তের ভাগ সমান বা বেশি হওয়া\n" +
                "৫. চিৎ বা কাত হয়ে হেলান দিয়ে ঘুম যাওয়া\n" +
                "৬. পাগল, মাতাল, অচেতন হওয়া এবং\n" +
                "৭. নামাযে উচ্চস্বরে হাসা।\n");
        List<String> pilar = new ArrayList<>();

        pilar.add("সর্বপ্রথম তায়াম্মুমের\n" +
                "\n"+
                "(১) নিয়ত করে নেবে,তারপর\n"+
                "(২) উভয় হাত জমিনে উপর মেরে একবার সমস্ত মুখ মণ্ডল মুছে নিবে।\n" +
                "(৩) পুনরায় জমিনে হাত মেরে উভয় হাত কনুই পর্যন্ত মুছবে।\n");

        List<String> Mina2 = new ArrayList<>();

       Mina2.add("সর্বপ্রথম তায়াম্মুমের\n" +
                "\n"+
                "(১) নিয়ত করে নেবে,তারপর\n"+
                "(২) উভয় হাত জমিনে উপর মেরে একবার সমস্ত মুখ মণ্ডল মুছে নিবে।\n" +
                "(৩) পুনরায় জমিনে হাত মেরে উভয় হাত কনুই পর্যন্ত মুছবে।\n");

        expandableListDetail.put("Enter ihram(The Sacred state)", ihram);
        expandableListDetail.put("Head to Mina,a sprawling tent city", mina1);
        expandableListDetail.put("Spend the day at Arafat", arafat);
        expandableListDetail.put("Collect pebbles at Muzdalifah", Muzdalifa);
        expandableListDetail.put("Throw stone at the pillars", pilar);
        expandableListDetail.put("Final days at Mina", Mina2);



        return expandableListDetail;
    }
}
