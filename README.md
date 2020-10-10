# R6TabAPI4j
R6 API mit Stats in Java (Derzeit nur Support von UPlay Accounts)

Benutzung:

Definierung der API:
``R6ApiImpl api = new R6Api();``

ProfilePlayer:
```ProfilePlayer pp = api.getProfilePlayerByName("Bugisoft2100");
ProfilePlayer pp = api.getProfilePlayerById("07e50400-de3f-4583-b03f-8417bac9c35b");```

Player:
``Player p = api.getPlayerByProfile(pp);``
