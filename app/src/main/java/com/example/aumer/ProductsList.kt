package com.example.aumer

data class ProductsList(var UUID: String,var titleProduct: String, var priceProduct: String, var imageProduct: Int,var galleryProduct: ArrayList<Int>)
val products : ArrayList<ProductsList> = arrayListOf(
    ProductsList("1","มะพร้าวลูกเกรดพรีเมี่ยมคัดพิเศษจากฟาร์ม","180 บาท/3ลูก",R.drawable.product_1,arrayListOf<Int>(R.drawable.product_1,R.drawable.product_2,R.drawable.product_3,R.drawable.product_4)),
    ProductsList("2","น้ำมะพร้าวสดจากมะพร้าวคัดพิเศษ","1,200 บาท/เดือน",R.drawable.product_2,arrayListOf<Int>(R.drawable.product_2,R.drawable.product_2)),
    ProductsList("3","น้ำกะทิสดจากมะพร้าวคัดพิเศษ","780 บาท/เดือน",R.drawable.product_3,arrayListOf<Int>(R.drawable.product_3,R.drawable.product_3)),
    ProductsList("4","น้ำมันมะพร้าวจากมะพร้าวเกรดพรีเมี่ยมของ","880 บาท/เดือน",R.drawable.product_4,arrayListOf<Int>(R.drawable.product_4,R.drawable.product_4)),
    ProductsList("5","โลชั่นจากมะพร้าวสุดพรีเมี่ยม","1,400 บาท/เดือน",R.drawable.product_5,arrayListOf<Int>(R.drawable.product_5,R.drawable.product_5)))