# G-SCHOOL
##  G-SCHOOL - secondary school management application

### the automatic clock
```java
 horloge.setText(
           DateFormat.getDateTimeInstance().format(new Date())
         );
         Timer t = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              horloge.setText(
                 DateFormat.getDateTimeInstance().format(new Date())
              );
            }
         });
         t.setRepeats(true);
         t.setCoalesce(true);
         t.setInitialDelay(0);
         t.start();
            
```
note that `horloge` is a Jlabel just placed below the G-SCHOOL title

<img src="MyApp1.png" width="100%">

<img src="MyApp2.png" width="100%">

# menu 

<img src="MyApp3.png" width="100%">

# Accueil

<img src="MyApp4.png" width="100%">

# Inscription

<img src="MyApp5.png" width="100%">

# Database

```sql
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Inscription" (
	"ID"	INTEGER,
	"Noms"	TEXT,
	"DateNaissance"	TEXT,
	
```
