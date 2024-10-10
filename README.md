# G-SCHOOL
G-SCHOOL - secondary school management application

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