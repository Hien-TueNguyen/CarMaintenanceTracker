# Car Maintenance Tracker

A full-stack web application that helps users track their vehicles, mileage, maintenance history, service intervals, and modifications in one place.

Built to simplify vehicle maintenance management while demonstrating full-stack development with Java, Spring Boot, SQL, and modern web technologies.

## Features

* Manage multiple vehicles per user
* Track vehicle information, mileage, and VIN
* Validate vehicle data before storage
* Record maintenance and service history *(planned)*
* Track maintenance intervals and upcoming services *(planned)*
* Track vehicle modifications and parts *(planned)*
* User authentication and personalized dashboards *(planned)*

## Tech Stack

**Backend:** Java 21, Spring Boot, Spring Data JPA, Hibernate
**Database:** H2, PostgreSQL
**Frontend:** HTML, CSS, JavaScript, Thymeleaf
**Tools:** Maven, Git, GitHub, IntelliJ IDEA

## Installation

**Prerequisites:** Java 21, Git, and Maven

```bash
git clone https://github.com/Hien-TueNguyen/CarMaintenanceTracker.git
cd CarMaintenanceTracker
mvn clean install
mvn spring-boot:run
```

The application runs by default at `localhost:8080`.

## Usage

Users can add vehicles to their account and manage information for each vehicle.

```text
1997 Mazda Miata
├── Mileage: 152,000
├── Maintenance History
├── Service Intervals
└── Modifications
```

The application follows a standard layered Spring Boot architecture:

```text
Client → Controller → Service → Repository → Database
```

## Contributing

Contributions, bug reports, and feature suggestions are welcome. Fork the repository, create a feature branch, and submit a pull request.

## License

No license has been added yet.

## Project Status

**In Development** — Maintenance tracking, authentication, PostgreSQL integration, and the frontend dashboard are currently being developed.

