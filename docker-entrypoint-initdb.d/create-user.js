db.createUser(
    {
        user: "mynewuser",
        pwd: "myuser123",
        roles: [ "readWrite", "dbAdmin" ]
    }
);