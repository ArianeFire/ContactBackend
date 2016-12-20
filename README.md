# ContactBackend

This project is based on SpringBoot J2EE technology, it implement a simple Contact Application Backend for pratice purpose.

The project consists of 4 package containing code sources namely:

**1- _com.ensao.mobilecloud.contact_ : **
Contains the entry point of the application (Application.java), which will allow to configure the web container, discover the controller, connect the controller to the dispatcher.

**2- _com.ensao.mobilecloud.contact.client_ : **
It contains the services to implement, it is essentially interfaces for adding and recover Contact Information. This class also contains annotations of the Retrofit library allowing access to client-side contact service. (The latter will be used to test the service).

**3- _com.ensao.mobilecloud.contact.controller_ :**
It contains the controller that intercept queries and perform actions consequences.

**4- _com.ensao.mobilecloud.contact.repository_ : **
This contains the deposits, an interface for communication with the database using JPA.

And secondly we have a test folder.
