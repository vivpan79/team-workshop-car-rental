To register a car with its plate number, use the following url

http://localhost:8080/car/register

To register availability of a car from date/time, to date/time, rental price per hour, use the following url

http://localhost:8080/availability/car/ABC123/register/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}/rate/{pricePerHour}

To search for available cars to rent from date/time, to date/time, maximum rental price per hour, go to sample url below

http://localhost:8080/availability/car/{numberPlate}/check/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}/maxrate/{pricePerHour}

To register a Customer to rent a car, use the following url

http://localhost:8080/customer/register

To book a car from date/time, to date/time, user id, car id, use the following url

http://localhost:8080/booking/car/{numberPlate}/register/find/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}/for/{userName}

To check booked cars from date/time, to date/time go to sample url below

http://localhost:8080/booking/find/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}

To check number of booked cars per hour from date, to date go to sample url below

http://localhost:8080/booking/frequency/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}

To check total payment of booked from date, to date go to sample url below

http://localhost:8080/booking/payments/from/{yyyy-MM-dd’T’HH:mm}/to/{yyyy-MM-dd’T’HH:mm}

To access swagger-ui go to following url

http://localhost:8080/swagger-ui/#/product-controller/

To access the database using h2 console go to following url

http://localhost:8080/h2-console/

