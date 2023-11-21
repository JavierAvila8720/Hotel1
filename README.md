# mgn-reservation-poli

La hotel chain will need to design an API that allows it to communicate with tools and solutions that have experience with hotel reservations and a large number of users. Therefore, the solution is to propose an API that has the logic for hotel chain reservations, and several operations will be defined. These include querying rooms, where each room will have a status. Additionally, there will be an operation to reserve a room, which will handle making reservations and will request data such as name, last name, room number, hotel name, and city. There will also be operations for modifying and deleting reservations.

Installation guide: After configuring the containers, apply the following commands and follow the flow.

mvn clean install -DskipTests

docker build .

docker-compose up




