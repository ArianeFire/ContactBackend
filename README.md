# ContactBackend

The project consists of a share of 4 paquettages containing code sources namely:

-com.ensao.mobilecloud.contact: contains the entry point of the application (Application.java), which will allow to configure the web container, discover the controller, connect the controller to the dispatcher.

-com.ensao.mobilecloud.contact.client: it contains the service implementer, it is essentially interfaces for adding and contact recovery. This class also contains annotations of the Retrofit library allowing access to client-side contact service. (The latter will be used to test the service).

-com.ensao.mobilecloud.contact.controller: it contains the controller that intercept queries and perform actions consequences.

-com.ensao.mobilecloud.contact.repository: this contains the deposits, an interface for communication with the database using JPA.

And secondly we have a test folder.
