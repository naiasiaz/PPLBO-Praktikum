# Spring Boot Microservices Project

## 📌 **Perkenalan**

NIM: 221524052  
Nama: Naia Siti Az-zahra  
Tugas Mata Kuliah PPLBO - Praktikum

Proyek ini merupakan implementasi tutorial Spring Boot Microservices dari YouTube Programming Techie. Teknologi yang digunakan diantaranya MongoDB, MySQL, Docker, Flyway, Spring Boot, Kafka, dan Resilience4J.
Link YouTube Playlist Proyek: [https://www.youtube.com/watch?v=NpdG3lmKJ5g&list=PLSVW22jAG8pDeU80nDzbUgr8qqzEMppi8&ab_channel=ProgrammingTechie](https://www.youtube.com/watch?v=NpdG3lmKJ5g&list=PLSVW22jAG8pDeU80nDzbUgr8qqzEMppi8&ab_channel=ProgrammingTechie)

## 📂 **Struktur Proyek**

Proyek ini terdiri dari beberapa layanan mikro yang diatur dalam direktori terpisah:

- `inventory-service`: Layanan untuk mengelola inventaris produk.
- `order-service`: Layanan untuk mengelola pesanan.
- `product-service`: Layanan untuk mengelola produk.

## 🔧 **Teknologi yang Digunakan**

- **Spring Boot**: Framework untuk membangun aplikasi Java berbasis Spring.
- **MongoDB**: Database NoSQL yang digunakan oleh `product-service-sabil`.
- **MySQL**: Database relasional yang digunakan oleh `inventory-service` dan `order-service`.
- **Docker**: Platform untuk mengembangkan, mengirim, dan menjalankan aplikasi dalam kontainer.
- **Flyway**: Alat untuk migrasi database.
- **Kafka**: Platform streaming untuk membangun pipeline data real-time.
- **Resilience4J**: Library untuk membangun aplikasi yang tangguh dan fault-tolerant.
