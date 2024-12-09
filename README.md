# Easy Stay  

## Overview  
**Easy Stay** is a hotel service management system designed to streamline hotel operations and enhance guest experiences. The system allows customers to book various services while enabling managers to handle, approve, or reject requests efficiently. Integrations like Google Maps for vehicle location selection and an email notification system for communication improve functionality and user satisfaction.

---

## Features  

### Core Functionalities  
1. **User Roles and Management**:  
   - **Customer**: Book services, select vehicle pickup locations, and provide feedback.  
   - **Hotel Admin**: Oversees the entire hotel ecosystem, manages staff coordination, guest satisfaction, and operational analytics.  
   - **Managers**: Approve/reject service requests and manage specific services.  
     - **Vehicle Contractor**: Manages transportation, including vehicle availability and bookings.  
     - **Gaming In-Charge**: Handles operations and reservations for gaming facilities.  
     - **Pool In-Charge**: Manages pool usage, safety protocols, and maintenance.  
     - **Food Manager**: Oversees food and beverage orders, ensuring prompt preparation and delivery, and approves/rejects food requests.  
     - **Laundry Manager**: Manages laundry requests, ensures timely pickup, cleaning, and delivery of items.  
     - **Janitor**: Handles room cleaning and maintenance requests.  
     - **Shopping Manager**: Manages in-house shopping operations, including inventory and guest order fulfillment.  
     - **Parking Manager**: Manages parking space reservations and availability.

---

## Enterprises and Organizations  

### Enterprises  
- **Transportation**:  
  - **Supports vehicle bookings for airport transfers, local travel, and customized guest transportation services.**  

- **Enjoyments**:  
  - **Gaming Facility**: Offers access to gaming areas, such as arcades or board games.  
  - **Pool Facility**: Manages pool usage, slot reservations, and maintenance schedules.  

- **Food & Beverages**:  
  - **Enables guests to access a digital menu and order meals for in-room dining or restaurant service.**  

- **Homekeeping**:  
  - **Laundry Facility**: Manages guest laundry requests and delivery.  
  - **Room Cleaning**: Oversees room cleaning and common area maintenance.  

- **Shopping**:  
  - **Provides an in-house shopping platform where guests can browse and order products for room delivery.**  

### Organizations  
- **Vehicle Booking Organization**:  
  - **Manages transportation requests from guests, ensuring timely bookings and availability of vehicles.**  

- **Gaming Facility Management**:  
  - **Handles guest reservations and ensures smooth operation of recreational activities.**  

- **Pool Facility Organization**:  
  - **Oversees the pool's scheduling, safety compliance, and cleanliness.**  

- **Menu and Food Services**:  
  - **Manages food and beverage orders from guests, from preparation to delivery.**  

- **Laundry Services**:  
  - **Handles laundry requests and coordinates the delivery of clean items to guest rooms.**  

- **Room Cleaning Services**:  
  - **Manages cleaning schedules and assigns tasks to janitorial staff for timely service.**  

- **In-House Shop Organization**:  
  - **Manages the inventory and operations of the hotel’s in-house shopping services.**  

- **Parking Facility Management**:  
  - **Oversees the allocation of parking spaces for guests.**  

---

## Cross Requests  

1. **Cross-Enterprise Request**  
   - **Housekeeping (Laundry Facility)** and **Recreation (Pool Facility)**:  
     - A towel and clothes request is sent, demonstrating coordination between two different enterprise domains.  

2. **Cross-Organization Request**  
   - **Parking Facility Management** and **Vehicle Booking Organization**:  
     - A parking request is sent to allocate spaces for vehicles, ensuring smooth communication between different hotel service organizations.

---

## Advanced Features  
- **Google Maps Integration**:  
   - Customers can select a pickup location for vehicles directly on the map during the booking process, improving accuracy and user experience.  

- **Email Notification System**:  
   - Automatically notifies customers via email when their booking request is approved or rejected by the manager, ensuring seamless communication.

---

## High-Level Architecture

The high-level architecture includes various components such as:

- **User Interface**: Where customers can make requests.
- **Service Management Modules**: For handling different services (e.g., food, pool, laundry).
- **Request & Approval System**: For managing requests sent from customers to relevant managers.
- **Notification System**: For sending email notifications to customers.
- **Google Maps Integration**: For vehicle pick-up location selection.

## Files Attached

- **EasyStay-Revolutionizing-Hotel-Management.pptx**: Presentation for EasyStay project.
- **Project Proposal.docx**: Detailed project proposal document.
- **UML class diagram.pdf**: UML class diagram for system components and relationships.
- **High Level Component Diagram.pdf**: High-level component diagram of the system.
- **README.md**: This README file with project details.

## Libraries & Technologies Used

- **javax (JavaMail API)**: Used for sending email notifications to customers regarding their bookings and requests.
- **JCalendar**: Integrated for managing dates in the user interface, specifically for scheduling services and reservations.
- **DB40**: Used for database management and storage, ensuring smooth data handling and query execution.


## Team Members  

- **Rahul Patil** (002308778)  
- **Kanishk Singh** (002052790)  
- **Rushang Dalal** (002053714)  
- **Sushant Joshi** (002322090)
