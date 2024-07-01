# Online Recharge Application - Java Full Stack Project

## Overview
RechargeApp is a full-stack web application designed to provide users with an easy and convenient way to recharge their mobile phones and send money to others. Built using Java for the backend and various web technologies for the frontend, this project aims to demonstrate a comprehensive approach to building a modern web application.

## Features
1. **User Authentication**: Secure login and logout functionality.
2. **Profile Management**: Users can view and update their profile information.
3. **Mobile Recharge**: Allows users to recharge their mobile phones by entering their mobile number, selecting a service provider, and specifying the recharge amount.
4. **Send Money**: Users can send money to others by entering the recipient's mobile number and the amount to be sent.
5. **Dashboard**: A central place for users to access different functionalities like profile management, recharging, and sending money.

## Technologies Used
### Frontend
- HTML5: Structure of the web pages.
- CSS3: Styling of the web pages.
- Bootstrap 5.3.3: Responsive and modern UI components.

### Backend
- Java: Core backend programming language.
- JSP (JavaServer Pages): Server-side rendering of web pages.
- Servlets: Handling user requests and business logic.
- JDBC: Database connectivity.
- SQL: Database management.

### Tools
- Maven: Project build and dependency management.
- Git: Version control system.
- GitHub: Code repository hosting.

## Getting Started

### Prerequisites
1. Java Development Kit (JDK)
2. Eclipse IDE
3. Apache Tomcat Server
4. Oracle SQL Database
5. Git

### Installation
1. **Clone the Repository**:
    ```sh
    git clone https://github.com/your-username/rechargeApp.git
    cd rechargeApp
    ```

2. **Set Up Database**:
    - Create a SQL database named `register` and `Transaction`.
    - Execute the SQL scripts in the `resources` directory to set up the necessary tables.

3. **Configure Database Connection**:
    - Update the application.properties file with your SQL database credentials.

4. **Build the Project**:
    ```sh
    mvn clean install
    ```

5. **Deploy on a Server**:
    - Use a servlet container like Apache Tomcat to deploy the WAR file generated in the `target` directory.

## Running the Application
1. Start your servlet container (e.g., Apache Tomcat).
2. Access the application at [http://localhost:8080/rechargeApp](http://localhost:8080/rechargeApp).

## Usage
1. **Sign Up/Login**: Create an account or log in with existing credentials.
2. **Profile Management**: View and update your profile.
3. **Mobile Recharge**: Navigate to the recharge page and complete a mobile recharge.
4. **Send Money**: Navigate to the send money page and complete a transaction.
5. **Dashboard**: Use the dashboard to navigate between different functionalities.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## Acknowledgments
- Thanks to the open-source community for the tools and resources that made this project possible.
- Special thanks to the developers and contributors of the libraries and frameworks used in this project.
