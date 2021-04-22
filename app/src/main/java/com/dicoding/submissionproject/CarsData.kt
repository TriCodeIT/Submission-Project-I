package com.dicoding.submissionproject

object CarsData {
    private val carTypes = arrayOf(
        "Kijang Innova Limited Edition",
        "New Calya",
        "New Avanza",
        "New Vellfire",
        "New Alphard",
        "New Vios",
        "All New Corolla Altis",
        "All New Camry",
        "New Fortuner TRD Sportivo",
        "All New Rush"
    )

    private val carDetails = arrayOf(
        "Toyota Kijang Innova tersedia dalam pilihan mesin 16 Petrol dan 8 Diesel di Indonesia MPV baru dari Toyota hadir dalam 24 varian. Kijang Innova tersedia dengan transmisi Manual and Otomatis tergantung variannya. Juga, tergantung pilihan dan jenis bahan bakar, konsumsi BBM Kijang Innova mencapai 12.4 kmpl,13 kmpl,8.6 kmpl untuk perkotaan, 12.7 kmpl,13.6 kmpl,18 kmpl saat menjelajah perjalanan luar kota. Kijang Innova adalah MPV 7 seater dengan panjang 4735 mm, lebar 1830 mm, wheelbase 2750 mm.",

       "Toyota Calya tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Toyota hadir dalam 6 varian. Bicara soal spesifikasi mesin Toyota Calya, ini ditenagai dua pilihan mesin Bensin berkapasitas 1197 cc. Calya tersedia dengan transmisi Manual and Otomatis tergantung variannya. Calya adalah MPV 7 seater dengan panjang 4070 mm, lebar 1655 mm, wheelbase 2525 mm. serta ground clearance 180 mm.",

        "Toyota Avanza tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Toyota hadir dalam 8 varian. Bicara soal spesifikasi mesin Toyota Avanza, ini ditenagai dua pilihan mesin Bensin berkapasitas 1329 cc. Avanza tersedia dengan transmisi Manual and Otomatis tergantung variannya. Juga, tergantung pilihan dan jenis bahan bakar, konsumsi BBM Avanza mencapai 14.8 kmpl untuk perkotaan. Avanza adalah MPV 7 seater dengan panjang 4190 mm, lebar 1660 mm, wheelbase 2655 mm. serta ground clearance 200 mm.",

        "Toyota Vellfire tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Toyota hadir dalam 2 varian. Bicara soal spesifikasi mesin Toyota Vellfire, ini ditenagai dua pilihan mesin Bensin berkapasitas 2494 cc. Vellfire tersedia dengan transmisi CVT tergantung variannya. Vellfire adalah MPV 7 seater dengan panjang 4935 mm, lebar 1850 mm, wheelbase 3000 mm. serta ground clearance 160 mm.",

        "Toyota Alphard tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Toyota hadir dalam 6 varian. Bicara soal spesifikasi mesin Toyota Alphard, ini ditenagai dua pilihan mesin Bensin berkapasitas 3456 cc. Alphard tersedia dengan transmisi CVT and Otomatis tergantung variannya. Alphard adalah MPV 7 seater dengan panjang 4945 mm, lebar 1850 mm, wheelbase 3000 mm. serta ground clearance 160 mm.",

        "Toyota Vios tersedia dalam pilihan mesin Bensin di Indonesia Sedan baru dari Toyota hadir dalam 6 varian. Bicara soal spesifikasi mesin Toyota Vios, ini ditenagai dua pilihan mesin Bensin berkapasitas 1496 cc. Vios tersedia dengan transmisi Manual and CVT tergantung variannya. Vios adalah Sedan 5 seater dengan panjang 4425 mm, lebar 1730 mm, wheelbase 2550 mm.",

        "Toyota Corolla Altis Hybrid AT adalah 5 Kursi Sedan yang tersedia seharga Rp 592,5 Juta di Indonesia. Mobil ini tersedia dalam 7 warna dan CVT opsi transmisi di Indonesia. Mobil ini memiliki ground clearance 155 mm dengan dimensi sebagai berikut: 4630 mm L x 1780 mm W x 1455 mm H. Lebih dari 12 pengguna telah memberikan penilaian untuk Corolla Altis Hybrid AT berdasarkan fitur, jarak tempuh, kenyamanan tempat duduk dan kinerja mesin. Cicilan bulanan terendah dimulai dari Rp 106,93 Juta (selama 60 bulan). Kompetitor terdekat Corolla Altis Hybrid AT adalah Civic 1.5L Turbo, City E CVT, Camry 2.5 G dan 3 Sedan Skyactive-G 2.0.",

        "Toyota Camry tersedia dalam pilihan mesin Bensin di Indonesia Sedan baru dari Toyota hadir dalam 4 varian. Bicara soal spesifikasi mesin Toyota Camry, ini ditenagai dua pilihan mesin Bensin berkapasitas 2494 cc. Camry tersedia dengan transmisi Otomatis tergantung variannya. Camry adalah Sedan 5 seater dengan panjang 4885 mm, lebar 1840 mm, wheelbase 2825 mm.",

        "Toyota Fortuner tersedia dalam pilihan mesin Diesel di Indonesia SUV baru dari Toyota hadir dalam 12 varian. Bicara soal spesifikasi mesin Toyota Fortuner, ini ditenagai dua pilihan mesin Diesel berkapasitas 2393 cc. Fortuner tersedia dengan transmisi Manual and Otomatis tergantung variannya. Fortuner adalah SUV 7 seater dengan panjang 4795 mm, lebar 1855 mm, wheelbase 2745 mm.",

        "Toyota Rush tersedia dalam pilihan mesin Bensin di Indonesia SUV baru dari Toyota hadir dalam 8 varian. Bicara soal spesifikasi mesin Toyota Rush, ini ditenagai dua pilihan mesin Bensin berkapasitas 1496 cc. Rush tersedia dengan transmisi Manual and Otomatis tergantung variannya. Rush adalah SUV 7 seater dengan panjang 4435 mm, lebar 1695 mm, wheelbase 2685 mm."
    )

    private val carImages = intArrayOf(
        R.drawable.mpv_innova,

        R.drawable.mpv_calya,

        R.drawable.mpv_avanza,

        R.drawable.mpv_velfire,

        R.drawable.mpv_alphard,

        R.drawable.sedan_vios,

        R.drawable.hybrid_corolla,

        R.drawable.sedan_camry,

        R.drawable.mpv_fortuner,

        R.drawable.suv_rush
    )

    val listData: ArrayList<Car>
        get() {
            val list = arrayListOf<Car>()

            for (position in carTypes.indices) {
                val car = Car()
                car.type = carTypes[position]
                car.product_details = carDetails[position]
                car.photo = carImages[position]
                list.add(car)
            }
            return list
        }
}