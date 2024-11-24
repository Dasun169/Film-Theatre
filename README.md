# 🎥 Film Theatre Online Booking System  

Welcome to the **Film Theatre Online Booking System**, a robust and user-friendly platform for seamless movie ticket booking. This project integrates modern technologies for both server-side and client-side to ensure a smooth and interactive experience.  

---

## 🌟 Key Features  
- **Real-time Movie Search**: Enables users to search and book tickets with up-to-date information.  
- **Dynamic Data Retrieval**: Fetches movie data seamlessly from the database for a responsive interface.  
- **User-Friendly Interface**: A polished frontend for effortless navigation and bookings.  

---

## 💻 Technology Stack  

### **Frontend**  
- **HTML**  
- **CSS**  
- **JavaScript**  
  - **jsPDF**: Generate downloadable PDFs.  
  - **html2canvas**: Capture screenshots of content.  
  - **QRCode.js**: Generate QR codes for bookings.  

### **Backend**  
- **Java Spring Boot**  
  - **Spring MVC**: For building the web application.  
  - **Spring Data JPA**: For database operations.  
  - **Spring Security**: For secure user authentication and authorization.  

### **Database**  
- **MySQL**  

---

## 🚀 Features in Detail  
1. **Dynamic Search**: Real-time movie search with interactive filters.   
2. **PDF and QR Code Integration**: Automatically generate PDFs and QR codes for confirmed tickets.  

---

## 🛠️ Setup and Installation  

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/Dasun169/Film-Theatre.git
   cd Film-Theatre
2. **Backend Setup**
- **Open the project in your IDE (e.g., IntelliJ IDEA or Eclipse).**
- **Configure the application.properties file with your MySQL credentials:**
  ```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
- **Run the Spring Boot application.**
3. **Database Setup**
- **Create a new MySQL database.**
- **Run the provided SQL scripts to create the required tables and insert initial data.**
4. **Frontend Setup**
- **Open the movies.html file in your browser.**
- **Ensure that the frontend and backend are correctly linked for dynamic data retrieval.**

## 📂 Repository Structure
  ```bash
  Film-Theatre/
├── src/                         # Backend source code
│   ├── main/
│   │   ├── java/                # Java source files
│   │   ├── resources/           # Application properties and static resources
│   ├── test/                    # Test files
├── static/                      # Frontend files (HTML, CSS, JavaScript)
├── README.md                    # Project documentation
└── application.properties       # Backend configuration file
```

## 🔗 Project Links
- **GitHub Repository:** [Film-Theatre](https://github.com/Dasun169/Film-Theatre.git) 
- **Linkedin Post:** https://www.linkedin.com/posts/dasun-navindu-987857292_film-theatre-online-booking-system-activity-7266436152897744896-iIdc?utm_source=share&utm_medium=member_android


