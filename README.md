# Car Maintenance Tracker

A full-stack web application for tracking vehicle information, mileage, maintenance history, service intervals, and modifications.

Built with Java and Spring Boot as a personal project to develop experience with full-stack web development, databases, testing, and software engineering practices.

## Features

### Current

* Add and manage vehicles
* Store vehicle year, make, model, mileage, and VIN
* Validate vehicle data before storage
* Associate vehicles with individual users

### Planned

* Maintenance and service history
* Maintenance intervals and upcoming service reminders
* Vehicle modifications and parts tracking
* User authentication and authorization
* Personalized vehicle dashboards

## Tech Stack

**Backend:** Java 21, Spring Boot, Spring Data JPA, Hibernate
**Database:** H2, PostgreSQL *(planned)*
**Frontend:** HTML, CSS, JavaScript, Thymeleaf
**Tools:** Maven, Git, GitHub, IntelliJ IDEA/VSCode

## Architecture

The application uses a layered Spring Boot architecture:

```text
Client → Controller → Service → Repository → Database
```

Users can own multiple vehicles, with vehicle data and business logic managed through the service and repository layers.

## Getting Started

### Prerequisites

* Java 21
* Git

Clone the repository:

```bash
git clone https://github.com/Hien-TueNguyen/CarMaintenanceTracker.git
cd CarMaintenanceTracker
```

Run the application:

```bash
./mvnw spring-boot:run
```

The application runs at `http://localhost:8080`.

## Roadmap

* [x] Vehicle entity and persistence
* [x] Vehicle validation
* [x] User-to-vehicle relationship
* [ ] Vehicle management UI
* [ ] Maintenance records
* [ ] Service interval tracking
* [ ] Modifications and parts
* [ ] User authentication and authorization
* [ ] PostgreSQL integration
* [ ] Automated testing
* [ ] CI/CD
* [ ] Production deployment

## Project Status

**In development.** The current focus is building the core vehicle management functionality before expanding into maintenance tracking and user-facing features.
